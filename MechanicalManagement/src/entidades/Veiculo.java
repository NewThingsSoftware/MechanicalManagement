package entidades;
// Generated 17/04/2013 10:28:10 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Veiculo generated by hbm2java
 */
public class Veiculo  implements java.io.Serializable {


     private Integer idVeiculo;
     private Cliente cliente;
     private String placa;
     private Integer ano;
     private String marca;
     private String modelo;
     private Integer km;
     private boolean status;
     private Set ordemServicos = new HashSet(0);

    public Veiculo() {
    }

	
    public Veiculo(Cliente cliente, String placa, String marca, String modelo, boolean status) {
        this.cliente = cliente;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.status = status;
    }

    public Veiculo(Cliente cliente, String placa, Integer ano, String marca, String modelo, Integer km, boolean status) {
        this.cliente = cliente;
        this.placa = placa;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.status = status;
    }
    
    public Veiculo(Cliente cliente, String placa, Integer ano, String marca, String modelo, Integer km, boolean status, Set ordemServicos) {
       this.cliente = cliente;
       this.placa = placa;
       this.ano = ano;
       this.marca = marca;
       this.modelo = modelo;
       this.km = km;
       this.status = status;
       this.ordemServicos = ordemServicos;
    }
   
    public Integer getIdVeiculo() {
        return this.idVeiculo;
    }
    
    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Integer getAno() {
        return this.ano;
    }
    
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getKm() {
        return this.km;
    }
    
    public void setKm(Integer km) {
        this.km = km;
    }
    public boolean isStatus() {
        return this.status;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Set getOrdemServicos() {
        return this.ordemServicos;
    }
    
    public void setOrdemServicos(Set ordemServicos) {
        this.ordemServicos = ordemServicos;
    }




}


