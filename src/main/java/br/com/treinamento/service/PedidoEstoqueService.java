package br.com.treinamento.service;

import br.com.treinamento.mapper.PedidoEstoqueMapper;
import br.com.treinamento.model.PedidoEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoEstoqueService implements IPedidoEstoqueService{

    @Autowired
    PedidoEstoqueMapper pedidoEstoqueMapper;

    @Override
    public PedidoEstoque recuperar(int id) throws Exception{
        PedidoEstoque pedidoEstoque;
        try{
            pedidoEstoque = pedidoEstoqueMapper.recuperar(id);
            if(pedidoEstoque != null){
                return pedidoEstoque;
            }
            throw new Exception("Pedido Estoque não encontrado!");
        }catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<PedidoEstoque> recuperarTodos() throws Exception{
        List<PedidoEstoque> pedidoEstoques;
        try {
            pedidoEstoques = pedidoEstoqueMapper.recuperarTodos();
            if(pedidoEstoques != null) {
                return pedidoEstoques;
            }
            throw new Exception("Nenhum Pedido Estoque encontrado!");
        }catch (Exception e){
            throw  e;
        }
    }

    @Override
    public boolean inserirPedidoEstoque(PedidoEstoque pedidoEstoque) throws Exception{
        boolean response;
        try{
            response = pedidoEstoqueMapper.inserirPedidoEstoque(pedidoEstoque) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao inserir Pedido Estoque!");
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean atualizarPedidoEstoque(PedidoEstoque pedidoEstoque) throws Exception{
        boolean response;
        try{
            response = pedidoEstoqueMapper.atualizarPedidoEstoque(pedidoEstoque) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao atualizar pedidoEstoque!");
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean excluirPedidoEstoque(int id) throws Exception{
        boolean response;
        try{
            response = pedidoEstoqueMapper.excluirPedidoEstoque(id) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao excluir pedidoEstoque!");
        }catch (Exception e){
            throw e;
        }
    }
}
