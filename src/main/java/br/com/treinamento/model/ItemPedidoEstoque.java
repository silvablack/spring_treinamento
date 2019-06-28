package br.com.treinamento.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ItemPedidoEstoque {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private Produto produto;
    @Getter @Setter
    private PedidoEstoque pedido;
    @Getter @Setter
    private Integer quantidade;
}
