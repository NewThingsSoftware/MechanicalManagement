/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ctb03
 */
@Entity
@Table(name = "peca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peca.findAll", query = "SELECT p FROM Peca p"),
    @NamedQuery(name = "Peca.findByIdPeca", query = "SELECT p FROM Peca p WHERE p.idPeca = :idPeca"),
    @NamedQuery(name = "Peca.findByDescricao", query = "SELECT p FROM Peca p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Peca.findByMarca", query = "SELECT p FROM Peca p WHERE p.marca = :marca"),
    @NamedQuery(name = "Peca.findByPrecoCompra", query = "SELECT p FROM Peca p WHERE p.precoCompra = :precoCompra"),
    @NamedQuery(name = "Peca.findByPrecoVenda", query = "SELECT p FROM Peca p WHERE p.precoVenda = :precoVenda"),
    @NamedQuery(name = "Peca.findByQuantidade", query = "SELECT p FROM Peca p WHERE p.quantidade = :quantidade"),
    @NamedQuery(name = "Peca.findByStatus", query = "SELECT p FROM Peca p WHERE p.status = :status")})
public class Peca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_peca")
    private Integer idPeca;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "marca")
    private String marca;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco_compra")
    private BigDecimal precoCompra;
    @Column(name = "preco_venda")
    private BigDecimal precoVenda;
    @Column(name = "quantidade")
    private Double quantidade;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peca")
    private Collection<PecaUsada> pecaUsadaCollection;

    public Peca() {
    }

    public Peca(Integer idPeca) {
        this.idPeca = idPeca;
    }

    public Peca(Integer idPeca, String descricao, boolean status) {
        this.idPeca = idPeca;
        this.descricao = descricao;
        this.status = status;
    }

    public Integer getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(Integer idPeca) {
        this.idPeca = idPeca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        hash += (idPeca != null ? idPeca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peca)) {
            return false;
        }
        Peca other = (Peca) object;
        if ((this.idPeca == null && other.idPeca != null) || (this.idPeca != null && !this.idPeca.equals(other.idPeca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesJPA.Peca[ idPeca=" + idPeca + " ]";
    }
    
}
