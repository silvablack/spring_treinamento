package br.com.treinamento.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Filial {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String descricao;
    @Getter @Setter
    private String estado;
}
