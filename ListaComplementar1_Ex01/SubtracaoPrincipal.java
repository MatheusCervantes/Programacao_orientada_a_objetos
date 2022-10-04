/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex01;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 * 01. Faça um programa que receba dois números, calcule e mostre a subtração do primeiro pelo 
       segundo.
 */
public class SubtracaoPrincipal {
    public static void main(String[] args) {
        Subtracao subtracao = new Subtracao();
        JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + 
        subtracao.Calcular(
            Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: ")) ,
            Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "))
        ));
    }
}
