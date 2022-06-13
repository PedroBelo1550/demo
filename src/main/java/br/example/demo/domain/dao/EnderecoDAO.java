package br.example.demo.domain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.example.demo.service.interfaces.EnderecoRepository;
import br.example.demo.service.model.Endereco;

@Repository
public class EnderecoDAO {
    

    private final EnderecoRepository enderecoRepository;

    public EnderecoDAO(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco save(Endereco e){
        return  enderecoRepository.save(e);
      }
  
      public List<Endereco> findAll(){
          return enderecoRepository.findAll();
      }
  
      public void delete(long id){
         enderecoRepository.deleteById(id);
      }



    

}
