package org.blh.habilitacion.entities;
// Generated 30-jun-2015 0:45:21 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FraccionamientoId generated by hbm2java
 */
@Embeddable
public class FraccionamientoId  implements java.io.Serializable {


     private int idFraccionamiento;
     private int idBebeReceptor;
     private int idBiberon;

    public FraccionamientoId() {
    }

    public FraccionamientoId(int idFraccionamiento, int idBebeReceptor, int idBiberon) {
       this.idFraccionamiento = idFraccionamiento;
       this.idBebeReceptor = idBebeReceptor;
       this.idBiberon = idBiberon;
    }
   


    @Column(name="idFraccionamiento", nullable=false)
    public int getIdFraccionamiento() {
        return this.idFraccionamiento;
    }
    
    public void setIdFraccionamiento(int idFraccionamiento) {
        this.idFraccionamiento = idFraccionamiento;
    }


    @Column(name="idBebeReceptor", nullable=false)
    public int getIdBebeReceptor() {
        return this.idBebeReceptor;
    }
    
    public void setIdBebeReceptor(int idBebeReceptor) {
        this.idBebeReceptor = idBebeReceptor;
    }


    @Column(name="idBiberon", nullable=false)
    public int getIdBiberon() {
        return this.idBiberon;
    }
    
    public void setIdBiberon(int idBiberon) {
        this.idBiberon = idBiberon;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FraccionamientoId) ) return false;
		 FraccionamientoId castOther = ( FraccionamientoId ) other; 
         
		 return (this.getIdFraccionamiento()==castOther.getIdFraccionamiento())
 && (this.getIdBebeReceptor()==castOther.getIdBebeReceptor())
 && (this.getIdBiberon()==castOther.getIdBiberon());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdFraccionamiento();
         result = 37 * result + this.getIdBebeReceptor();
         result = 37 * result + this.getIdBiberon();
         return result;
   }   


}


