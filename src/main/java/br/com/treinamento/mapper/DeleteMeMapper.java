package br.com.treinamento.mapper;

import br.com.treinamento.model.DeleteMe;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DeleteMeMapper {

  DeleteMe recuperar();

}