package br.com.treinamento.service;

import br.com.treinamento.model.Produto;

import java.util.List;

public interface IProdutoService {

    Produto recuperar(int id) throws Exception;
    List<Produto> recuperarTodos() throws Exception;
    boolean inserirProduto(Produto produto) throws Exception;
    boolean atualizarProduto(Produto produto) throws Exception;
    boolean excluirProduto(int id) throws Exception;
}
