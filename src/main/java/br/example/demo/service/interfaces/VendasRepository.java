package br.example.demo.service.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Long>{

    @Override
    default List<Vendas> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Vendas getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default Optional<Vendas> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends Vendas> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
