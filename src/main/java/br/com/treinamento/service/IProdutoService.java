package br.com.treinamento.service;

import br.com.treinamento.model.Produto;

import java.util.List;

public interface IProdutoService {

    Produto recuperar(int id) throws Exception;
    List<Produto> recuperarTodos() throws Exception;
    boolean inserirProduto(Produto produto) throws Exception;
    void atualizarProduto(Produto produto) throws Exception;
    void excluirProduto(int id) throws Exception;
}
