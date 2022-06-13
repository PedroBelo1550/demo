package br.example.demo.service.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoRepository, Long> {

    @Override
    default List<EnderecoRepository> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default EnderecoRepository getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default <S extends EnderecoRepository> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
