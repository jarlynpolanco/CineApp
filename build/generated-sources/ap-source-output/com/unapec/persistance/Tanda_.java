package com.unapec.persistance;

import com.unapec.persistance.Pelicula;
import com.unapec.persistance.Sala;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-28T15:18:32")
@StaticMetamodel(Tanda.class)
public class Tanda_ { 

    public static volatile SingularAttribute<Tanda, Integer> idtanda;
    public static volatile SingularAttribute<Tanda, Date> horaFin;
    public static volatile SingularAttribute<Tanda, Date> fecha;
    public static volatile SingularAttribute<Tanda, Pelicula> idpelicula;
    public static volatile SingularAttribute<Tanda, BigDecimal> costo;
    public static volatile SingularAttribute<Tanda, Sala> idsala;
    public static volatile SingularAttribute<Tanda, Date> horaInicio;

}