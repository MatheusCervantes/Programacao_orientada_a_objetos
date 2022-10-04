/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex06;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 06. Faça um programa que receba o peso de uma pessoa, calcule e mostre:
            a) O novo peso se a pessoa engordar 15% sobre o peso digitado;
            b) O novo peso se a pessoa emagrecer 20% sobre o peso digitado.
 */
public class PesoPrincipal {
    public static void main(String[] args) {
        Peso peso = new Peso();
        JOptionPane.showMessageDialog(null, peso.Calcular(
            Double.parseDouble(JOptionPane.showInputDialog("Insira o peso: "))
        ));
    }
}
