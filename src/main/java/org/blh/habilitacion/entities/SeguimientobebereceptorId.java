package org.blh.habilitacion.entities;
// Generated 30-jun-2015 0:45:21 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SeguimientobebereceptorId generated by hbm2java
 */
@Embeddable
public class SeguimientobebereceptorId  implements java.io.Serializable {


     private int idSegBebeReceptor;
     private int idBebeReceptor;

    public SeguimientobebereceptorId() {
    }

    public SeguimientobebereceptorId(int idSegBebeReceptor, int idBebeReceptor) {
       this.idSegBebeReceptor = idSegBebeReceptor;
       this.idBebeReceptor = idBebeReceptor;
    }
   


    @Column(name="idSegBebeReceptor", nullable=false)
    public int getIdSegBebeReceptor() {
        return this.idSegBebeReceptor;
    }
    
    public void setIdSegBebeReceptor(int idSegBebeReceptor) {
        this.idSegBebeReceptor = idSegBebeReceptor;
    }


    @Column(name="idBebeReceptor", nullable=false)
    public int getIdBebeReceptor() {
        return this.idBebeReceptor;
    }
    
    public void setIdBebeReceptor(int idBebeReceptor) {
        this.idBebeReceptor = idBebeReceptor;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SeguimientobebereceptorId) ) return false;
		 SeguimientobebereceptorId castOther = ( SeguimientobebereceptorId ) other; 
         
		 return (this.getIdSegBebeReceptor()==castOther.getIdSegBebeReceptor())
 && (this.getIdBebeReceptor()==castOther.getIdBebeReceptor());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdSegBebeReceptor();
         result = 37 * result + this.getIdBebeReceptor();
         return result;
   }   


}

