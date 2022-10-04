/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex11;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 11. Faça um programa que calcule e mostre a tabuada de um número digitado pelo usuário.
 */
public class TabuadaPrincipal {
    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        JOptionPane.showMessageDialog(null, tabuada.CalcularTabuada(
            Integer.parseInt(JOptionPane.showInputDialog("Insira o número que deseja saber a tabuada: "))
        ));
    }
}
