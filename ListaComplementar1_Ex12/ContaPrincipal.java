/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex12;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 12. João recebeu seu salário e precisa pagar duas contas que estão atrasadas. Como as contas 
       estão atrasadas, João terá de pagar multa de 2% sobre cada conta. Faça um programa que 
       calcule e mostre o quanto restará do salário do João.
 */
public class ContaPrincipal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        JOptionPane.showMessageDialog(null, "Após João pagar suas contas sobrará " + conta.Calcular(
            Double.parseDouble(JOptionPane.showInputDialog("Insira o salário: ")), 
            Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta 1: ")), 
            Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta 2: "))
        )+ " de seu salário.");
    }
}
