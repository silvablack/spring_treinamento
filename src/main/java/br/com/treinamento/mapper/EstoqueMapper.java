package br.com.treinamento.mapper;

import br.com.treinamento.model.Estoque;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EstoqueMapper {

  Estoque recuperar(int id);

  List<Estoque> recuperarTodos();

  int inserirEstoque(Estoque estoque);

  int atualizarEstoque(Estoque estoque);

  int excluirEstoque(int id);
}