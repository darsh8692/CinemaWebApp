package Entity;

import Entity.Reservation;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-04-26T12:03:19")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, Integer> theaterroomnumber;
    public static volatile SingularAttribute<Movie, String> movielanguage;
    public static volatile CollectionAttribute<Movie, Reservation> reservationCollection;
    public static volatile SingularAttribute<Movie, Integer> movieid;
    public static volatile SingularAttribute<Movie, Integer> movieduration;
    public static volatile SingularAttribute<Movie, String> movietype;
    public static volatile SingularAttribute<Movie, String> movietitle;

}