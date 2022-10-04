/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class MediaPrincipal {
    public static void main(String[] args) {
        Media media = new Media();
        JOptionPane.showMessageDialog(null, "A média é: " + 
                media.calcularMedia(
                Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: ")), 
                Float.parseFloat(JOptionPane.showInputDialog("Informe o peso da primeira nota: ")), 
                Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: ")),
                Float.parseFloat(JOptionPane.showInputDialog("Informe o peso da segunda nota: ")),         
                Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: ")), 
                Float.parseFloat(JOptionPane.showInputDialog("Informe o peso da terceira nota: "))         
                ));
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    
}
