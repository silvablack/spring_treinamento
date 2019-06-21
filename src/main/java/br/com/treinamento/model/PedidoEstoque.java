package br.com.treinamento.model;
import lombok.Data;

import java.util.List;

@Data
public class PedidoEstoque {
    private Long id;
    private Integer tipo; // 0 = Saida & 1 = Entrada
    private List<ItemPedidoEstoque> itensPedidos;
}
