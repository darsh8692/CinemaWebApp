package Entity;

import Entity.Reservation;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-04-26T12:03:19")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> employeelastname;
    public static volatile SingularAttribute<Employee, String> employeeemail;
    public static volatile SingularAttribute<Employee, String> employeefirstname;
    public static volatile CollectionAttribute<Employee, Reservation> reservationCollection;
    public static volatile SingularAttribute<Employee, Integer> employeeid;

}