/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class SalarioPrincipal {
    public static void main(String[] args) {
        Salario salario = new Salario();
        JOptionPane.showMessageDialog(null, "O salário com aumento é: " + 
                salario.calcularSalario(
                Float.parseFloat(JOptionPane.showInputDialog("Informe o salário: ")),
                Float.parseFloat(JOptionPane.showInputDialog("Informe o valor em porcentagem do aumento: "))
                                       )                      
                                     );
    }
}
