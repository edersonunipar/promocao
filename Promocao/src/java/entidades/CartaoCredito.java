/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ReferencedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author CPD
 */
@Entity
public class CartaoCredito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty
    @NotNull
    @Column(nullable = false)
   private String numero;
   
   @NotNull
   @Column(nullable = false)
   @Temporal(TemporalType.TIMESTAMP) 
   private Date dataValida;
   
   @NotEmpty
    @NotNull
    @Column(nullable = false)
   private String nomeCartao;
   
   @JoinColumn(referencedColumnName = "id")
   @ManyToOne(optional = false)
   private Usuario usuario;
   
   @Column(nullable = false)
   @Enumerated(EnumType.STRING)
   private BandeiraTipo bandeira;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataValida() {
        return dataValida;
    }

    public void setDataValida(Date dataValida) {
        this.dataValida = dataValida;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BandeiraTipo getBandeira() {
        return bandeira;
    }

    public void setBandeira(BandeiraTipo bandeira) {
        this.bandeira = bandeira;
    }
   

   
   
   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartaoCredito)) {
            return false;
        }
        CartaoCredito other = (CartaoCredito) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CartaoCredito[ id=" + id + " ]";
    }
    
}
