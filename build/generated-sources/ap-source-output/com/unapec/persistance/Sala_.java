package com.unapec.persistance;

import com.unapec.persistance.Cine;
import com.unapec.persistance.Tanda;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-28T19:50:38")
@StaticMetamodel(Sala.class)
public class Sala_ { 

    public static volatile SingularAttribute<Sala, Cine> idcine;
    public static volatile CollectionAttribute<Sala, Tanda> tandaCollection;
    public static volatile SingularAttribute<Sala, Integer> idsala;
    public static volatile SingularAttribute<Sala, String> nombre;

}