/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex04;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class MediaVIEW {
    public static void main(String[] args) {
        try{
            MediaCTR mediaCTR = new MediaCTR();
            MediaDTO mediaDTO = new MediaDTO();
            
            mediaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: ")));
            mediaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: ")));
            
            JOptionPane.showMessageDialog(null, mediaCTR.calcularMedia(mediaDTO));
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
