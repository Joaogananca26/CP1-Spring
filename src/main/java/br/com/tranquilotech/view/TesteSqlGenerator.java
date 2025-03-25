package br.com.tranquilotech.view;

import br.com.tranquilotech.entity.Funcionario;
import br.com.tranquilotech.service.SqlGenerator;

public class TesteSqlGenerator {
    public static void main(String[] args) {
        SqlGenerator sqlGenerator = new SqlGenerator();
        Funcionario funcionario = new Funcionario("Vitor", 1000, 10.0);

        try{
            sqlGenerator.buscarPorId(funcionario);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        try{
            sqlGenerator.gerarInsert(funcionario);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        try{
            sqlGenerator.gerarUpdate(funcionario);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        try{
            sqlGenerator.gerarDelete(funcionario);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
