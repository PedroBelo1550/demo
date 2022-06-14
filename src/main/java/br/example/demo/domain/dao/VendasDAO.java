package br.example.demo.domain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.example.demo.service.interfaces.VendasRepository;
import br.example.demo.service.model.Vendas;

@Repository
public class VendasDAO {
    
    private final VendasRepository vendasRepository;

    public VendasDAO(VendasRepository vendasRepository) {
        this.vendasRepository = vendasRepository;
    }

    
    public Vendas save(Vendas e){
        return  vendasRepository.save(e);
      }
  
      public List<Vendas> findAll(){
          return vendasRepository.findAll();
      }
  
      public void delete(long id){
        vendasRepository.deleteById(id);
      }


}
