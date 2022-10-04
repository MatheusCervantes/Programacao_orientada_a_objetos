/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 02. Faça um programa que receba três números, calcule e mostre a multiplicação desses 
       números.
 */
public class MultiplicacaoPrincipal {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = new Multiplicacao();
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação do três número é: " +
            multiplicacao.Calculo(
                Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: ")) ,
                Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: ")) ,
                Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número: "))
            ));
    }
}
