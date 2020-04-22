/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kentry R D
 */
@Entity
@Table(name = "peminjam")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peminjam.findAll", query = "SELECT p FROM Peminjam p")
    , @NamedQuery(name = "Peminjam.findById", query = "SELECT p FROM Peminjam p WHERE p.id = :id")
    , @NamedQuery(name = "Peminjam.findByNamaPeminjam", query = "SELECT p FROM Peminjam p WHERE p.namaPeminjam = :namaPeminjam")
    , @NamedQuery(name = "Peminjam.findByPenulis", query = "SELECT p FROM Peminjam p WHERE p.penulis = :penulis")
    , @NamedQuery(name = "Peminjam.findByJenisBuku", query = "SELECT p FROM Peminjam p WHERE p.jenisBuku = :jenisBuku")
    , @NamedQuery(name = "Peminjam.findByNoTelepon", query = "SELECT p FROM Peminjam p WHERE p.noTelepon = :noTelepon")
    , @NamedQuery(name = "Peminjam.findByTglPinjam", query = "SELECT p FROM Peminjam p WHERE p.tglPinjam = :tglPinjam")
    , @NamedQuery(name = "Peminjam.findByTglKembali", query = "SELECT p FROM Peminjam p WHERE p.tglKembali = :tglKembali")})
public class Peminjam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 225)
    @Column(name = "nama_peminjam")
    private String namaPeminjam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 225)
    @Column(name = "penulis")
    private String penulis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 225)
    @Column(name = "jenis_buku")
    private String jenisBuku;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "no_telepon")
    private String noTelepon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tgl_pinjam")
    @Temporal(TemporalType.DATE)
    private Date tglPinjam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tgl_kembali")
    @Temporal(TemporalType.DATE)
    private Date tglKembali;
    @JoinColumn(name = "id_judul_buku", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Buku idJudulBuku;

    public Peminjam() {
    }

    public Peminjam(Integer id) {
        this.id = id;
    }

    public Peminjam(Integer id, String namaPeminjam, String penulis, String jenisBuku, String noTelepon, Date tglPinjam, Date tglKembali) {
        this.id = id;
        this.namaPeminjam = namaPeminjam;
        this.penulis = penulis;
        this.jenisBuku = jenisBuku;
        this.noTelepon = noTelepon;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }

    public Buku getIdJudulBuku() {
        return idJudulBuku;
    }

    public void setIdJudulBuku(Buku idJudulBuku) {
        this.idJudulBuku = idJudulBuku;
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
        if (!(object instanceof Peminjam)) {
            return false;
        }
        Peminjam other = (Peminjam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Peminjam[ id=" + id + " ]";
    }
    
}
