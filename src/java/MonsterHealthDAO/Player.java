/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonsterHealthDAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renny
 */
@Entity
@Table(name = "PLAYER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Player.findAll", query = "SELECT p FROM Player p"),
    @NamedQuery(name = "Player.findByPId", query = "SELECT p FROM Player p WHERE p.pId = :pId"),
    @NamedQuery(name = "Player.findByPName", query = "SELECT p FROM Player p WHERE p.pName = :pName"),
    @NamedQuery(name = "Player.findByPEmail", query = "SELECT p FROM Player p WHERE p.pEmail = :pEmail"),
    @NamedQuery(name = "Player.findByStepcoins", query = "SELECT p FROM Player p WHERE p.stepcoins = :stepcoins"),
    @NamedQuery(name = "Player.findByMonstersCollected", query = "SELECT p FROM Player p WHERE p.monstersCollected = :monstersCollected"),
    @NamedQuery(name = "Player.findByPPassword", query = "SELECT p FROM Player p WHERE p.pPassword = :pPassword")})
public class Player implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "P_ID")
    private Integer pId;
    @Size(max = 255)
    @Column(name = "P_NAME")
    private String pName;
    @Size(max = 255)
    @Column(name = "P_EMAIL")
    private String pEmail;
    @Column(name = "STEPCOINS")
    private Integer stepcoins;
    @Column(name = "MONSTERS_COLLECTED")
    private Integer monstersCollected;
    @Size(max = 300)
    @Column(name = "P_PASSWORD")
    private String pPassword;

    public Player() {
    }

    public Player(Integer pId) {
        this.pId = pId;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public String getPEmail() {
        return pEmail;
    }

    public void setPEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public Integer getStepcoins() {
        return stepcoins;
    }

    public void setStepcoins(Integer stepcoins) {
        this.stepcoins = stepcoins;
    }

    public Integer getMonstersCollected() {
        return monstersCollected;
    }

    public void setMonstersCollected(Integer monstersCollected) {
        this.monstersCollected = monstersCollected;
    }

    public String getPPassword() {
        return pPassword;
    }

    public void setPPassword(String pPassword) {
        this.pPassword = pPassword;
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
        if (!(object instanceof Player)) {
            return false;
        }
        Player other = (Player) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MonsterHealthDAO.Player[ pId=" + pId + " ]";
    }
    
}
