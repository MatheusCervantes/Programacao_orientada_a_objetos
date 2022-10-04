/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class IntervaloPrincipal {
    public static void main(String[] args) {
        Intervalo intervalo = new Intervalo();
        JOptionPane.showMessageDialog(null, "Este programa mostra o intervalo de 2 números");
        JOptionPane.showMessageDialog(null, intervalo.calculo(
                Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número do intervalo: ")), 
                Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número do intervalo: "))));
    }
}
