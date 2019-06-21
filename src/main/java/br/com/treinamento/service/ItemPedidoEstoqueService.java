package br.com.treinamento.service;

import br.com.treinamento.mapper.ItemPedidoEstoqueMapper;
import br.com.treinamento.model.ItemPedidoEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoEstoqueService implements IItemPedidoEstoqueService{

    @Autowired
    ItemPedidoEstoqueMapper itemPedidoEstoqueMapper;

    @Override
    public ItemPedidoEstoque recuperar(int id) throws Exception{
        ItemPedidoEstoque itemPedidoEstoque;
        try{
            itemPedidoEstoque = itemPedidoEstoqueMapper.recuperar(id);
            if(itemPedidoEstoque != null){
                return itemPedidoEstoque;
            }
            throw new Exception("Item Pedido Estoque não encontrado!");
        }catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<ItemPedidoEstoque> recuperarTodos() throws Exception{
        List<ItemPedidoEstoque> itensPedidoEstoque;
        try {
            itensPedidoEstoque = itemPedidoEstoqueMapper.recuperarTodos();
            if(itensPedidoEstoque != null) {
                return itensPedidoEstoque;
            }
            throw new Exception("Nenhum Item Pedido Estoque encontrado!");
        }catch (Exception e){
            throw  e;
        }
    }

    @Override
    public boolean inserir(ItemPedidoEstoque itemPedidoEstoque) throws Exception{
        boolean response;
        try{
            response = itemPedidoEstoqueMapper.inserirItemPedidoEstoque(itemPedidoEstoque) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao inserir Item Pedido Estoque!");
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean atualizar(ItemPedidoEstoque itemPedidoEstoque) throws Exception{
        boolean response;
        try{
            response = itemPedidoEstoqueMapper.atualizarItemPedidoEstoque(itemPedidoEstoque) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao atualizar Item Pedido Estoque!");
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean excluir(int id) throws Exception{
        boolean response;
        try{
            response = itemPedidoEstoqueMapper.excluirItemPedidoEstoque(id) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao excluir Item Pedido Estoque!");
        }catch (Exception e){
            throw e;
        }
    }
}
