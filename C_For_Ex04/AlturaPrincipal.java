/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex04;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class AlturaPrincipal {
    public static void main(String[] args) {
        Altura altura = new Altura();
        for (int i=1; i <= 20; i++){
            altura.Calcular(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura " + i + ": ")));
        }
        JOptionPane.showMessageDialog(null, "Há " + altura.Maior2m() + " pessoa(s) que têm mais de 2 metros de altura.");
        JOptionPane.showMessageDialog(null, "A média é: " + altura.Media());
    }
}
