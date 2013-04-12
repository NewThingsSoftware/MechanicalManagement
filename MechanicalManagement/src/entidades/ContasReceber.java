package entidades;
// Generated 12/04/2013 13:39:36 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * ContasReceber generated by hbm2java
 */
public class ContasReceber  implements java.io.Serializable {


     private Integer idContasReceber;
     private OrdemServico ordemServico;
     private BigDecimal valorTotal;
     private Date dataPagamento;
     private Date dataVencimento;

    public ContasReceber() {
    }

	
    public ContasReceber(OrdemServico ordemServico, BigDecimal valorTotal, Date dataVencimento) {
        this.ordemServico = ordemServico;
        this.valorTotal = valorTotal;
        this.dataVencimento = dataVencimento;
    }
    public ContasReceber(OrdemServico ordemServico, BigDecimal valorTotal, Date dataPagamento, Date dataVencimento) {
       this.ordemServico = ordemServico;
       this.valorTotal = valorTotal;
       this.dataPagamento = dataPagamento;
       this.dataVencimento = dataVencimento;
    }
   
    public Integer getIdContasReceber() {
        return this.idContasReceber;
    }
    
    public void setIdContasReceber(Integer idContasReceber) {
        this.idContasReceber = idContasReceber;
    }
    public OrdemServico getOrdemServico() {
        return this.ordemServico;
    }
    
    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
    public BigDecimal getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Date getDataPagamento() {
        return this.dataPagamento;
    }
    
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public Date getDataVencimento() {
        return this.dataVencimento;
    }
    
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }




}


