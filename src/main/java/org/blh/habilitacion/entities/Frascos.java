package org.blh.habilitacion.entities;
// Generated 30-jun-2015 0:45:21 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Frascos generated by hbm2java
 */
@Entity
@Table(name="frascos"
    ,schema="public"
)
public class Frascos  implements java.io.Serializable {


     private int nroFrasco;
     private Biberon biberon;
     private Consentimientoxhr consentimientoxhr;
     private Date fechaExtracion;
     private String tipoDeLeche;
     private String estadoDeFrasco;
     private String volumenDeLeche;
     private Double nivelDeAcides;
     private Double hematocritos;
     private Boolean estadoFrasco;
     private String motRechazoFrasco;

    public Frascos() {
    }

	
    public Frascos(int nroFrasco, Biberon biberon, Consentimientoxhr consentimientoxhr) {
        this.nroFrasco = nroFrasco;
        this.biberon = biberon;
        this.consentimientoxhr = consentimientoxhr;
    }
    public Frascos(int nroFrasco, Biberon biberon, Consentimientoxhr consentimientoxhr, Date fechaExtracion, String tipoDeLeche, String estadoDeFrasco, String volumenDeLeche, Double nivelDeAcides, Double hematocritos, Boolean estadoFrasco, String motRechazoFrasco) {
       this.nroFrasco = nroFrasco;
       this.biberon = biberon;
       this.consentimientoxhr = consentimientoxhr;
       this.fechaExtracion = fechaExtracion;
       this.tipoDeLeche = tipoDeLeche;
       this.estadoDeFrasco = estadoDeFrasco;
       this.volumenDeLeche = volumenDeLeche;
       this.nivelDeAcides = nivelDeAcides;
       this.hematocritos = hematocritos;
       this.estadoFrasco = estadoFrasco;
       this.motRechazoFrasco = motRechazoFrasco;
    }
   
     @Id 

    
    @Column(name="nroFrasco", nullable=false)
    public int getNroFrasco() {
        return this.nroFrasco;
    }
    
    public void setNroFrasco(int nroFrasco) {
        this.nroFrasco = nroFrasco;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idBiberon", nullable=false)
    public Biberon getBiberon() {
        return this.biberon;
    }
    
    public void setBiberon(Biberon biberon) {
        this.biberon = biberon;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="nroConcentimiento", referencedColumnName="nroConcentimiento", nullable=false), 
        @JoinColumn(name="idHojadeRuta", referencedColumnName="idHojadeRuta", nullable=false) } )
    public Consentimientoxhr getConsentimientoxhr() {
        return this.consentimientoxhr;
    }
    
    public void setConsentimientoxhr(Consentimientoxhr consentimientoxhr) {
        this.consentimientoxhr = consentimientoxhr;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechaExtracion", length=13)
    public Date getFechaExtracion() {
        return this.fechaExtracion;
    }
    
    public void setFechaExtracion(Date fechaExtracion) {
        this.fechaExtracion = fechaExtracion;
    }

    
    @Column(name="tipoDeLeche", length=10)
    public String getTipoDeLeche() {
        return this.tipoDeLeche;
    }
    
    public void setTipoDeLeche(String tipoDeLeche) {
        this.tipoDeLeche = tipoDeLeche;
    }

    
    @Column(name="estadoDeFrasco", length=10)
    public String getEstadoDeFrasco() {
        return this.estadoDeFrasco;
    }
    
    public void setEstadoDeFrasco(String estadoDeFrasco) {
        this.estadoDeFrasco = estadoDeFrasco;
    }

    
    @Column(name="volumenDeLeche", length=10)
    public String getVolumenDeLeche() {
        return this.volumenDeLeche;
    }
    
    public void setVolumenDeLeche(String volumenDeLeche) {
        this.volumenDeLeche = volumenDeLeche;
    }

    
    @Column(name="nivelDeAcides", precision=17, scale=17)
    public Double getNivelDeAcides() {
        return this.nivelDeAcides;
    }
    
    public void setNivelDeAcides(Double nivelDeAcides) {
        this.nivelDeAcides = nivelDeAcides;
    }

    
    @Column(name="hematocritos", precision=17, scale=17)
    public Double getHematocritos() {
        return this.hematocritos;
    }
    
    public void setHematocritos(Double hematocritos) {
        this.hematocritos = hematocritos;
    }

    
    @Column(name="estadoFrasco")
    public Boolean getEstadoFrasco() {
        return this.estadoFrasco;
    }
    
    public void setEstadoFrasco(Boolean estadoFrasco) {
        this.estadoFrasco = estadoFrasco;
    }

    
    @Column(name="motRechazoFrasco", length=25)
    public String getMotRechazoFrasco() {
        return this.motRechazoFrasco;
    }
    
    public void setMotRechazoFrasco(String motRechazoFrasco) {
        this.motRechazoFrasco = motRechazoFrasco;
    }




}

