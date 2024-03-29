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
 * Serologia generated by hbm2java
 */
@Entity
@Table(name="serologia"
    ,schema="public"
)
public class Serologia  implements java.io.Serializable {


     private SerologiaId id;
     private Consentimiento consentimiento;
     private Date fechaserologia;
     private Date fechacarga;
     private boolean vdrl;
     private Boolean chagas;
     private Boolean hvc;
     private Boolean hiv;
     private Boolean hvb;
     private Boolean hvbcore;
     private Boolean toxoplasmosis;
     private Boolean htlvlIi;
     private Boolean medicacion;
     private Boolean fuma;
     private Boolean usadrogas;
     private Boolean alcohol;
     private Boolean zonarural;
     private Boolean vacunas;
     private String igm;
     private String igg;
     private String droga;
     private String dosis;
     private String resultadoserologia;
     private String observaciones;

    public Serologia() {
    }

	
    public Serologia(SerologiaId id, Consentimiento consentimiento, boolean vdrl, String dosis) {
        this.id = id;
        this.consentimiento = consentimiento;
        this.vdrl = vdrl;
        this.dosis = dosis;
    }
    public Serologia(SerologiaId id, Consentimiento consentimiento, Date fechaserologia, Date fechacarga, boolean vdrl, Boolean chagas, Boolean hvc, Boolean hiv, Boolean hvb, Boolean hvbcore, Boolean toxoplasmosis, Boolean htlvlIi, Boolean medicacion, Boolean fuma, Boolean usadrogas, Boolean alcohol, Boolean zonarural, Boolean vacunas, String igm, String igg, String droga, String dosis, String resultadoserologia, String observaciones) {
       this.id = id;
       this.consentimiento = consentimiento;
       this.fechaserologia = fechaserologia;
       this.fechacarga = fechacarga;
       this.vdrl = vdrl;
       this.chagas = chagas;
       this.hvc = hvc;
       this.hiv = hiv;
       this.hvb = hvb;
       this.hvbcore = hvbcore;
       this.toxoplasmosis = toxoplasmosis;
       this.htlvlIi = htlvlIi;
       this.medicacion = medicacion;
       this.fuma = fuma;
       this.usadrogas = usadrogas;
       this.alcohol = alcohol;
       this.zonarural = zonarural;
       this.vacunas = vacunas;
       this.igm = igm;
       this.igg = igg;
       this.droga = droga;
       this.dosis = dosis;
       this.resultadoserologia = resultadoserologia;
       this.observaciones = observaciones;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="nroserologia", column=@Column(name="nroserologia", nullable=false) ), 
        @AttributeOverride(name="nroconcentimiento", column=@Column(name="nroconcentimiento", nullable=false) ) } )
    public SerologiaId getId() {
        return this.id;
    }
    
    public void setId(SerologiaId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nroconcentimiento", nullable=false, insertable=false, updatable=false)
    public Consentimiento getConsentimiento() {
        return this.consentimiento;
    }
    
    public void setConsentimiento(Consentimiento consentimiento) {
        this.consentimiento = consentimiento;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechaserologia", length=13)
    public Date getFechaserologia() {
        return this.fechaserologia;
    }
    
    public void setFechaserologia(Date fechaserologia) {
        this.fechaserologia = fechaserologia;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechacarga", length=13)
    public Date getFechacarga() {
        return this.fechacarga;
    }
    
    public void setFechacarga(Date fechacarga) {
        this.fechacarga = fechacarga;
    }

    
    @Column(name="vdrl", nullable=false)
    public boolean isVdrl() {
        return this.vdrl;
    }
    
    public void setVdrl(boolean vdrl) {
        this.vdrl = vdrl;
    }

    
    @Column(name="chagas")
    public Boolean getChagas() {
        return this.chagas;
    }
    
    public void setChagas(Boolean chagas) {
        this.chagas = chagas;
    }

    
    @Column(name="hvc")
    public Boolean getHvc() {
        return this.hvc;
    }
    
    public void setHvc(Boolean hvc) {
        this.hvc = hvc;
    }

    
    @Column(name="hiv")
    public Boolean getHiv() {
        return this.hiv;
    }
    
    public void setHiv(Boolean hiv) {
        this.hiv = hiv;
    }

    
    @Column(name="hvb")
    public Boolean getHvb() {
        return this.hvb;
    }
    
    public void setHvb(Boolean hvb) {
        this.hvb = hvb;
    }

    
    @Column(name="hvbcore")
    public Boolean getHvbcore() {
        return this.hvbcore;
    }
    
    public void setHvbcore(Boolean hvbcore) {
        this.hvbcore = hvbcore;
    }

    
    @Column(name="toxoplasmosis")
    public Boolean getToxoplasmosis() {
        return this.toxoplasmosis;
    }
    
    public void setToxoplasmosis(Boolean toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }

    
    @Column(name="htlvl_II")
    public Boolean getHtlvlIi() {
        return this.htlvlIi;
    }
    
    public void setHtlvlIi(Boolean htlvlIi) {
        this.htlvlIi = htlvlIi;
    }

    
    @Column(name="medicacion")
    public Boolean getMedicacion() {
        return this.medicacion;
    }
    
    public void setMedicacion(Boolean medicacion) {
        this.medicacion = medicacion;
    }

    
    @Column(name="fuma")
    public Boolean getFuma() {
        return this.fuma;
    }
    
    public void setFuma(Boolean fuma) {
        this.fuma = fuma;
    }

    
    @Column(name="usadrogas")
    public Boolean getUsadrogas() {
        return this.usadrogas;
    }
    
    public void setUsadrogas(Boolean usadrogas) {
        this.usadrogas = usadrogas;
    }

    
    @Column(name="alcohol")
    public Boolean getAlcohol() {
        return this.alcohol;
    }
    
    public void setAlcohol(Boolean alcohol) {
        this.alcohol = alcohol;
    }

    
    @Column(name="zonarural")
    public Boolean getZonarural() {
        return this.zonarural;
    }
    
    public void setZonarural(Boolean zonarural) {
        this.zonarural = zonarural;
    }

    
    @Column(name="vacunas")
    public Boolean getVacunas() {
        return this.vacunas;
    }
    
    public void setVacunas(Boolean vacunas) {
        this.vacunas = vacunas;
    }

    
    @Column(name="igm", length=10)
    public String getIgm() {
        return this.igm;
    }
    
    public void setIgm(String igm) {
        this.igm = igm;
    }

    
    @Column(name="igg", length=10)
    public String getIgg() {
        return this.igg;
    }
    
    public void setIgg(String igg) {
        this.igg = igg;
    }

    
    @Column(name="droga", length=18)
    public String getDroga() {
        return this.droga;
    }
    
    public void setDroga(String droga) {
        this.droga = droga;
    }

    
    @Column(name="dosis", nullable=false, length=10)
    public String getDosis() {
        return this.dosis;
    }
    
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    
    @Column(name="resultadoserologia", length=15)
    public String getResultadoserologia() {
        return this.resultadoserologia;
    }
    
    public void setResultadoserologia(String resultadoserologia) {
        this.resultadoserologia = resultadoserologia;
    }

    
    @Column(name="observaciones", length=10)
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }




}


