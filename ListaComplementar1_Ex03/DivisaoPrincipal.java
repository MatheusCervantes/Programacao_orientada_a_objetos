/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 03. Faça um programa que receba dois números, calcule e mostre a divisão do primeiro número 
       pelo segundo. Sabe-se que o segundo número não pode ser zero, portanto não é necessário se 
       preocupar com validações.

 */
public class DivisaoPrincipal {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();
        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " +
                divisao.Calculo(
                        Double.parseDouble(JOptionPane.showInputDialog("Insira o dividendo: ")), 
                        Double.parseDouble(JOptionPane.showInputDialog("Insira o divisor: "))
                ));
    }
}
