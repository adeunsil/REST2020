/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kentry R D
 */
@Entity
@Table(name = "buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b")
    , @NamedQuery(name = "Buku.findById", query = "SELECT b FROM Buku b WHERE b.id = :id")
    , @NamedQuery(name = "Buku.findByJudul", query = "SELECT b FROM Buku b WHERE b.judul = :judul")
    , @NamedQuery(name = "Buku.findByThTerbit", query = "SELECT b FROM Buku b WHERE b.thTerbit = :thTerbit")})
public class Buku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 225)
    @Column(name = "judul")
    private String judul;
    @Basic(optional = false)
    @NotNull
    @Column(name = "th_terbit")
    @Temporal(TemporalType.DATE)
    private Date thTerbit;
    @JoinColumn(name = "id_jenis_buku", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private JenisBuku idJenisBuku;
    @JoinColumn(name = "id_penulis", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Penulis idPenulis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJudulBuku")
    private Collection<Peminjam> peminjamCollection;

    public Buku() {
    }

    public Buku(Integer id) {
        this.id = id;
    }

    public Buku(Integer id, String judul, Date thTerbit) {
        this.id = id;
        this.judul = judul;
        this.thTerbit = thTerbit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Date getThTerbit() {
        return thTerbit;
    }

    public void setThTerbit(Date thTerbit) {
        this.thTerbit = thTerbit;
    }

    public JenisBuku getIdJenisBuku() {
        return idJenisBuku;
    }

    public void setIdJenisBuku(JenisBuku idJenisBuku) {
        this.idJenisBuku = idJenisBuku;
    }

    public Penulis getIdPenulis() {
        return idPenulis;
    }

    public void setIdPenulis(Penulis idPenulis) {
        this.idPenulis = idPenulis;
    }

    @XmlTransient
    public Collection<Peminjam> getPeminjamCollection() {
        return peminjamCollection;
    }

    public void setPeminjamCollection(Collection<Peminjam> peminjamCollection) {
        this.peminjamCollection = peminjamCollection;
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
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Buku[ id=" + id + " ]";
    }
    
}
