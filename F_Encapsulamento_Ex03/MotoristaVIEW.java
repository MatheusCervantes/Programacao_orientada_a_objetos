/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class MotoristaVIEW {
    public static void main(String[] args) {
        try{
            MotoristaCTR motoristaCTR = new MotoristaCTR();
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade: ")));
            
            JOptionPane.showMessageDialog(null, motoristaCTR.permissaoCNH(motoristaDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
