/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author darsh
 */
@Entity
@Table(name = "EMPLOYEE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByEmployeeid", query = "SELECT e FROM Employee e WHERE e.employeeid = :employeeid"),
    @NamedQuery(name = "Employee.findByEmployeefirstname", query = "SELECT e FROM Employee e WHERE e.employeefirstname = :employeefirstname"),
    @NamedQuery(name = "Employee.findByEmployeelastname", query = "SELECT e FROM Employee e WHERE e.employeelastname = :employeelastname"),
    @NamedQuery(name = "Employee.findByEmployeeemail", query = "SELECT e FROM Employee e WHERE e.employeeemail = :employeeemail")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLOYEEID")
    private Integer employeeid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMPLOYEEFIRSTNAME")
    private String employeefirstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMPLOYEELASTNAME")
    private String employeelastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMPLOYEEEMAIL")
    private String employeeemail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeid")
    private Collection<Reservation> reservationCollection;

    public Employee() {
    }

    public Employee(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Employee(Integer employeeid, String employeefirstname, String employeelastname, String employeeemail) {
        this.employeeid = employeeid;
        this.employeefirstname = employeefirstname;
        this.employeelastname = employeelastname;
        this.employeeemail = employeeemail;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeefirstname() {
        return employeefirstname;
    }

    public void setEmployeefirstname(String employeefirstname) {
        this.employeefirstname = employeefirstname;
    }

    public String getEmployeelastname() {
        return employeelastname;
    }

    public void setEmployeelastname(String employeelastname) {
        this.employeelastname = employeelastname;
    }

    public String getEmployeeemail() {
        return employeeemail;
    }

    public void setEmployeeemail(String employeeemail) {
        this.employeeemail = employeeemail;
    }

    @XmlTransient
    public Collection<Reservation> getReservationCollection() {
        return reservationCollection;
    }

    public void setReservationCollection(Collection<Reservation> reservationCollection) {
        this.reservationCollection = reservationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeid != null ? employeeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeid == null && other.employeeid != null) || (this.employeeid != null && !this.employeeid.equals(other.employeeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Employee[ employeeid=" + employeeid + " ]";
    }
    
}
