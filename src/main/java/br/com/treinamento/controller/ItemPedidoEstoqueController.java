package br.com.treinamento.controller;

import br.com.treinamento.model.ItemPedidoEstoque;
import br.com.treinamento.service.ItemPedidoEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/itemPedidoEstoque")
public class ItemPedidoEstoqueController {

    @Autowired
    ItemPedidoEstoqueService itemPedidoEstoqueService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity recuperarTodos(){
        try{
            List<ItemPedidoEstoque> ps = itemPedidoEstoqueService.recuperarTodos();
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity recuperar(@PathVariable("id") int id){
        try{
            ItemPedidoEstoque ps = itemPedidoEstoqueService.recuperar(id);
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity inserirItemPedidoEstoque(@RequestBody ItemPedidoEstoque itemPedidoEstoque){
        try{
            itemPedidoEstoqueService.inserir(itemPedidoEstoque);
            return new ResponseEntity(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity atualizarItemPedidoEstoque (@RequestBody ItemPedidoEstoque itemPedidoEstoque){
        try{
            itemPedidoEstoqueService.atualizar(itemPedidoEstoque);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public ResponseEntity excluirItemPedidoEstoque(@RequestParam int id){
        try{
            itemPedidoEstoqueService.excluir(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
