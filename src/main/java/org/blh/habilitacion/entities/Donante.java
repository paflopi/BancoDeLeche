package org.blh.habilitacion.entities;
// Generated 06-jul-2015 22:01:19 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Donante generated by hbm2java
 */
@Entity
@Table(name="donante"
    ,schema="public"
)
public class Donante  implements java.io.Serializable {


     private int nrodonante;
     private Medios medios;
     private String apellynombredonante;
     private String dni;
     private Date fechnac;
     private String telefono;
     private String estadocivil;
     private String ocupacion;
     private String nivelestudio;
     private String email;
     private String tipodonante;
     private Set consentimientos = new HashSet(0);

    public Donante() {
    }

	
    public Donante(int nrodonante, Medios medios, String apellynombredonante, String dni) {
        this.nrodonante = nrodonante;
        this.medios = medios;
        this.apellynombredonante = apellynombredonante;
        this.dni = dni;
    }
    public Donante(int nrodonante, Medios medios, String apellynombredonante, String dni, Date fechnac, String telefono, String estadocivil, String ocupacion, String nivelestudio, String email, String tipodonante, Set consentimientos) {
       this.nrodonante = nrodonante;
       this.medios = medios;
       this.apellynombredonante = apellynombredonante;
       this.dni = dni;
       this.fechnac = fechnac;
       this.telefono = telefono;
       this.estadocivil = estadocivil;
       this.ocupacion = ocupacion;
       this.nivelestudio = nivelestudio;
       this.email = email;
       this.tipodonante = tipodonante;
       this.consentimientos = consentimientos;
    }
   
     @Id 

    
    @Column(name="nrodonante", unique=true, nullable=false)
    public int getNrodonante() {
        return this.nrodonante;
    }
    
    public void setNrodonante(int nrodonante) {
        this.nrodonante = nrodonante;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idmedios", nullable=false)
    public Medios getMedios() {
        return this.medios;
    }
    
    public void setMedios(Medios medios) {
        this.medios = medios;
    }

    
    @Column(name="apellynombredonante", nullable=false, length=30)
    public String getApellynombredonante() {
        return this.apellynombredonante;
    }
    
    public void setApellynombredonante(String apellynombredonante) {
        this.apellynombredonante = apellynombredonante;
    }

    
    @Column(name="dni", nullable=false, length=10)
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechnac", length=13)
    public Date getFechnac() {
        return this.fechnac;
    }
    
    public void setFechnac(Date fechnac) {
        this.fechnac = fechnac;
    }

    
    @Column(name="telefono", length=15)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="estadocivil", length=10)
    public String getEstadocivil() {
        return this.estadocivil;
    }
    
    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    
    @Column(name="ocupacion", length=30)
    public String getOcupacion() {
        return this.ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    
    @Column(name="nivelestudio", length=20)
    public String getNivelestudio() {
        return this.nivelestudio;
    }
    
    public void setNivelestudio(String nivelestudio) {
        this.nivelestudio = nivelestudio;
    }

    
    @Column(name="email", length=20)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="tipodonante", length=15)
    public String getTipodonante() {
        return this.tipodonante;
    }
    
    public void setTipodonante(String tipodonante) {
        this.tipodonante = tipodonante;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="donante")
    public Set getConsentimientos() {
        return this.consentimientos;
    }
    
    public void setConsentimientos(Set consentimientos) {
        this.consentimientos = consentimientos;
    }




}


