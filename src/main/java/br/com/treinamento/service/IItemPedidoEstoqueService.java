package br.com.treinamento.service;

import br.com.treinamento.model.ItemPedidoEstoque;

import java.util.List;

public interface IItemPedidoEstoqueService {

    ItemPedidoEstoque recuperar(int id) throws Exception;
    List<ItemPedidoEstoque> recuperarTodos() throws Exception;
    boolean inserir(ItemPedidoEstoque ItemPedidoEstoque) throws Exception;
    boolean atualizar(ItemPedidoEstoque ItemPedidoEstoque) throws Exception;
    boolean excluir(int id) throws Exception;
}
