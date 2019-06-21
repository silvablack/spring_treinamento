package br.com.treinamento.service;

import br.com.treinamento.mapper.ProdutoMapper;
import br.com.treinamento.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService implements IProdutoService{

    @Autowired
    ProdutoMapper produtoMapper;

    @Override
    public Produto recuperar(int id) throws Exception{
        Produto produto;
        try{
            produto = produtoMapper.recuperar(id);
            if(produto != null){
                return produto;
            }
            throw new Exception("Produto não encontrado!");
        }catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Produto> recuperarTodos() throws Exception{
        List<Produto> produtos;
        try {
            produtos = produtoMapper.recuperarTodos();
            if(produtos != null) {
                return produtos;
            }
            throw new Exception("Nenhum produto encontrado!");
        }catch (Exception e){
            throw  e;
        }
    }

    @Override
    public boolean inserirProduto(Produto produto) throws Exception{
        boolean response;
        try{
            response = produtoMapper.inserirProduto(produto) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao inserir produto!");
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void atualizarProduto(Produto produto) throws Exception{

    }

    @Override
    public void excluirProduto(int id) throws Exception{

    }
}
