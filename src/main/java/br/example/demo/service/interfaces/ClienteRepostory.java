package br.example.demo.service.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Cliente;

public interface ClienteRepostory extends JpaRepository<Cliente, String> {

    @Override
    default List<Cliente> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Cliente getById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void deleteById(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default <S extends Cliente> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }
    

    
}
