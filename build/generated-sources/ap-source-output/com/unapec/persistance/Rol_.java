package com.unapec.persistance;

import com.unapec.persistance.Artista;
import com.unapec.persistance.Pelicula;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-28T19:39:10")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> descripcion;
    public static volatile SingularAttribute<Rol, Pelicula> idpelicula;
    public static volatile SingularAttribute<Rol, Integer> idrol;
    public static volatile SingularAttribute<Rol, String> rolcol;
    public static volatile SingularAttribute<Rol, Artista> idartista;

}