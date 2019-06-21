package br.com.treinamento.controller;

import br.com.treinamento.model.PedidoEstoque;
import br.com.treinamento.service.PedidoEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pedidoEstoque")
public class PedidoEstoqueController {

    @Autowired
    PedidoEstoqueService pedidoEstoqueService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity recuperarTodos(){
        try{
            List<PedidoEstoque> ps = pedidoEstoqueService.recuperarTodos();
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity recuperar(@PathVariable("id") int id){
        try{
            PedidoEstoque ps = pedidoEstoqueService.recuperar(id);
            return new ResponseEntity(ps, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity inserirPedidoEstoque(@RequestBody PedidoEstoque pedidoEstoque){
        try{
            pedidoEstoqueService.inserirPedidoEstoque(pedidoEstoque);
            return new ResponseEntity(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity atualizarPedidoEstoque (@RequestBody PedidoEstoque pedidoEstoque){
        try{
            pedidoEstoqueService.atualizarPedidoEstoque(pedidoEstoque);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public ResponseEntity excluirPedidoEstoque(@RequestParam int id){
        try{
            pedidoEstoqueService.excluirPedidoEstoque(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
