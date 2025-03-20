package br.com.tranquilotech.view;

import br.com.tranquilotech.dao.FuncionarioDAO;
import br.com.tranquilotech.dao.FuncionarioDAOImpl;
import br.com.tranquilotech.entity.Funcionario;
import br.com.tranquilotech.exceptions.CommitException;
import br.com.tranquilotech.exceptions.FuncionarioNaoEncontradoException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteDao {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

        EntityManager em = fabrica.createEntityManager();

        FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl(em);

        Funcionario funcionario1 = new Funcionario("Tranquilo", 106, 27.0);


        // Cadastrar funcionário
        try {
            funcionarioDAO.cadastrarFuncionario(funcionario1);
            funcionarioDAO.commit();
            System.out.println("Funcionário cadastrado");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        // Buscar funcionário
        try{
            Funcionario buscar = funcionarioDAO.buscarFuncionario(5);
            System.out.println(buscar.getNome());
        } catch (FuncionarioNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        // Atualizar funcionário
        try{
            funcionario1.setNome("TranquiloTech");
            funcionario1.setHorasTrabalhadas(90);
            funcionario1.setValorPagoHora(20.0);
            funcionarioDAO.atualizarDadoFuncionario(funcionario1);
            funcionarioDAO.commit();
            System.out.println("Funcionário atualizado! ");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Remover funcionário
        try{
            funcionarioDAO.removerFuncionario(10);
            funcionarioDAO.commit();
            System.out.println("Funcionário removido! ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        }
    }
