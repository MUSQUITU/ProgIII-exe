
package exercicio.um;

/**
 *
 * @author camila
 */
public class Nota {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 10;
        double n3 = 4;
        double n4 = 3;
  
        Nota nota = new Nota();
        System.out.println("a média é " + nota.cal(n1, n2, n3, n4));
        
    }
    public double cal (double n1, double n2, double n3, double n4){
        return (n1+n2+n3+n4) / 4;
    }
}
