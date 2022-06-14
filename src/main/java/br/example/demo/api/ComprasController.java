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

import br.example.demo.domain.dao.ComprasDAO;
import br.example.demo.service.model.Compras;

@Controller
@RequestMapping("compras")
public class ComprasController {
    

private ComprasDAO comprasDAO;

public ComprasController(ComprasDAO comprasDAO) {
    this.comprasDAO = comprasDAO;
}


@GetMapping("/index")
public String index(Model model){

    model.addAttribute("compras", new Compras());
    return "comprasForm";
}

@GetMapping("/add")
@ResponseStatus(HttpStatus.OK)
public void add(@Validated Compras compras){
    comprasDAO.save(compras);
}

@GetMapping("/list")
public ResponseEntity<List<Compras>> getAll(){
  return ResponseEntity.ok(comprasDAO.findAll()) ;
}




}
