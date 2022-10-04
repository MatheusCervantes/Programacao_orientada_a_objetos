/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_If_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class SoloPrincipal {
    public static void main(String[] args) {
        Solo solo = new Solo();
        
        JOptionPane.showMessageDialog(null, "A rocha é do tipo: " +
                solo.resolver(Integer.parseInt(JOptionPane.showInputDialog("Digite a pontuação de água presente no solo: "))));
    }
}
