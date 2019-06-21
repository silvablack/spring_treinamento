package br.com.treinamento.mapper;

import br.com.treinamento.model.ItemPedidoEstoque;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ItemPedidoEstoqueMapper {

  ItemPedidoEstoque recuperar(int id);

  List<ItemPedidoEstoque> recuperarTodos();

  int inserirItemPedidoEstoque(ItemPedidoEstoque itemPedidoEstoque);

  int atualizarItemPedidoEstoque(ItemPedidoEstoque itemPedidoEstoque);

  int excluirItemPedidoEstoque(int id);
}