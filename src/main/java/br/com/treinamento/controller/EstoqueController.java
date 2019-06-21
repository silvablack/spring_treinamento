package br.com.treinamento.controller;

import br.com.treinamento.model.Estoque;
import br.com.treinamento.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    EstoqueService estoqueService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity recuperarTodos(){
        try{
            List<Estoque> ps = estoqueService.recuperarTodos();
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity recuperar(@PathVariable("id") int id){
        try{
            Estoque ps = estoqueService.recuperar(id);
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity inserirEstoque(@RequestBody Estoque estoque){
        try{
            estoqueService.inserir(estoque);
            return new ResponseEntity(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity atualizarEstoque (@RequestBody Estoque estoque){
        try{
            estoqueService.atualizar(estoque);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public ResponseEntity excluirEstoque(@RequestParam int id){
        try{
            estoqueService.excluir(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
