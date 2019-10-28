package com.unapec.persistance;

import com.unapec.persistance.Sala;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-28T19:50:38")
@StaticMetamodel(Cine.class)
public class Cine_ { 

    public static volatile SingularAttribute<Cine, Integer> idcine;
    public static volatile CollectionAttribute<Cine, Sala> salaCollection;
    public static volatile SingularAttribute<Cine, String> nombre;

}