package br.example.demo.service.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Compras;

public interface ComprasRepository extends JpaRepository<Compras,Long>  {

       
    
}
