package entidades;
// Generated 17/04/2013 10:28:10 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OrdemServico generated by hbm2java
 */
public class OrdemServico  implements java.io.Serializable {


     private Integer idOrdemServico;
     private Veiculo veiculo;
     private Mecanico mecanico;
     private Date data;
     private String descricao;
     private char status;
     private BigDecimal valorMaoObra;
     private Set contasRecebers = new HashSet(0);
     private Set pecaUsadas = new HashSet(0);

    public OrdemServico() {
    }

	
    public OrdemServico(Veiculo veiculo, Mecanico mecanico, Date data) {
        this.veiculo = veiculo;
        this.mecanico = mecanico;
        this.data = data;
    }

    public OrdemServico(Veiculo veiculo, Mecanico mecanico, Date data, String descricao, char status, BigDecimal valorMaoObra) {
        this.veiculo = veiculo;
        this.mecanico = mecanico;
        this.data = data;
        this.descricao = descricao;
        this.status = status;
        this.valorMaoObra = valorMaoObra;
    }
    
    public OrdemServico(Veiculo veiculo, Mecanico mecanico, Date data, String descricao, char status, Set contasRecebers, Set pecaUsadas) {
       this.veiculo = veiculo;
       this.mecanico = mecanico;
       this.data = data;
       this.descricao = descricao;
       this.status = status;
       this.contasRecebers = contasRecebers;
       this.pecaUsadas = pecaUsadas;
    }
   
    public Integer getIdOrdemServico() {
        return this.idOrdemServico;
    }
    
    public void setIdOrdemServico(Integer idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }
    public Veiculo getVeiculo() {
        return this.veiculo;
    }
    
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Mecanico getMecanico() {
        return this.mecanico;
    }
    
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public char getStatus() {
        return this.status;
    }
    
    public void setStatus(char status) {
        this.status = status;
    }

    public BigDecimal getValorMaoObra() {
        return valorMaoObra;
    }

    public void setValorMaoObra(BigDecimal valorMaoObra) {
        this.valorMaoObra = valorMaoObra;
    }
    
    public Set getContasRecebers() {
        return this.contasRecebers;
    }
    
    public void setContasRecebers(Set contasRecebers) {
        this.contasRecebers = contasRecebers;
    }
    public Set getPecaUsadas() {
        return this.pecaUsadas;
    }
    
    public void setPecaUsadas(Set pecaUsadas) {
        this.pecaUsadas = pecaUsadas;
    }




}


