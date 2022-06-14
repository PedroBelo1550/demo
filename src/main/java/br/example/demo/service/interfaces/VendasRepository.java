package br.example.demo.service.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Long>{
    
}
