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
@Table(name = "MOVIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m"),
    @NamedQuery(name = "Movie.findByMovieid", query = "SELECT m FROM Movie m WHERE m.movieid = :movieid"),
    @NamedQuery(name = "Movie.findByMovietitle", query = "SELECT m FROM Movie m WHERE m.movietitle = :movietitle"),
    @NamedQuery(name = "Movie.findByMovielanguage", query = "SELECT m FROM Movie m WHERE m.movielanguage = :movielanguage"),
    @NamedQuery(name = "Movie.findByMovieduration", query = "SELECT m FROM Movie m WHERE m.movieduration = :movieduration"),
    @NamedQuery(name = "Movie.findByMovietype", query = "SELECT m FROM Movie m WHERE m.movietype = :movietype"),
    @NamedQuery(name = "Movie.findByTheaterroomnumber", query = "SELECT m FROM Movie m WHERE m.theaterroomnumber = :theaterroomnumber")})
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOVIEID")
    private Integer movieid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MOVIETITLE")
    private String movietitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MOVIELANGUAGE")
    private String movielanguage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOVIEDURATION")
    private int movieduration;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "MOVIETYPE")
    private String movietype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "THEATERROOMNUMBER")
    private int theaterroomnumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movieid")
    private Collection<Reservation> reservationCollection;

    public Movie() {
    }

    public Movie(Integer movieid) {
        this.movieid = movieid;
    }

    public Movie(Integer movieid, String movietitle, String movielanguage, int movieduration, String movietype, int theaterroomnumber) {
        this.movieid = movieid;
        this.movietitle = movietitle;
        this.movielanguage = movielanguage;
        this.movieduration = movieduration;
        this.movietype = movietype;
        this.theaterroomnumber = theaterroomnumber;
    }

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public String getMovietitle() {
        return movietitle;
    }

    public void setMovietitle(String movietitle) {
        this.movietitle = movietitle;
    }

    public String getMovielanguage() {
        return movielanguage;
    }

    public void setMovielanguage(String movielanguage) {
        this.movielanguage = movielanguage;
    }

    public int getMovieduration() {
        return movieduration;
    }

    public void setMovieduration(int movieduration) {
        this.movieduration = movieduration;
    }

    public String getMovietype() {
        return movietype;
    }

    public void setMovietype(String movietype) {
        this.movietype = movietype;
    }

    public int getTheaterroomnumber() {
        return theaterroomnumber;
    }

    public void setTheaterroomnumber(int theaterroomnumber) {
        this.theaterroomnumber = theaterroomnumber;
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
        hash += (movieid != null ? movieid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.movieid == null && other.movieid != null) || (this.movieid != null && !this.movieid.equals(other.movieid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Movie[ movieid=" + movieid + " ]";
    }
    
}
