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
public class ExemploDoWhilePrincipal {
    public static void main(String[] args) {
        int numero;
        ExemploDowhile exemploDowhile = new ExemploDowhile();
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            exemploDowhile.somar(numero);
        }while (numero != 0);
        
        JOptionPane.showMessageDialog(null, exemploDowhile.mostra());
    }
}
