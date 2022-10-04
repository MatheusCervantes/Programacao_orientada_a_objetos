/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex08;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 08. Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que A = lado * 
       lado
 */
public class AreaQuadradoPrincipal {
    public static void main(String[] args) {
        AreaQuadrado areaquadrado = new AreaQuadrado();
        JOptionPane.showMessageDialog(null, "A área do quadrado é de: " +
        areaquadrado.CalcularArea(
                Double.parseDouble(JOptionPane.showInputDialog("Insira o tamanho do lado do quadrado: "))
        )+ " m²"); 
    }
}
