/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Interface_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class MotoristaVIEW {
    public static void main(String[] args) {
        try {
            MotoristaCTR motoristaCTR = new MotoristaCTR();
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: ")));
            
            JOptionPane.showMessageDialog(null, motoristaCTR.calcular(motoristaDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
