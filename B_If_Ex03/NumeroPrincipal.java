/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_If_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class NumeroPrincipal {
    public static void main(String[] args) {
        Numero numero = new Numero();
    
    JOptionPane.showMessageDialog(null, "Em ordem descrescente os números são: " +
            numero.resposta(Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número em ordem crescente: ")), 
                    Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número em ordem crescente: ")), 
                    Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número em ordem crescente: ")), 
                    Integer.parseInt(JOptionPane.showInputDialog("Insira o quarto número pode ser aleatório: "))
            ));
    }
}
