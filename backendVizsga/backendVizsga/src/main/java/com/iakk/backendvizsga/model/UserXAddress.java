package com.iakk.backendvizsga.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_x_address")
@NamedQueries({
    @NamedQuery(name = "UserXAddress.findAll", query = "SELECT u FROM UserXAddress u"),
    @NamedQuery(name = "UserXAddress.findById", query = "SELECT u FROM UserXAddress u WHERE u.id = :id"),
    @NamedQuery(name = "UserXAddress.findByUserId", query = "SELECT u FROM UserXAddress u WHERE u.userId = :userId"),
    @NamedQuery(name = "UserXAddress.findByAddressId", query = "SELECT u FROM UserXAddress u WHERE u.addressId = :addressId")})
public class UserXAddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "address_id")
    private int addressId;

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.iakk_backendVizsga_war_1.0-SNAPSHOTPU");

    public UserXAddress() {
    }

    public UserXAddress(Integer id) {
        EntityManager em = emf.createEntityManager();

        try {
            UserXAddress ua = em.find(UserXAddress.class, id);

            this.id = ua.getId();
            this.userId = ua.getUserId();
            this.addressId = ua.getAddressId();
        } catch (Exception ex) {
            System.err.println("Hiba: " + ex.getLocalizedMessage());
        } finally {
            em.clear();
            em.close();
        }
    }

    public UserXAddress(Integer id, int userId, int addressId) {
        this.id = id;
        this.userId = userId;
        this.addressId = addressId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserXAddress)) {
            return false;
        }
        UserXAddress other = (UserXAddress) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iakk.backendvizsga.model.UserXAddress[ id=" + id + " ]";
    }

}
