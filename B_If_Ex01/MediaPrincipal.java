/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_If_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class MediaPrincipal {
    public static void main(String[] args) {
        Media media = new Media();
        
        JOptionPane.showMessageDialog(null, "A situação do aluno é: " +
                media.calcular(
                        Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 1")),
                        Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 2"))
        ));
    }
}
