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

@Entity
@Table(name = "ticket")
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t"),
    @NamedQuery(name = "Ticket.findById", query = "SELECT t FROM Ticket t WHERE t.id = :id"),
    @NamedQuery(name = "Ticket.findByCategoryId", query = "SELECT t FROM Ticket t WHERE t.categoryId = :categoryId"),
    @NamedQuery(name = "Ticket.findByEventId", query = "SELECT t FROM Ticket t WHERE t.eventId = :eventId"),
    @NamedQuery(name = "Ticket.findByAmount", query = "SELECT t FROM Ticket t WHERE t.amount = :amount"),
    @NamedQuery(name = "Ticket.findByPrice", query = "SELECT t FROM Ticket t WHERE t.price = :price"),
    @NamedQuery(name = "Ticket.findByIsDeleted", query = "SELECT t FROM Ticket t WHERE t.isDeleted = :isDeleted"),
    @NamedQuery(name = "Ticket.findByCreadtedAt", query = "SELECT t FROM Ticket t WHERE t.creadtedAt = :creadtedAt"),
    @NamedQuery(name = "Ticket.findByDeletedAt", query = "SELECT t FROM Ticket t WHERE t.deletedAt = :deletedAt")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private int categoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_id")
    private int eventId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "amount")
    private int amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
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

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.iakk_backendVizsga_war_1.0-SNAPSHOTPU");
    
    public Ticket() {
    }

    public Ticket(Integer id) {
        EntityManager em = emf.createEntityManager();

        try {
            Ticket t = em.find(Ticket.class, id);

            this.id = t.getId();
            this.categoryId = t.getCategoryId();
            this.eventId = t.getEventId();
            this.amount = t.getAmount();
            this.price = t.getPrice();
            this.isDeleted = t.getIsDeleted();
            this.creadtedAt = t.getCreadtedAt();
            this.deletedAt = t.getDeletedAt();
        } catch (Exception ex) {
            System.err.println("Hiba: " + ex.getLocalizedMessage());
        } finally {
            em.clear();
            em.close();
        }
    }

    public Ticket(Integer id, int categoryId, int eventId, int amount, int price, boolean isDeleted, Date creadtedAt) {
        this.id = id;
        this.categoryId = categoryId;
        this.eventId = eventId;
        this.amount = amount;
        this.price = price;
        this.isDeleted = isDeleted;
        this.creadtedAt = creadtedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iakk.backendvizsga.model.Ticket[ id=" + id + " ]";
    }

        

}
