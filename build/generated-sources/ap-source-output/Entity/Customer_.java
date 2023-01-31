package Entity;

import Entity.Reservation;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-04-26T12:03:20")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> customeremail;
    public static volatile SingularAttribute<Customer, String> customerlastname;
    public static volatile SingularAttribute<Customer, Integer> customerid;
    public static volatile CollectionAttribute<Customer, Reservation> reservationCollection;
    public static volatile SingularAttribute<Customer, String> customerfirstname;
    public static volatile SingularAttribute<Customer, Long> customerphonenumber;

}