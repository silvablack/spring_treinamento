package br.com.treinamento.mapper;

import br.com.treinamento.model.PedidoEstoque;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PedidoEstoqueMapper {

  PedidoEstoque recuperar(int id);

  List<PedidoEstoque> recuperarTodos();

  int inserirPedidoEstoque(PedidoEstoque pedidoEstoque);

  int atualizarPedidoEstoque(PedidoEstoque pedidoEstoque);

  int excluirPedidoEstoque(int id);
}