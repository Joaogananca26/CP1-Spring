package br.com.tranquilotech.view;

import br.com.tranquilotech.entity.Funcionario;
import br.com.tranquilotech.exceptions.FuncionarioNaoEncontradoException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestePesquisarFuncionario {
    public static void main(String[] args) throws FuncionarioNaoEncontradoException {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("FUNCIONARIO_ORACLE");

        EntityManager em = fabrica.createEntityManager();
        Funcionario funcionario = em.find(Funcionario.class, 23);

        System.out.println(funcionario.getNome());

        System.out.println("Funcionário pesquisado!");

        funcionario.setNome("Roger guedes");

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Funcionário atualizado!");
    }
}
