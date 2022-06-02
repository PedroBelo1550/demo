package br.example.demo.service.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {
    
}
