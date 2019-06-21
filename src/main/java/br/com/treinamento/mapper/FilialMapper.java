package br.com.treinamento.mapper;

import br.com.treinamento.model.Filial;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FilialMapper {

  Filial recuperar(int id);

  List<Filial> recuperarTodos();

  int inserirFilial(Filial filial);

  int atualizarFilial(Filial filial);

  int excluirFilial(int id);
}