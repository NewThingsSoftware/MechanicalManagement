package entidades;
// Generated 17/04/2013 10:28:10 by Hibernate Tools 3.2.1.GA



/**
 * PecaUsadaId generated by hbm2java
 */
public class PecaUsadaId  implements java.io.Serializable {


     private int idPecaUsada;
     private int idOrdemServico;
     private int idPeca;

    public PecaUsadaId() {
    }

    public PecaUsadaId(int idOrdemServico, int idPeca) {
        this.idOrdemServico = idOrdemServico;
        this.idPeca = idPeca;
    }

    public PecaUsadaId(int idPecaUsada, int idOrdemServico, int idPeca) {
       this.idPecaUsada = idPecaUsada;
       this.idOrdemServico = idOrdemServico;
       this.idPeca = idPeca;
    }
   
    public int getIdPecaUsada() {
        return this.idPecaUsada;
    }
    
    public void setIdPecaUsada(int idPecaUsada) {
        this.idPecaUsada = idPecaUsada;
    }
    public int getIdOrdemServico() {
        return this.idOrdemServico;
    }
    
    public void setIdOrdemServico(int idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }
    public int getIdPeca() {
        return this.idPeca;
    }
    
    public void setIdPeca(int idPeca) {
        this.idPeca = idPeca;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PecaUsadaId) ) return false;
		 PecaUsadaId castOther = ( PecaUsadaId ) other; 
         
		 return (this.getIdPecaUsada()==castOther.getIdPecaUsada())
 && (this.getIdOrdemServico()==castOther.getIdOrdemServico())
 && (this.getIdPeca()==castOther.getIdPeca());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdPecaUsada();
         result = 37 * result + this.getIdOrdemServico();
         result = 37 * result + this.getIdPeca();
         return result;
   }   


}


