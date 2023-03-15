/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex05;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ClassificacaoSoloVIEW {
    public static void main(String[] args) {
        try {
            ClassificacaoSoloCTR classificacaoSoloCTR = new ClassificacaoSoloCTR();
            ClassificacaoSoloDTO classificacaoSoloDTO = new ClassificacaoSoloDTO();
            
            classificacaoSoloDTO.setPontagua(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de água presente na amostra: ")));
            
            JOptionPane.showMessageDialog(null, classificacaoSoloCTR.solo(classificacaoSoloDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
