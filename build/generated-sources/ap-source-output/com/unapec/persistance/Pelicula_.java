package com.unapec.persistance;

import com.unapec.persistance.Rol;
import com.unapec.persistance.Tanda;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-28T19:39:10")
@StaticMetamodel(Pelicula.class)
public class Pelicula_ { 

    public static volatile SingularAttribute<Pelicula, Integer> idpelicula;
    public static volatile SingularAttribute<Pelicula, Date> anoProduccion;
    public static volatile SingularAttribute<Pelicula, String> titulo;
    public static volatile CollectionAttribute<Pelicula, Tanda> tandaCollection;
    public static volatile SingularAttribute<Pelicula, String> sinopsis;
    public static volatile SingularAttribute<Pelicula, String> nacionalidad;
    public static volatile CollectionAttribute<Pelicula, Rol> rolCollection;

}