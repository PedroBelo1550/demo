package br.example.demo.domain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.example.demo.service.interfaces.EmpresaRepository;
import br.example.demo.service.model.Empresa;

@Repository
public class EmpresaDAO {
    

    private final EmpresaRepository empresaRepository;

    public EmpresaDAO(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    
    public Empresa save(Empresa e){
      return  empresaRepository.save(e);
    }

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public void delete(String id){
       empresaRepository.deleteById(id);
    }

    


}
