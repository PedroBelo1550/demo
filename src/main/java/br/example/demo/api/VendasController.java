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

import br.example.demo.domain.dao.VendasDAO;
import br.example.demo.service.model.Vendas;

@Controller
@RequestMapping("vendas")
public class VendasController {
    

private VendasDAO vendasDAO;

public VendasController(VendasDAO vendasDAO) {
    this.vendasDAO = vendasDAO;
}


@GetMapping("/index")
public String index(Model model){

    model.addAttribute("vendas", new Vendas());
    return "vendasForm";
}

@GetMapping("/add")
@ResponseStatus(HttpStatus.OK)
public void add(@Validated Vendas vendas){
    vendasDAO.save(vendas);
}

@GetMapping("/list")
public ResponseEntity<List<Vendas>> getAll(){
  return ResponseEntity.ok(vendasDAO.findAll()) ;
}




}
