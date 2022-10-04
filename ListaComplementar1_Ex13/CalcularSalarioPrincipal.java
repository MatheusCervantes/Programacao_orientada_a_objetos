/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex13;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 13. Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo e 
       o número de horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as regras 
       a seguir:
            a) A hora trabalhada vale 1/8 do salário mínimo;
            b) A hora extra vale 1/4 do salário mínimo;
            c) O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da 
               hora trabalhada;
            d) A quantia a receber pelas horas extras equivale ao número de horas extras 
               trabalhadas multiplicado pelo valor da hora extra;
            e) O salário a receber equivale ao salário bruto mais a quantia a receber pelas horas 
               extras.
 */
public class CalcularSalarioPrincipal {
    public static void main(String[] args) {
        CalcularSalario calcularsalario = new CalcularSalario();
        JOptionPane.showMessageDialog(null, "O valor do salário é de: " +
                calcularsalario.SalarioTotal(
                    Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário mínimo: ")),
                    Integer.parseInt(JOptionPane.showInputDialog("Insira as horas trabalhadas: ")), 
                    Integer.parseInt(JOptionPane.showInputDialog("Insira as horas extras trabalhadas: "))
                ));
    }
}
