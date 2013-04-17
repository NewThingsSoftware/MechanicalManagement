/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ctb03
 */
@Entity
@Table(name = "ordem_servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdemServico.findAll", query = "SELECT o FROM OrdemServico o"),
    @NamedQuery(name = "OrdemServico.findByIdOrdemServico", query = "SELECT o FROM OrdemServico o WHERE o.idOrdemServico = :idOrdemServico"),
    @NamedQuery(name = "OrdemServico.findByData", query = "SELECT o FROM OrdemServico o WHERE o.data = :data"),
    @NamedQuery(name = "OrdemServico.findByDescricao", query = "SELECT o FROM OrdemServico o WHERE o.descricao = :descricao"),
    @NamedQuery(name = "OrdemServico.findByStatus", query = "SELECT o FROM OrdemServico o WHERE o.status = :status")})
public class OrdemServico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ordem_servico")
    private Integer idOrdemServico;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "status")
    private Boolean status;
    @JoinColumn(name = "id_veiculo", referencedColumnName = "id_veiculo")
    @ManyToOne(optional = false)
    private Veiculo idVeiculo;
    @JoinColumn(name = "id_mecanico", referencedColumnName = "id_mecanico")
    @ManyToOne(optional = false)
    private Mecanico idMecanico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrdemServico")
    private Collection<ContasReceber> contasReceberCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordemServico")
    private Collection<PecaUsada> pecaUsadaCollection;

    public OrdemServico() {
    }

    public OrdemServico(Integer idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    public OrdemServico(Integer idOrdemServico, Date data) {
        this.idOrdemServico = idOrdemServico;
        this.data = data;
    }

    public Integer getIdOrdemServico() {
        return idOrdemServico;
    }

    public void setIdOrdemServico(Integer idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Veiculo getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Veiculo idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Mecanico getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(Mecanico idMecanico) {
        this.idMecanico = idMecanico;
    }

    @XmlTransient
    public Collection<ContasReceber> getContasReceberCollection() {
        return contasReceberCollection;
    }

    public void setContasReceberCollection(Collection<ContasReceber> contasReceberCollection) {
        this.contasReceberCollection = contasReceberCollection;
    }

    @XmlTransient
    public Collection<PecaUsada> getPecaUsadaCollection() {
        return pecaUsadaCollection;
    }

    public void setPecaUsadaCollection(Collection<PecaUsada> pecaUsadaCollection) {
        this.pecaUsadaCollection = pecaUsadaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdemServico != null ? idOrdemServico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdemServico)) {
            return false;
        }
        OrdemServico other = (OrdemServico) object;
        if ((this.idOrdemServico == null && other.idOrdemServico != null) || (this.idOrdemServico != null && !this.idOrdemServico.equals(other.idOrdemServico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesJPA.OrdemServico[ idOrdemServico=" + idOrdemServico + " ]";
    }
    
}
