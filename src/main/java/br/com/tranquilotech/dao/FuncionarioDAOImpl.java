package br.com.tranquilotech.dao;

import br.com.tranquilotech.entity.Funcionario;
import br.com.tranquilotech.exceptions.CommitException;
import br.com.tranquilotech.exceptions.FuncionarioNaoEncontradoException;
import br.com.tranquilotech.service.SqlGenerator;

import javax.persistence.EntityManager;

public class FuncionarioDAOImpl implements  FuncionarioDAO {
    EntityManager em;
    SqlGenerator sqlGenerator;

    public FuncionarioDAOImpl(EntityManager em, SqlGenerator sqlGenerator){
        this.em = em;
        this.sqlGenerator = sqlGenerator;
    }
    @Override
    public void cadastrarFuncionario(Funcionario f) throws FuncionarioNaoEncontradoException {
        try {
            sqlGenerator.gerarInsert(f);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        em.persist(f);
    }

    @Override
    public void atualizarDadoFuncionario(Funcionario f) throws FuncionarioNaoEncontradoException{
        try {
            sqlGenerator.gerarUpdate(f);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        buscarFuncionario(f.getId());
        em.merge(f);
    }

    @Override
    public void removerFuncionario(int id) {
        try {
            Funcionario f = buscarFuncionario(id);
            sqlGenerator.gerarDelete(f);
            em.remove(f);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Funcionario buscarFuncionario(int id) throws FuncionarioNaoEncontradoException{
        Funcionario f = em.find(Funcionario.class, id);
        if(f ==null)
           throw new FuncionarioNaoEncontradoException("Funcionario nao encontrado");
        try {
            sqlGenerator.buscarPorId(f);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        return f;
    }

    @Override
    public void commit() throws CommitException {
        try{
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new CommitException();
        }
    }
}
