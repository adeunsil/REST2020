package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Buku;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-21T14:06:37")
@StaticMetamodel(JenisBuku.class)
public class JenisBuku_ { 

    public static volatile SingularAttribute<JenisBuku, String> jenisBuku;
    public static volatile SingularAttribute<JenisBuku, String> keterangan;
    public static volatile SingularAttribute<JenisBuku, Integer> id;
    public static volatile CollectionAttribute<JenisBuku, Buku> bukuCollection;

}