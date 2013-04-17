/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicalmanagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Bruno
 */
@Entity
@Table(name = "mecanico", catalog = "mecanica", schema = "")
@NamedQueries({
    @NamedQuery(name = "Mecanico.findAll", query = "SELECT m FROM Mecanico m"),
    @NamedQuery(name = "Mecanico.findByIdMecanico", query = "SELECT m FROM Mecanico m WHERE m.idMecanico = :idMecanico"),
    @NamedQuery(name = "Mecanico.findByNome", query = "SELECT m FROM Mecanico m WHERE m.nome = :nome"),
    @NamedQuery(name = "Mecanico.findByCpf", query = "SELECT m FROM Mecanico m WHERE m.cpf = :cpf"),
    @NamedQuery(name = "Mecanico.findByRg", query = "SELECT m FROM Mecanico m WHERE m.rg = :rg"),
    @NamedQuery(name = "Mecanico.findByTelefone", query = "SELECT m FROM Mecanico m WHERE m.telefone = :telefone"),
    @NamedQuery(name = "Mecanico.findByEspecialidade", query = "SELECT m FROM Mecanico m WHERE m.especialidade = :especialidade"),
    @NamedQuery(name = "Mecanico.findByStatus", query = "SELECT m FROM Mecanico m WHERE m.status = :status")})
public class Mecanico implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mecanico")
    private Integer idMecanico;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cpf")
    private int cpf;
    @Basic(optional = false)
    @Column(name = "rg")
    private int rg;
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "especialidade")
    private String especialidade;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;

    public Mecanico() {
    }

    public Mecanico(Integer idMecanico) {
        this.idMecanico = idMecanico;
    }

    public Mecanico(Integer idMecanico, String nome, int cpf, int rg, String especialidade, boolean status) {
        this.idMecanico = idMecanico;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.especialidade = especialidade;
        this.status = status;
    }

    public Integer getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(Integer idMecanico) {
        Integer oldIdMecanico = this.idMecanico;
        this.idMecanico = idMecanico;
        changeSupport.firePropertyChange("idMecanico", oldIdMecanico, idMecanico);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        int oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        int oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        String oldEspecialidade = this.especialidade;
        this.especialidade = especialidade;
        changeSupport.firePropertyChange("especialidade", oldEspecialidade, especialidade);
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        boolean oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMecanico != null ? idMecanico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mecanico)) {
            return false;
        }
        Mecanico other = (Mecanico) object;
        if ((this.idMecanico == null && other.idMecanico != null) || (this.idMecanico != null && !this.idMecanico.equals(other.idMecanico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mechanicalmanagement.Mecanico[ idMecanico=" + idMecanico + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
