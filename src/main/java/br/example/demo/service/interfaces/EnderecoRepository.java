package br.example.demo.service.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

       
}
