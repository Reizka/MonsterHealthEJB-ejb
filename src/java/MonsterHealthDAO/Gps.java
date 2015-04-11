/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonsterHealthDAO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renny
 */
@Entity
@Table(name = "GPS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gps.findAll", query = "SELECT g FROM Gps g"),
    @NamedQuery(name = "Gps.findByPId", query = "SELECT g FROM Gps g WHERE g.pId = :pId"),
    @NamedQuery(name = "Gps.findByLongtitude", query = "SELECT g FROM Gps g WHERE g.longtitude = :longtitude"),
    @NamedQuery(name = "Gps.findByLatitude", query = "SELECT g FROM Gps g WHERE g.latitude = :latitude"),
    @NamedQuery(name = "Gps.findByTimestamp", query = "SELECT g FROM Gps g WHERE g.timestamp = :timestamp")})
public class Gps implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "P_ID")
    private Integer pId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LONGTITUDE")
    private Double longtitude;
    @Column(name = "LATITUDE")
    private Double latitude;
    @Column(name = "TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public Gps() {
    }

    public Gps(Integer pId) {
        this.pId = pId;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gps)) {
            return false;
        }
        Gps other = (Gps) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MonsterHealthDAO.Gps[ pId=" + pId + " ]";
    }
    
}
