package br.com.tranquilotech.view;

import br.com.tranquilotech.entity.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteRemocao {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("FUNCIONARIO_ORACLE");

        EntityManager em = fabrica.createEntityManager();

        Funcionario funcionario = em.find(Funcionario.class, 5);

        em.remove(funcionario);

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Funcionário removido!");
    }
}
