package br.example.demo.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.example.demo.domain.dao.ClienteDAO;
import br.example.demo.service.model.Cliente;
import br.example.demo.service.model.Endereco;

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
        model.addAttribute("endereco", new Endereco());
        return "clientesForm";
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public String add(@Validated Cliente cliente, @Validated Endereco endereco){


        System.out.println(endereco.getMunicipio());
        cliente.setEndereco(endereco);

        clienteDAO.save(cliente);

        return "clientesForm";
    }

    @GetMapping("/list")
    public ResponseEntity<List<Cliente>> getAll(){
      return ResponseEntity.ok(clienteDAO.findAll()) ;
    }

    
    
    
}
