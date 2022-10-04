/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex07;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 07. Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre esse peso 
       em gramas.
 */
public class GramasPrincipal {
    public static void main(String[] args) {
        Gramas gramas = new Gramas();
        JOptionPane.showMessageDialog(null,"O peso em gramas é: " +
                gramas.Calcular(
                    Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso em KGS: "))
                )+ " gramas");
    }
}
