package br.example.demo.domain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.example.demo.service.interfaces.FornecedorRepository;
import br.example.demo.service.model.Fornecedor;

@Repository
public class FornecedorDAO {

    private final FornecedorRepository fornecedorRepository;

    public FornecedorDAO(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public Fornecedor save(Fornecedor e) {
        return fornecedorRepository.save(e);
    }

    public List<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }

    public void delete(String id) {
        fornecedorRepository.deleteById(id);
    }

}
