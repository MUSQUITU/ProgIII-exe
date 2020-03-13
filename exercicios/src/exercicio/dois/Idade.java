
package exercicio.dois;

import javax.swing.JOptionPane;

/**
 *
 * @author camila
 */
public class Idade {
    public static void main(String[] args) {
        int idade;
        String id;
        
        
        id = JOptionPane.showInputDialog("DIGA SUA IDADE AE MENOR: ");
        idade = Integer.parseInt(id);
        
        if(idade >18) {
           JOptionPane.showMessageDialog(null, "de maior");
        }
        else
       JOptionPane.showMessageDialog(null, "de menor");
   
        
        
    }

}
