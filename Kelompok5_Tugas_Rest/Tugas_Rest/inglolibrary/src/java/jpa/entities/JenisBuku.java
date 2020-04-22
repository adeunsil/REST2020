/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kentry R D
 */
@Entity
@Table(name = "jenis_buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JenisBuku.findAll", query = "SELECT j FROM JenisBuku j")
    , @NamedQuery(name = "JenisBuku.findById", query = "SELECT j FROM JenisBuku j WHERE j.id = :id")
    , @NamedQuery(name = "JenisBuku.findByJenisBuku", query = "SELECT j FROM JenisBuku j WHERE j.jenisBuku = :jenisBuku")})
public class JenisBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "jenis_buku")
    private String jenisBuku;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "keterangan")
    private String keterangan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJenisBuku")
    private Collection<Buku> bukuCollection;

    public JenisBuku() {
    }

    public JenisBuku(Integer id) {
        this.id = id;
    }

    public JenisBuku(Integer id, String jenisBuku, String keterangan) {
        this.id = id;
        this.jenisBuku = jenisBuku;
        this.keterangan = keterangan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @XmlTransient
    public Collection<Buku> getBukuCollection() {
        return bukuCollection;
    }

    public void setBukuCollection(Collection<Buku> bukuCollection) {
        this.bukuCollection = bukuCollection;
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
        if (!(object instanceof JenisBuku)) {
            return false;
        }
        JenisBuku other = (JenisBuku) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.JenisBuku[ id=" + id + " ]";
    }
    
}
