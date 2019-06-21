package br.com.treinamento.model;
import lombok.Data;

@Data
public class ItemPedidoEstoque {
    private Long id;
    private Produto produto;
    private PedidoEstoque pedido;
    private Integer quantidade;
}
