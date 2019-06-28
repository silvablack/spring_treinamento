package br.com.treinamento.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Produto {
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String descricao;
}
