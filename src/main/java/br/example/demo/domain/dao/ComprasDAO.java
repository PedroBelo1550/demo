package br.example.demo.domain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.example.demo.service.interfaces.ComprasRepository;
import br.example.demo.service.model.Compras;

@Repository
public class ComprasDAO {
    
    private final ComprasRepository comprasRepository;

    public ComprasDAO(ComprasRepository comprasRepository) {
        this.comprasRepository = comprasRepository;
    }

    public Compras save(Compras e){
        return  comprasRepository.save(e);
      }
  
      public List<Compras> findAll(){
          return comprasRepository.findAll();
      }
  
      public void delete(long id){
         comprasRepository.deleteById(id);
      }


    
}
