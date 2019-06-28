package br.com.treinamento.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Estoque {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private Integer saldo;
    @Getter @Setter
    private Produto produto;
    @Getter @Setter
    private Filial filial;
}
