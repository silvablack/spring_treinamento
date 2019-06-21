package br.com.treinamento.service;

import br.com.treinamento.mapper.EstoqueMapper;
import br.com.treinamento.model.Estoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService implements IEstoqueService{

    @Autowired
    EstoqueMapper estoqueMapper;

    @Override
    public Estoque recuperar(int id) throws Exception{
        Estoque estoque;
        try{
            estoque = estoqueMapper.recuperar(id);
            if(estoque != null){
                return estoque;
            }
            throw new Exception("Estoque não encontrado!");
        }catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Estoque> recuperarTodos() throws Exception{
        List<Estoque> pedidoEstoques;
        try {
            pedidoEstoques = estoqueMapper.recuperarTodos();
            if(pedidoEstoques != null) {
                return pedidoEstoques;
            }
            throw new Exception("Nenhum Estoque encontrado!");
        }catch (Exception e){
            throw  e;
        }
    }

    @Override
    public boolean inserir(Estoque estoque) throws Exception{
        boolean response;
        try{
            response = estoqueMapper.inserirEstoque(estoque) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao inserir Estoque!");
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean atualizar(Estoque estoque) throws Exception{
        boolean response;
        try{
            response = estoqueMapper.atualizarEstoque(estoque) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao atualizar Estoque!");
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean excluir(int id) throws Exception{
        boolean response;
        try{
            response = estoqueMapper.excluirEstoque(id) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao excluir Estoque!");
        }catch (Exception e){
            throw e;
        }
    }
}
