package br.com.tranquilotech.dao;

import br.com.tranquilotech.entity.Funcionario;
import br.com.tranquilotech.exceptions.CommitException;
import br.com.tranquilotech.exceptions.FuncionarioNaoEncontradoException;

public interface  FuncionarioDAO {

    public void cadastrarFuncionario(Funcionario f) throws FuncionarioNaoEncontradoException;

    public void atualizarDadoFuncionario(Funcionario f) throws FuncionarioNaoEncontradoException;

    public void removerFuncionario(int id);

    Funcionario buscarFuncionario(int id) throws FuncionarioNaoEncontradoException;

    void commit() throws CommitException;
}
