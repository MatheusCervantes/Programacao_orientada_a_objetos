/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex09;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 09. Faça um programa que calcule e mostre a área de um losango. Sabe-se que A = (diagonal 
       maior * diagonal menor)/2
 */
public class AreaLosangoPrincipal {
    public static void main(String[] args) {
        AreaLosango arealosango = new AreaLosango();
        JOptionPane.showMessageDialog(null, "A área do losango é de: " +
                arealosango.Calcular(
                    Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da diagonal maior: ")), 
                    Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da diagonal menor: "))
                ) + " m²");
    }
}
