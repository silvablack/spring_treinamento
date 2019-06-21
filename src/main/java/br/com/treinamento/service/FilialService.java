package br.com.treinamento.service;

import br.com.treinamento.mapper.FilialMapper;
import br.com.treinamento.model.Filial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialService implements IFilialService{

    @Autowired
    FilialMapper FilialMapper;

    @Override
    public Filial recuperar(int id) throws Exception{
        Filial Filial;
        try{
            Filial = FilialMapper.recuperar(id);
            if(Filial != null){
                return Filial;
            }
            throw new Exception("Filial não encontrado!");
        }catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Filial> recuperarTodos() throws Exception{
        List<Filial> Filiais;
        try {
            Filiais = FilialMapper.recuperarTodos();
            if(Filiais != null) {
                return Filiais;
            }
            throw new Exception("Nenhum Filial encontrado!");
        }catch (Exception e){
            throw  e;
        }
    }

    @Override
    public boolean inserirFilial(Filial Filial) throws Exception{
        boolean response;
        try{
            response = FilialMapper.inserirFilial(Filial) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao inserir Filial!");
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean atualizarFilial(Filial Filial) throws Exception{
        boolean response;
        try{
            response = FilialMapper.updateFilial(Filial) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao atualizar Filial!");
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean excluirFilial(int id) throws Exception{
        boolean response;
        try{
            response = FilialMapper.excluirFilial(id) > 0;
            if(response){
                return response;
            }
            throw new Exception("Error ao excluir Filial!");
        }catch (Exception e){
            throw e;
        }
    }
}
