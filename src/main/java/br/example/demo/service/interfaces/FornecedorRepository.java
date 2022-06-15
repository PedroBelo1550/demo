package br.example.demo.service.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {


    
}
