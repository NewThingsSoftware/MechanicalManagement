/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ctb03
 */
@Entity
@Table(name = "peca_usada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PecaUsada.findAll", query = "SELECT p FROM PecaUsada p"),
    @NamedQuery(name = "PecaUsada.findByIdPecaUsada", query = "SELECT p FROM PecaUsada p WHERE p.pecaUsadaPK.idPecaUsada = :idPecaUsada"),
    @NamedQuery(name = "PecaUsada.findByIdOrdemServico", query = "SELECT p FROM PecaUsada p WHERE p.pecaUsadaPK.idOrdemServico = :idOrdemServico"),
    @NamedQuery(name = "PecaUsada.findByIdPeca", query = "SELECT p FROM PecaUsada p WHERE p.pecaUsadaPK.idPeca = :idPeca"),
    @NamedQuery(name = "PecaUsada.findByQuantidade", query = "SELECT p FROM PecaUsada p WHERE p.quantidade = :quantidade")})
public class PecaUsada implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PecaUsadaPK pecaUsadaPK;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private double quantidade;
    @JoinColumn(name = "id_ordem_servico", referencedColumnName = "id_ordem_servico", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrdemServico ordemServico;
    @JoinColumn(name = "id_peca", referencedColumnName = "id_peca", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Peca peca;

    public PecaUsada() {
    }

    public PecaUsada(PecaUsadaPK pecaUsadaPK) {
        this.pecaUsadaPK = pecaUsadaPK;
    }

    public PecaUsada(PecaUsadaPK pecaUsadaPK, double quantidade) {
        this.pecaUsadaPK = pecaUsadaPK;
        this.quantidade = quantidade;
    }

    public PecaUsada(int idPecaUsada, int idOrdemServico, int idPeca) {
        this.pecaUsadaPK = new PecaUsadaPK(idPecaUsada, idOrdemServico, idPeca);
    }

    public PecaUsadaPK getPecaUsadaPK() {
        return pecaUsadaPK;
    }

    public void setPecaUsadaPK(PecaUsadaPK pecaUsadaPK) {
        this.pecaUsadaPK = pecaUsadaPK;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pecaUsadaPK != null ? pecaUsadaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PecaUsada)) {
            return false;
        }
        PecaUsada other = (PecaUsada) object;
        if ((this.pecaUsadaPK == null && other.pecaUsadaPK != null) || (this.pecaUsadaPK != null && !this.pecaUsadaPK.equals(other.pecaUsadaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesJPA.PecaUsada[ pecaUsadaPK=" + pecaUsadaPK + " ]";
    }
    
}
