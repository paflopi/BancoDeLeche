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
 * Entregadebiberonacentro generated by hbm2java
 */
@Entity
@Table(name="entregadebiberonacentro"
    ,schema="public"
)
public class Entregadebiberonacentro  implements java.io.Serializable {


     private EntregadebiberonacentroId id;
     private Biberon biberon;
     private Centros centros;
     private Date fechaEntrega;

    public Entregadebiberonacentro() {
    }

	
    public Entregadebiberonacentro(EntregadebiberonacentroId id, Biberon biberon, Centros centros) {
        this.id = id;
        this.biberon = biberon;
        this.centros = centros;
    }
    public Entregadebiberonacentro(EntregadebiberonacentroId id, Biberon biberon, Centros centros, Date fechaEntrega) {
       this.id = id;
       this.biberon = biberon;
       this.centros = centros;
       this.fechaEntrega = fechaEntrega;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idcentro", column=@Column(name="idcentro", nullable=false) ), 
        @AttributeOverride(name="idbiberon", column=@Column(name="idbiberon", nullable=false) ) } )
    public EntregadebiberonacentroId getId() {
        return this.id;
    }
    
    public void setId(EntregadebiberonacentroId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idbiberon", nullable=false, insertable=false, updatable=false)
    public Biberon getBiberon() {
        return this.biberon;
    }
    
    public void setBiberon(Biberon biberon) {
        this.biberon = biberon;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idcentro", nullable=false, insertable=false, updatable=false)
    public Centros getCentros() {
        return this.centros;
    }
    
    public void setCentros(Centros centros) {
        this.centros = centros;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechaEntrega", length=13)
    public Date getFechaEntrega() {
        return this.fechaEntrega;
    }
    
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }




}


