package com.unapec.persistance;

import com.unapec.persistance.Rol;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-28T19:50:38")
@StaticMetamodel(Artista.class)
public class Artista_ { 

    public static volatile SingularAttribute<Artista, Date> fechaNacimiento;
    public static volatile SingularAttribute<Artista, String> nombre;
    public static volatile SingularAttribute<Artista, Integer> idartista;
    public static volatile CollectionAttribute<Artista, Rol> rolCollection;

}