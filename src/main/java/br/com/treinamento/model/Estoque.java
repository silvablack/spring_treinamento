package br.com.treinamento.model;

import lombok.Data;

@Data
public class Estoque {
    private Long id;
    private Integer saldo;
    private Produto produto;
    private Filial filial;
}
