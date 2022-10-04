/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class TabuadaPrincipal {
    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        JOptionPane.showMessageDialog(null, tabuada.calcular(Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para calcular a tabuada: "))));
    }
}
