package br.com.treinamento.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class PedidoEstoque {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private Integer tipo; // 0 = Saida & 1 = Entrada
    @Getter
    @Setter
    private List<ItemPedidoEstoque> itensPedidos;
}
