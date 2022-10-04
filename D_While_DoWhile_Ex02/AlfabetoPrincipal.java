/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class AlfabetoPrincipal {
    public static void main(String[] args) {
        String cont="";
        Alfabeto alfabeto = new Alfabeto();
        while (!cont.equalsIgnoreCase("0")){
            cont = JOptionPane.showInputDialog("Caso queira sair digite 0.\nDigite uma letra: ");
            alfabeto.tletras(cont);
        }
        JOptionPane.showMessageDialog(null, alfabeto.mostrar());
    }
}
