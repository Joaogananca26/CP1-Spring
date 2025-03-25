package br.com.tranquilotech.service;

import br.com.tranquilotech.annotations.Coluna;
import br.com.tranquilotech.annotations.Tabela;
import br.com.tranquilotech.entity.Funcionario;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class SqlGenerator {

    public String retornaNomeTabela(Funcionario funcionario) {
        Tabela anotacaoTabela = funcionario.getClass().getAnnotation(Tabela.class);
        return anotacaoTabela.nome();
    }

    public void buscarPorId(Funcionario funcionario) throws NoSuchFieldException {
        Field field = funcionario.getClass().getDeclaredField("id");
        Coluna colunaId = field.getAnnotation(Coluna.class);
        System.out.println("SELECT * FROM " + retornaNomeTabela(funcionario) + " WHERE id = " + colunaId);
    }

    public void gerarInsert(Funcionario funcionario) throws IllegalAccessException {
        List<String> colunas = new ArrayList<>();
        List<String> valores = new ArrayList<>();

        Field[] fields = funcionario.getClass().getDeclaredFields();
        for (Field field : fields) {
            Coluna coluna = field.getAnnotation(Coluna.class);
            if (coluna != null) {
                field.setAccessible(true);
                Object valor = field.get(funcionario);
                colunas.add(coluna.nome());
                valores.add(valor != null ? valor.toString() : "NULL");
            }
        }

        String colunasStr = String.join(", ", colunas);
        String valoresStr = String.join(", ", valores);

        System.out.println("INSERT INTO " + retornaNomeTabela(funcionario) + " (" + colunasStr + ") VALUES (" + valoresStr + ")");
    }

    public void gerarUpdate(Funcionario funcionario) throws IllegalAccessException {
        StringBuilder set = new StringBuilder();
        Field[] fields = funcionario.getClass().getDeclaredFields();
        String whereClause = "";

        for (Field field : fields) {
            Coluna coluna = field.getAnnotation(Coluna.class);
            if (coluna != null) {
                field.setAccessible(true);
                Object valor = field.get(funcionario);

                if (field.getName().equals("id")) {
                    whereClause = coluna.nome() + " = " + valor;
                } else {
                    set.append(coluna.nome()).append(" = '").append(valor).append("', ");
                }
            }
        }

        System.out.println("UPDATE " + retornaNomeTabela(funcionario) + " SET " + set.substring(0, set.length() - 2) + " WHERE " + whereClause);
    }

    public void gerarDelete(Funcionario funcionario) throws NoSuchFieldException, IllegalAccessException {
        Field field = funcionario.getClass().getDeclaredField("id");
        Coluna colunaId = field.getAnnotation(Coluna.class);
        field.setAccessible(true);
        Object valor = field.get(funcionario);

        System.out.println("DELETE FROM " + retornaNomeTabela(funcionario) + " WHERE " + colunaId.nome() + " = " + valor);
    }
}
