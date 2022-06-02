package br.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("empresa/")
public class EmpresaController {
    

    @GetMapping("/index")
    public String index(Model model){

        model.addAttribute("empresa", new Empresa());
        return "empresaForm";
    }

    @GetMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void add(@Validated Empresa empresa){
        
        System.out.println(empresa.getCnpj());

    }

}
