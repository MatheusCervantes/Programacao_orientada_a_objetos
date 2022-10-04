/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Switch_Ex06;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class OpPrincipal {
    public static void main(String[] args) {
        Op op = new Op();
        
        JOptionPane.showMessageDialog(null, op.calcular(
                Integer.parseInt(JOptionPane.showInputDialog("Insira a opção desejada: ")), 
                Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: ")), 
                Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "))));
    }     
}
