package br.com.treinamento.service;

import br.com.treinamento.model.Estoque;

import java.util.List;

public interface IEstoqueService {

    Estoque recuperar(int id) throws Exception;
    List<Estoque> recuperarTodos() throws Exception;
    boolean inserir(Estoque estoque) throws Exception;
    boolean atualizar(Estoque estoque) throws Exception;
    boolean excluir(int id) throws Exception;
}
