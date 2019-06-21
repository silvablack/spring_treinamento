package br.com.treinamento.mapper;

import br.com.treinamento.model.Filial;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("default, deleteMe")
public class FilialMapperTest {

  @Autowired
  private FilialMapper filialMapper;

  @Test
  public void recuperar() {
    Filial filial = filialMapper.recuperar(1);
    assertEquals(Long.valueOf(1), filial.getId());
  }
}