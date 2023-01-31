package Entity;

import Entity.Customer;
import Entity.Employee;
import Entity.Movie;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-04-26T12:03:19")
@StaticMetamodel(Reservation.class)
public class Reservation_ { 

    public static volatile SingularAttribute<Reservation, Date> datetime;
    public static volatile SingularAttribute<Reservation, Integer> cost;
    public static volatile SingularAttribute<Reservation, Integer> reservationid;
    public static volatile SingularAttribute<Reservation, Integer> seatnumber;
    public static volatile SingularAttribute<Reservation, Customer> customerid;
    public static volatile SingularAttribute<Reservation, Movie> movieid;
    public static volatile SingularAttribute<Reservation, Employee> employeeid;

}