/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ctb03
 */
@Embeddable
public class PecaUsadaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_peca_usada")
    private int idPecaUsada;
    @Basic(optional = false)
    @Column(name = "id_ordem_servico")
    private int idOrdemServico;
    @Basic(optional = false)
    @Column(name = "id_peca")
    private int idPeca;

    public PecaUsadaPK() {
    }

    public PecaUsadaPK(int idPecaUsada, int idOrdemServico, int idPeca) {
        this.idPecaUsada = idPecaUsada;
        this.idOrdemServico = idOrdemServico;
        this.idPeca = idPeca;
    }

    public int getIdPecaUsada() {
        return idPecaUsada;
    }

    public void setIdPecaUsada(int idPecaUsada) {
        this.idPecaUsada = idPecaUsada;
    }

    public int getIdOrdemServico() {
        return idOrdemServico;
    }

    public void setIdOrdemServico(int idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    public int getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(int idPeca) {
        this.idPeca = idPeca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPecaUsada;
        hash += (int) idOrdemServico;
        hash += (int) idPeca;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PecaUsadaPK)) {
            return false;
        }
        PecaUsadaPK other = (PecaUsadaPK) object;
        if (this.idPecaUsada != other.idPecaUsada) {
            return false;
        }
        if (this.idOrdemServico != other.idOrdemServico) {
            return false;
        }
        if (this.idPeca != other.idPeca) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesJPA.PecaUsadaPK[ idPecaUsada=" + idPecaUsada + ", idOrdemServico=" + idOrdemServico + ", idPeca=" + idPeca + " ]";
    }
    
}
