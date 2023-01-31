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
@Table(name = "CUSTOMER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByCustomerid", query = "SELECT c FROM Customer c WHERE c.customerid = :customerid"),
    @NamedQuery(name = "Customer.findByCustomerfirstname", query = "SELECT c FROM Customer c WHERE c.customerfirstname = :customerfirstname"),
    @NamedQuery(name = "Customer.findByCustomerlastname", query = "SELECT c FROM Customer c WHERE c.customerlastname = :customerlastname"),
    @NamedQuery(name = "Customer.findByCustomerphonenumber", query = "SELECT c FROM Customer c WHERE c.customerphonenumber = :customerphonenumber"),
    @NamedQuery(name = "Customer.findByCustomeremail", query = "SELECT c FROM Customer c WHERE c.customeremail = :customeremail")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMERID")
    private Integer customerid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CUSTOMERFIRSTNAME")
    private String customerfirstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CUSTOMERLASTNAME")
    private String customerlastname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMERPHONENUMBER")
    private long customerphonenumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CUSTOMEREMAIL")
    private String customeremail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerid")
    private Collection<Reservation> reservationCollection;

    public Customer() {
    }

    public Customer(Integer customerid) {
        this.customerid = customerid;
    }

    public Customer(Integer customerid, String customerfirstname, String customerlastname, long customerphonenumber, String customeremail) {
        this.customerid = customerid;
        this.customerfirstname = customerfirstname;
        this.customerlastname = customerlastname;
        this.customerphonenumber = customerphonenumber;
        this.customeremail = customeremail;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomerfirstname() {
        return customerfirstname;
    }

    public void setCustomerfirstname(String customerfirstname) {
        this.customerfirstname = customerfirstname;
    }

    public String getCustomerlastname() {
        return customerlastname;
    }

    public void setCustomerlastname(String customerlastname) {
        this.customerlastname = customerlastname;
    }

    public long getCustomerphonenumber() {
        return customerphonenumber;
    }

    public void setCustomerphonenumber(long customerphonenumber) {
        this.customerphonenumber = customerphonenumber;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
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
        hash += (customerid != null ? customerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerid == null && other.customerid != null) || (this.customerid != null && !this.customerid.equals(other.customerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Customer[ customerid=" + customerid + " ]";
    }
    
}
