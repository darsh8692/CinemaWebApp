/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author darsh
 */
@Entity
@Table(name = "RESERVATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r"),
    @NamedQuery(name = "Reservation.findByReservationid", query = "SELECT r FROM Reservation r WHERE r.reservationid = :reservationid"),
    @NamedQuery(name = "Reservation.findByDatetime", query = "SELECT r FROM Reservation r WHERE r.datetime = :datetime"),
    @NamedQuery(name = "Reservation.findBySeatnumber", query = "SELECT r FROM Reservation r WHERE r.seatnumber = :seatnumber"),
    @NamedQuery(name = "Reservation.findByCost", query = "SELECT r FROM Reservation r WHERE r.cost = :cost")})
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESERVATIONID")
    private Integer reservationid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEATNUMBER")
    private int seatnumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COST")
    private int cost;
    @JoinColumn(name = "CUSTOMERID", referencedColumnName = "CUSTOMERID")
    @ManyToOne(optional = false)
    private Customer customerid;
    @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "EMPLOYEEID")
    @ManyToOne(optional = false)
    private Employee employeeid;
    @JoinColumn(name = "MOVIEID", referencedColumnName = "MOVIEID")
    @ManyToOne(optional = false)
    private Movie movieid;

    public Reservation() {
    }

    public Reservation(Integer reservationid) {
        this.reservationid = reservationid;
    }

    public Reservation(Integer reservationid, Date datetime, int seatnumber, int cost) {
        this.reservationid = reservationid;
        this.datetime = datetime;
        this.seatnumber = seatnumber;
        this.cost = cost;
    }

    public Integer getReservationid() {
        return reservationid;
    }

    public void setReservationid(Integer reservationid) {
        this.reservationid = reservationid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public Employee getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Employee employeeid) {
        this.employeeid = employeeid;
    }

    public Movie getMovieid() {
        return movieid;
    }

    public void setMovieid(Movie movieid) {
        this.movieid = movieid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservationid != null ? reservationid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.reservationid == null && other.reservationid != null) || (this.reservationid != null && !this.reservationid.equals(other.reservationid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Reservation[ reservationid=" + reservationid + " ]";
    }
    
}
