package br.com.tranquilotech.view;

import br.com.tranquilotech.entity.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCadastro {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("ALexandre", 50, 20.00);

        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("FUNCIONARIO_ORACLE");

        EntityManager em = fabrica.createEntityManager();

        em.persist(funcionario);

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Funcionário cadastrado! ");
    }
}
