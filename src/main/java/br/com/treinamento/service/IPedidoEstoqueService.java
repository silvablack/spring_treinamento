package br.com.treinamento.service;

import br.com.treinamento.model.PedidoEstoque;

import java.util.List;

public interface IPedidoEstoqueService {

    PedidoEstoque recuperar(int id) throws Exception;
    List<PedidoEstoque> recuperarTodos() throws Exception;
    boolean inserirPedidoEstoque(PedidoEstoque pedidoEstoque) throws Exception;
    boolean inserirPedidoEstoqueItens(PedidoEstoque pedidoEstoque) throws Exception;
    boolean atualizarPedidoEstoque(PedidoEstoque pedidoEstoque) throws Exception;
    boolean excluirPedidoEstoque(int id) throws Exception;
}
