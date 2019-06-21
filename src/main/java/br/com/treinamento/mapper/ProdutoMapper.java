package br.com.treinamento.mapper;

import br.com.treinamento.model.Produto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProdutoMapper{

  Produto recuperar(int id);

  List<Produto> recuperarTodos();

  int inserirProduto(Produto produto);
}