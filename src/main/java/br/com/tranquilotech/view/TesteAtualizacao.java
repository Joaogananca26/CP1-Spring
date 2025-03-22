package br.com.tranquilotech.view;

import br.com.tranquilotech.entity.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteAtualizacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rogério", 106, 25.00);

        funcionario.setId(5);

        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("FUNCIONARIO_ORACLE");

        EntityManager em = fabrica.createEntityManager();

        Funcionario copia = em.merge(funcionario);

        em.getTransaction().begin();
        em.getTransaction().commit();

        copia.setNome("Thales Magno");

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Funcionário atualizado!");
    }
}
