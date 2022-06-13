package br.example.demo.service.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {

    @Override
    default List<Fornecedor> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Fornecedor getById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Optional<Fornecedor> findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends Fornecedor> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }
    

    
}
