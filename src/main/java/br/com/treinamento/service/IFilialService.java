package br.com.treinamento.service;

import br.com.treinamento.model.Filial;

import java.util.List;

public interface IFilialService {

    Filial recuperar(int id) throws Exception;
    List<Filial> recuperarTodos() throws Exception;
    boolean inserirFilial(Filial filial) throws Exception;
    boolean atualizarFilial(Filial filial) throws Exception;
    boolean excluirFilial(int id) throws Exception;
}
