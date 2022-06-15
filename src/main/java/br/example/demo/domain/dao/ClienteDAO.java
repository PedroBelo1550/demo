package br.example.demo.domain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.example.demo.service.interfaces.ClienteRepostory;
import br.example.demo.service.model.Cliente;

@Repository
public class ClienteDAO {
    

private final ClienteRepostory clienteRepostory;

public ClienteDAO(ClienteRepostory clienteRepostory) {
    this.clienteRepostory = clienteRepostory;
}

public Cliente save(Cliente e){
    
    return  clienteRepostory.save(e);
  }

  public List<Cliente> findAll(){
      return clienteRepostory.findAll();
  }

  public void delete(String id){
     clienteRepostory.deleteById(id);
  }

}
