package entidades;
// Generated 17/04/2013 10:28:10 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Peca generated by hbm2java
 */
public class Peca  implements java.io.Serializable {


     private Integer idPeca;
     private String descricao;
     private String marca;
     private BigDecimal precoCompra;
     private BigDecimal precoVenda;
     private Double quantidade;
     private boolean status;
     private Set pecaUsadas = new HashSet(0);

    public Peca() {
    }

	
    public Peca(String descricao, boolean status) {
        this.descricao = descricao;
        this.status = status;
    }

    public Peca(String descricao, String marca, BigDecimal precoCompra, BigDecimal precoVenda, Double quantidade, boolean status) {
        this.descricao = descricao;
        this.marca = marca;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
        this.status = status;
    }
    
    public Peca(String descricao, String marca, BigDecimal precoCompra, BigDecimal precoVenda, Double quantidade, boolean status, Set pecaUsadas) {
       this.descricao = descricao;
       this.marca = marca;
       this.precoCompra = precoCompra;
       this.precoVenda = precoVenda;
       this.quantidade = quantidade;
       this.status = status;
       this.pecaUsadas = pecaUsadas;
    }
   
    public Integer getIdPeca() {
        return this.idPeca;
    }
    
    public void setIdPeca(Integer idPeca) {
        this.idPeca = idPeca;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public BigDecimal getPrecoCompra() {
        return this.precoCompra;
    }
    
    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }
    public BigDecimal getPrecoVenda() {
        return this.precoVenda;
    }
    
    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }
    public Double getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Set getPecaUsadas() {
        return this.pecaUsadas;
    }
    
    public void setPecaUsadas(Set pecaUsadas) {
        this.pecaUsadas = pecaUsadas;
    }




}


