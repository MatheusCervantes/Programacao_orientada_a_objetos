/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex05;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 05. Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, 
       sabendo-se que este sofreu um desconto de 10%.
 */
public class DescontoPrincipal {
    public static void main(String[] args) {
        Desconto desconto = new Desconto();
        JOptionPane.showMessageDialog(null, "O valor do produto com o desconto 10% é de: " +
                desconto.Calcular(
                Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto: "))
                ));
    }
}
