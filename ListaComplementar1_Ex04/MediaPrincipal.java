/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex04;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 04. Faça um programa que receba duas notas, calcule e mostre a média ponderada dessas 
   notas, considerando peso 2 para a primeira nota e peso 3 para a segunda nota
 */
public class MediaPrincipal {
    public static void main(String[] args) {
        Media media = new Media();
        JOptionPane.showMessageDialog(null, "A média é de: " +
                media.Calcular(
                    Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: ")), 
                    Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "))
                ));
    }
}
