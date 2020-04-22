package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Buku;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-21T14:06:36")
@StaticMetamodel(Peminjam.class)
public class Peminjam_ { 

    public static volatile SingularAttribute<Peminjam, String> jenisBuku;
    public static volatile SingularAttribute<Peminjam, Date> tglPinjam;
    public static volatile SingularAttribute<Peminjam, String> penulis;
    public static volatile SingularAttribute<Peminjam, String> noTelepon;
    public static volatile SingularAttribute<Peminjam, Buku> idJudulBuku;
    public static volatile SingularAttribute<Peminjam, Integer> id;
    public static volatile SingularAttribute<Peminjam, String> namaPeminjam;
    public static volatile SingularAttribute<Peminjam, Date> tglKembali;

}