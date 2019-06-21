package br.com.treinamento.controller;

import br.com.treinamento.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.treinamento.model.Produto;

import java.util.List;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity recuperarTodos(){
        try{
            List<Produto> ps = produtoService.recuperarTodos();
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity recuperar(@PathVariable("id") int id){
        try{
            Produto ps = produtoService.recuperar(id);
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity inserirProduto(@RequestBody Produto produto){
        try{
            produtoService.inserirProduto(produto);
            return new ResponseEntity(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity atualizarProduto(@RequestBody Produto produto){
        try{
            produtoService.atualizarProduto(produto);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public ResponseEntity excluirProduto(@RequestParam int id){
        try{
            produtoService.excluirProduto(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
