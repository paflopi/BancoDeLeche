package org.blh.habilitacion.entities;
// Generated 30-jun-2015 0:45:21 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SerologiaId generated by hbm2java
 */
@Embeddable
public class SerologiaId  implements java.io.Serializable {


     private int nroSerologia;
     private int nroConcentimiento;

    public SerologiaId() {
    }

    public SerologiaId(int nroSerologia, int nroConcentimiento) {
       this.nroSerologia = nroSerologia;
       this.nroConcentimiento = nroConcentimiento;
    }
   


    @Column(name="nroSerologia", nullable=false)
    public int getNroSerologia() {
        return this.nroSerologia;
    }
    
    public void setNroSerologia(int nroSerologia) {
        this.nroSerologia = nroSerologia;
    }


    @Column(name="nroConcentimiento", nullable=false)
    public int getNroConcentimiento() {
        return this.nroConcentimiento;
    }
    
    public void setNroConcentimiento(int nroConcentimiento) {
        this.nroConcentimiento = nroConcentimiento;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SerologiaId) ) return false;
		 SerologiaId castOther = ( SerologiaId ) other; 
         
		 return (this.getNroSerologia()==castOther.getNroSerologia())
 && (this.getNroConcentimiento()==castOther.getNroConcentimiento());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getNroSerologia();
         result = 37 * result + this.getNroConcentimiento();
         return result;
   }   


}

