package br.example.demo.service.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.example.demo.service.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {

    @Override
    default List<Empresa> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Empresa getById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void deleteById(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default <S extends Empresa> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }
    

    
}
