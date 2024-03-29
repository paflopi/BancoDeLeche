package org.blh.habilitacion.entities;
// Generated 06-jul-2015 22:01:19 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fraccionamiento generated by hbm2java
 */
@Entity
@Table(name="fraccionamiento"
    ,schema="public"
)
public class Fraccionamiento  implements java.io.Serializable {


     private FraccionamientoId id;
     private Bebereceptor bebereceptor;
     private Biberon biberon;
     private Date fechfraccionamiento;
     private String prescnutricionista;
     private Double volumen;
     private Double consumido;
     private String motnoconsumo;

    public Fraccionamiento() {
    }

	
    public Fraccionamiento(FraccionamientoId id, Bebereceptor bebereceptor, Biberon biberon) {
        this.id = id;
        this.bebereceptor = bebereceptor;
        this.biberon = biberon;
    }
    public Fraccionamiento(FraccionamientoId id, Bebereceptor bebereceptor, Biberon biberon, Date fechfraccionamiento, String prescnutricionista, Double volumen, Double consumido, String motnoconsumo) {
       this.id = id;
       this.bebereceptor = bebereceptor;
       this.biberon = biberon;
       this.fechfraccionamiento = fechfraccionamiento;
       this.prescnutricionista = prescnutricionista;
       this.volumen = volumen;
       this.consumido = consumido;
       this.motnoconsumo = motnoconsumo;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idfraccionamiento", column=@Column(name="idfraccionamiento", nullable=false) ), 
        @AttributeOverride(name="idbebereceptor", column=@Column(name="idbebereceptor", nullable=false) ), 
        @AttributeOverride(name="idbiberon", column=@Column(name="idbiberon", nullable=false) ) } )
    public FraccionamientoId getId() {
        return this.id;
    }
    
    public void setId(FraccionamientoId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idbebereceptor", nullable=false, insertable=false, updatable=false)
    public Bebereceptor getBebereceptor() {
        return this.bebereceptor;
    }
    
    public void setBebereceptor(Bebereceptor bebereceptor) {
        this.bebereceptor = bebereceptor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idbiberon", nullable=false, insertable=false, updatable=false)
    public Biberon getBiberon() {
        return this.biberon;
    }
    
    public void setBiberon(Biberon biberon) {
        this.biberon = biberon;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechfraccionamiento", length=13)
    public Date getFechfraccionamiento() {
        return this.fechfraccionamiento;
    }
    
    public void setFechfraccionamiento(Date fechfraccionamiento) {
        this.fechfraccionamiento = fechfraccionamiento;
    }

    
    @Column(name="prescnutricionista", length=10)
    public String getPrescnutricionista() {
        return this.prescnutricionista;
    }
    
    public void setPrescnutricionista(String prescnutricionista) {
        this.prescnutricionista = prescnutricionista;
    }

    
    @Column(name="volumen", precision=17, scale=17)
    public Double getVolumen() {
        return this.volumen;
    }
    
    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    
    @Column(name="consumido", precision=17, scale=17)
    public Double getConsumido() {
        return this.consumido;
    }
    
    public void setConsumido(Double consumido) {
        this.consumido = consumido;
    }

    
    @Column(name="motnoconsumo", length=30)
    public String getMotnoconsumo() {
        return this.motnoconsumo;
    }
    
    public void setMotnoconsumo(String motnoconsumo) {
        this.motnoconsumo = motnoconsumo;
    }




}


