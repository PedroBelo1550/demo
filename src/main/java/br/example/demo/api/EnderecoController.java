package br.example.demo.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.example.demo.domain.dao.EnderecoDAO;
import br.example.demo.service.model.Endereco;

@Controller
@RequestMapping("endereco")
public class EnderecoController {

    
    private EnderecoDAO enderecoDAO;


    @GetMapping("/list")
    public ResponseEntity<List<Endereco>> getAll(){
      return ResponseEntity.ok(enderecoDAO.findAll()) ;
    }

}
