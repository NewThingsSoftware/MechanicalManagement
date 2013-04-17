/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ctb03
 */
@Entity
@Table(name = "contas_receber")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContasReceber.findAll", query = "SELECT c FROM ContasReceber c"),
    @NamedQuery(name = "ContasReceber.findByIdContasReceber", query = "SELECT c FROM ContasReceber c WHERE c.idContasReceber = :idContasReceber"),
    @NamedQuery(name = "ContasReceber.findByValorTotal", query = "SELECT c FROM ContasReceber c WHERE c.valorTotal = :valorTotal"),
    @NamedQuery(name = "ContasReceber.findByDataPagamento", query = "SELECT c FROM ContasReceber c WHERE c.dataPagamento = :dataPagamento"),
    @NamedQuery(name = "ContasReceber.findByDataVencimento", query = "SELECT c FROM ContasReceber c WHERE c.dataVencimento = :dataVencimento")})
public class ContasReceber implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_contas_receber")
    private Integer idContasReceber;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    @Column(name = "data_pagamento")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @Basic(optional = false)
    @Column(name = "data_vencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @JoinColumn(name = "id_ordem_servico", referencedColumnName = "id_ordem_servico")
    @ManyToOne(optional = false)
    private OrdemServico idOrdemServico;

    public ContasReceber() {
    }

    public ContasReceber(Integer idContasReceber) {
        this.idContasReceber = idContasReceber;
    }

    public ContasReceber(Integer idContasReceber, BigDecimal valorTotal, Date dataVencimento) {
        this.idContasReceber = idContasReceber;
        this.valorTotal = valorTotal;
        this.dataVencimento = dataVencimento;
    }

    public Integer getIdContasReceber() {
        return idContasReceber;
    }

    public void setIdContasReceber(Integer idContasReceber) {
        this.idContasReceber = idContasReceber;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public OrdemServico getIdOrdemServico() {
        return idOrdemServico;
    }

    public void setIdOrdemServico(OrdemServico idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContasReceber != null ? idContasReceber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContasReceber)) {
            return false;
        }
        ContasReceber other = (ContasReceber) object;
        if ((this.idContasReceber == null && other.idContasReceber != null) || (this.idContasReceber != null && !this.idContasReceber.equals(other.idContasReceber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesJPA.ContasReceber[ idContasReceber=" + idContasReceber + " ]";
    }
    
}
