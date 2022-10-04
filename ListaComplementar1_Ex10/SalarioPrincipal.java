/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex10;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 10. Faça um programa que receba o valor do salário mínimo e o valor do salário de um 
       funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
 */
public class SalarioPrincipal {
    public static void main(String[] args) {
        Salario salario = new Salario();
        JOptionPane.showMessageDialog(null, "Este funcionário recebe " + 
                salario.Calcular(
                    Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário mínimo atual: ")),
                    Double.parseDouble(JOptionPane.showInputDialog("Insira o seu salário: "))
                ) + " salários mínimo.");
    }
}
