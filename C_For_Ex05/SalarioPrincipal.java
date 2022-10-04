/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex05;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class SalarioPrincipal {
    public static void main(String[] args) {
        Salario salario = new Salario();
        JOptionPane.showMessageDialog(null, 
                salario.Aumento(Integer.parseInt(JOptionPane.showInputDialog("Insira o ano inicial: ")))
        );
    }
}
