
package entidades;

/**
 *
 * @author nadjowany.sbezerra
 */
public class Trapezio {
   public double baseMaior;
   public double baseMenor;
   public double altura;
   
   public Trapezio (double baseMaior, double baseMenor, double altura){
       this.baseMaior = baseMaior;
       this.baseMenor = baseMenor;
       this.altura = altura;
   }
   
   public double area (){
       return (baseMaior + baseMenor) * altura / 2.00;
   }
}

