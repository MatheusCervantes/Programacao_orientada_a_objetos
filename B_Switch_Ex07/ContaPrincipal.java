/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Switch_Ex07;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ContaPrincipal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        JOptionPane.showMessageDialog(null, conta.calcular(
                JOptionPane.showInputDialog("Insira A para adição, S para subtração, M para multiplicação e D para divisão.\nInsira a opção desejada: "), 
                Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "))
        ));
    }
}
