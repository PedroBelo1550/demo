package br.example.demo.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.example.demo.domain.dao.FornecedorDAO;
import br.example.demo.service.model.Fornecedor;

@Controller
@RequestMapping("fornecedor/")
public class FornecedorController {


    final FornecedorDAO fornecedorDAO;

    public FornecedorController(FornecedorDAO fornecedorDAO) {
        this.fornecedorDAO = fornecedorDAO;
    }


    
    @GetMapping("/index")
    public String index(Model model){

        model.addAttribute("fornecedor", new Fornecedor());
        return "fornecedorForm";
    }

    @GetMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void add(@Validated Fornecedor fornecedor){
        fornecedorDAO.save(fornecedor);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Fornecedor>> getAll(){
      return ResponseEntity.ok(fornecedorDAO.findAll()) ;
    }

    
    
    
}
