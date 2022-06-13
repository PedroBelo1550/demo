package br.example.demo.service.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Compras;

public interface ComprasRepository extends JpaRepository<Compras,Long>  {

    @Override
    default List<Compras> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Compras getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default <S extends Compras> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
