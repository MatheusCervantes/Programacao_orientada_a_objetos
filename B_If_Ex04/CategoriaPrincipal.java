/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_If_Ex04;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class CategoriaPrincipal {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        
       JOptionPane.showMessageDialog(null, "A categoria designada para seu peso e altura é: " +
               categoria.cat( 
               Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura: ")),
               Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso: "))
               ));
    }
}
