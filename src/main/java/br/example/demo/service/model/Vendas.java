package br.example.demo.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vendas")
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="cpfCnpj")
    private Cliente cliente;

    private double valor;
    private double quant;
    private double descProd;
    private double observacao;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getQuant() {
        return quant;
    }
    public void setQuant(double quant) {
        this.quant = quant;
    }
    public double getDescProd() {
        return descProd;
    }
    public void setDescProd(double descProd) {
        this.descProd = descProd;
    }
    public double getObservacao() {
        return observacao;
    }
    public void setObservacao(double observacao) {
        this.observacao = observacao;
    }

    


}
