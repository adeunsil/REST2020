package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Buku;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-21T14:06:35")
@StaticMetamodel(Penulis.class)
public class Penulis_ { 

    public static volatile SingularAttribute<Penulis, Integer> id;
    public static volatile SingularAttribute<Penulis, String> namaPenulis;
    public static volatile CollectionAttribute<Penulis, Buku> bukuCollection;
    public static volatile SingularAttribute<Penulis, String> alamat;

}