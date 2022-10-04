/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex14;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 
 * 14. Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa que vai 
       viajar possui. Essa pessoa vai passar por vários países e precisa converter seu dinheiro em 
       dólares, marco alemão e libra esterlina. Sabe-se que a cotação do dólar é de R$ 1,80, do marco 
       alemão é de R$ 2,00 e da libra esterlina é de R$ 1,57. O programa deve fazer as conversões e 
       mostrá-las.
 */
public class ConversaoPrincipal {
    public static void main(String[] args) {
        Conversao conversao = new Conversao();
        JOptionPane.showMessageDialog(null, conversao.Conversao(
                Double.parseDouble(JOptionPane.showInputDialog("Insira o dinheiro em real para ser convertido: "))
        ));
    }
}
