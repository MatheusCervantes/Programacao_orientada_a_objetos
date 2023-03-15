/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex06;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class TrianguloVIEW {
    public static void main(String[] args) {
        try {
            TrianguloCTR trianguloCTR = new TrianguloCTR();
            TrianguloDTO trianguloDTO = new TrianguloDTO();
            trianguloDTO.setLado1(Double.parseDouble(JOptionPane.showInputDialog("Insira o lado 1: ")));
            trianguloDTO.setLado2(Double.parseDouble(JOptionPane.showInputDialog("Insira o lado 2: ")));
            trianguloDTO.setLado3(Double.parseDouble(JOptionPane.showInputDialog("Insira o lado 3: ")));
        
            JOptionPane.showMessageDialog(null,trianguloCTR.classificar(trianguloDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
