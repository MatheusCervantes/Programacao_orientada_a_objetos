/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex06;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class NumeroPrincipal {
    public static void main(String[] args) {
        Numero numero = new Numero();
        for (int n = 0; n<10; n++)
            numero.MnumeroNnumero(Integer.parseInt(JOptionPane.showInputDialog("\nDigite o número " + (n+1) + ": ")));
        JOptionPane.showMessageDialog(null,numero.MostrarNmNn());
    }
}
