package org.blh.habilitacion.entities;
// Generated 30-jun-2015 0:45:21 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pasteurizacion generated by hbm2java
 */
@Entity
@Table(name="pasteurizacion"
    ,schema="public"
)
public class Pasteurizacion  implements java.io.Serializable {


     private int idPasteurizacion;
     private Date fechaPasteurizacion;
     private String responsable;
     private String confirmacion;
     private Set biberons = new HashSet(0);

    public Pasteurizacion() {
    }

	
    public Pasteurizacion(int idPasteurizacion, String responsable) {
        this.idPasteurizacion = idPasteurizacion;
        this.responsable = responsable;
    }
    public Pasteurizacion(int idPasteurizacion, Date fechaPasteurizacion, String responsable, String confirmacion, Set biberons) {
       this.idPasteurizacion = idPasteurizacion;
       this.fechaPasteurizacion = fechaPasteurizacion;
       this.responsable = responsable;
       this.confirmacion = confirmacion;
       this.biberons = biberons;
    }
   
     @Id 

    
    @Column(name="idPasteurizacion", nullable=false)
    public int getIdPasteurizacion() {
        return this.idPasteurizacion;
    }
    
    public void setIdPasteurizacion(int idPasteurizacion) {
        this.idPasteurizacion = idPasteurizacion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechaPasteurizacion", length=13)
    public Date getFechaPasteurizacion() {
        return this.fechaPasteurizacion;
    }
    
    public void setFechaPasteurizacion(Date fechaPasteurizacion) {
        this.fechaPasteurizacion = fechaPasteurizacion;
    }

    
    @Column(name="responsable", nullable=false, length=18)
    public String getResponsable() {
        return this.responsable;
    }
    
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    
    @Column(name="confirmacion", length=10)
    public String getConfirmacion() {
        return this.confirmacion;
    }
    
    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pasteurizacion")
    public Set getBiberons() {
        return this.biberons;
    }
    
    public void setBiberons(Set biberons) {
        this.biberons = biberons;
    }




}


