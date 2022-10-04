/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class SomaPrincipal {
    public static void main(String[] args) {
        Soma soma = new Soma();
        for (int i=1; i <= 10; i++){
            soma.calculo(Integer.parseInt(JOptionPane.showInputDialog("Insira o numero " + i + ": ")));
        }
        JOptionPane.showMessageDialog(null, "O resultado da soma dos 10 números é: "+ soma.total());
    }
}
