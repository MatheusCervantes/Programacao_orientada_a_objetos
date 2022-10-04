/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class ExemploWhilePrincipal {
    public static void main(String[] args) {
        ExemploWhile exwhile = new ExemploWhile();
        int numero = 1;
        while (numero != 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
            exwhile.somar(numero);
        }
        JOptionPane.showMessageDialog(null, exwhile.mostra());
    }
}
