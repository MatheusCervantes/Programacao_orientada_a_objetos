/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class MediaVIEW {
    public static void main(String[] args) {
        try {
            MediaCTR mediaCTR = new MediaCTR();
            MediaDTO mediaDTO = new MediaDTO();
            
            mediaDTO.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Insira a Nota 1: ")));
            mediaDTO.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Insira a Nota 2: ")));
            mediaDTO.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Insira a Nota 3: ")));
            mediaDTO.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Insira a Nota 4: ")));
            
            mediaDTO.setOpc(Integer.parseInt(JOptionPane.showInputDialog
                ("Escolha uma opção: "
               + "\n2- Calcular média das 2 primeiras notas"
               + "\n3- Calcular média das 3 primeiras notas"
               + "\n4- Calcular média das 4 notas")));
            
            mediaCTR.calcularMedia(mediaDTO);
            
            JOptionPane.showMessageDialog(null, mediaCTR.imprimir());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no sistema: " + e.getMessage());
        }
    }
}
