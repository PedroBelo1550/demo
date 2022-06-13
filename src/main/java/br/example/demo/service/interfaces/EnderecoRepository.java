package br.example.demo.service.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Override
    default List<Endereco> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Endereco getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default <S extends Endereco> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
