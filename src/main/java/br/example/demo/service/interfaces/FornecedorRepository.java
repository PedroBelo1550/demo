package br.example.demo.service.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {


    
}
