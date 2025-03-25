package br.com.tranquilotech.service;

import br.com.tranquilotech.annotations.Tabela;
import br.com.tranquilotech.entity.Funcionario;

public class SqlGenerator {
    Funcionario funcionario;

    public SqlGenerator(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void pesquisar() {
        Tabela anotacao = funcionario.getClass().getAnnotation(Tabela.class);
        System.out.println("SELECT * FROM " + anotacao.nome());
    }
}
