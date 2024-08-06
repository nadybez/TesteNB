package appareatrapezioconstrutor;

import entidades.Trapezio;

import entidades.Trapezio;

/**
 *
 * @author nadjowany.sbezerra
 */
public class AppAreaTrapezioConstrutor {

    public static void main(String[] args) {
       double  baseMaior = 12; 
       double baseMenor = 7.5;
       double altura = 6.3;
       
       Trapezio x = new Trapezio (baseMaior,baseMenor,altura);
       System.out.printf("Área X = %.2f%n", x.area());
       System.out.printf("Obrigada.", x.area());
    }
    
}
