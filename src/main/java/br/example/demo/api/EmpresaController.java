package br.example.demo.api;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.example.demo.domain.dao.EmpresaDAO;
import br.example.demo.service.model.Empresa;

@Controller
@RequestMapping("empresa/")
public class EmpresaController {
    
    private final EmpresaDAO empresaDAO;


    public EmpresaController(EmpresaDAO empresaDAO) {
        this.empresaDAO = empresaDAO;
    }

    @GetMapping("/index")
    public String index(Model model){

        model.addAttribute("empresa", new Empresa());
        return "empresaForm";
    }

    @GetMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void add(@Validated Empresa empresa){
        empresaDAO.save(empresa);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Empresa>> getAll(){
      return ResponseEntity.ok(empresaDAO.findAll()) ;
    }

    @GetMapping("/verifica")
    public ResponseEntity<List<String>> verifica(){
        return ResponseEntity.ok(empresaDAO.findAll().stream().map(e -> e.getCnpj()).collect(Collectors.toList()));
    }

    @GetMapping("/complexidade")
    public boolean complexidadeCiclomatica(){

      List<Empresa> empresas = empresaDAO.findAll();

      boolean teste = false;

            if(empresas.size() == 1)
                teste = true;
        
            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;
                
            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;
                
            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;
               
            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;
                
            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;
               
            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;
                
            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;
                
            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            if(empresas.size() == 1)
                teste = true;

            return teste;
    }

    }