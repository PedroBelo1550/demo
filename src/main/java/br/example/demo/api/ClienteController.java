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

import br.example.demo.domain.dao.ClienteDAO;
import br.example.demo.service.model.Cliente;

@Controller
@RequestMapping("cliente/")
public class ClienteController {


    final ClienteDAO clienteDAO;

    public ClienteController(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }


    
    @GetMapping("/index")
    public String index(Model model){

        model.addAttribute("cliente", new Cliente());
        return "clienteForm";
    }

    @GetMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void add(@Validated Cliente cliente){
        clienteDAO.save(cliente);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Cliente>> getAll(){
      return ResponseEntity.ok(clienteDAO.findAll()) ;
    }

    
    
    
}
