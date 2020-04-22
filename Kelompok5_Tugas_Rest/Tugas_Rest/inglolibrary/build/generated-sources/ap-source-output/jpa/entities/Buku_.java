package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.JenisBuku;
import jpa.entities.Peminjam;
import jpa.entities.Penulis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-21T14:06:32")
@StaticMetamodel(Buku.class)
public class Buku_ { 

    public static volatile CollectionAttribute<Buku, Peminjam> peminjamCollection;
    public static volatile SingularAttribute<Buku, JenisBuku> idJenisBuku;
    public static volatile SingularAttribute<Buku, Penulis> idPenulis;
    public static volatile SingularAttribute<Buku, Integer> id;
    public static volatile SingularAttribute<Buku, String> judul;
    public static volatile SingularAttribute<Buku, Date> thTerbit;

}