package br.com.tranquilotech.view;

import javax.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("FUNCIONARIO_ORACLE");
    }
}
