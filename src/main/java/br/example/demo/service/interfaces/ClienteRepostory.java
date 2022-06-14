package br.example.demo.service.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Cliente;

public interface ClienteRepostory extends JpaRepository<Cliente, String> {


}
