package com.iakk.backendvizsga.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ticket_category")
@NamedQueries({
    @NamedQuery(name = "TicketCategory.findAll", query = "SELECT t FROM TicketCategory t"),
    @NamedQuery(name = "TicketCategory.findById", query = "SELECT t FROM TicketCategory t WHERE t.id = :id"),
    @NamedQuery(name = "TicketCategory.findByValue", query = "SELECT t FROM TicketCategory t WHERE t.value = :value"),
    @NamedQuery(name = "TicketCategory.findByIsDeleted", query = "SELECT t FROM TicketCategory t WHERE t.isDeleted = :isDeleted"),
    @NamedQuery(name = "TicketCategory.findByCreadtedAt", query = "SELECT t FROM TicketCategory t WHERE t.creadtedAt = :creadtedAt"),
    @NamedQuery(name = "TicketCategory.findByDeletedAt", query = "SELECT t FROM TicketCategory t WHERE t.deletedAt = :deletedAt"),
    @NamedQuery(name = "TicketCategory.findByDeletedBy", query = "SELECT t FROM TicketCategory t WHERE t.deletedBy = :deletedBy")})
public class TicketCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_deleted")
    private boolean isDeleted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creadted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadtedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deleted_by")
    private int deletedBy;

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.iakk_backendVizsga_war_1.0-SNAPSHOTPU");
    
    public TicketCategory() {
    }

    public TicketCategory(Integer id) {
        EntityManager em = emf.createEntityManager();

        try {
            TicketCategory tc = em.find(TicketCategory.class, id);

            this.id = tc.getId();
            this.value = tc.getValue();
            this.isDeleted = tc.getIsDeleted();
            this.creadtedAt = tc.getCreadtedAt();
            this.deletedAt = tc.getDeletedAt();
            this.deletedBy = tc.getDeletedBy();
        } catch (Exception ex) {
            System.err.println("Hiba: " + ex.getLocalizedMessage());
        } finally {
            em.clear();
            em.close();
        }
    }

    public TicketCategory(Integer id, String value, boolean isDeleted, Date creadtedAt, int deletedBy) {
        this.id = id;
        this.value = value;
        this.isDeleted = isDeleted;
        this.creadtedAt = creadtedAt;
        this.deletedBy = deletedBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreadtedAt() {
        return creadtedAt;
    }

    public void setCreadtedAt(Date creadtedAt) {
        this.creadtedAt = creadtedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public int getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(int deletedBy) {
        this.deletedBy = deletedBy;
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
        if (!(object instanceof TicketCategory)) {
            return false;
        }
        TicketCategory other = (TicketCategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iakk.backendvizsga.model.TicketCategory[ id=" + id + " ]";
    }

        

}
