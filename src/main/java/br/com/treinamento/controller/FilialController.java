package br.com.treinamento.controller;

import br.com.treinamento.model.Filial;
import br.com.treinamento.service.FilialService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/filial")
public class FilialController {

    @Autowired
    FilialService filialService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity recuperarTodos(){
        try{
            List<Filial> ps = filialService.recuperarTodos();
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity recuperar(@PathVariable("id") int id){
        try{
            Filial ps = filialService.recuperar(id);
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity inserirFilial(@RequestBody Filial filial){
        try{
            filialService.inserirFilial(filial);
            return new ResponseEntity(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity atualizarFilial(@RequestBody Filial filial){
        try{
            filialService.atualizarFilial(filial);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public ResponseEntity excluirFilial(@RequestParam int id){
        try{
            filialService.excluirFilial(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
