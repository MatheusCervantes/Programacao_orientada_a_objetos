/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Vetor_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class NumeroVIEW {
    public static void main(String[] args) {
        try {
            NumeroDTO numeroDTO = new NumeroDTO();
            NumeroCTR numeroCTR = new NumeroCTR();
            int num[] = new int[5];
            
            for (int i = 0; i < num.length; i++) {
                num [i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o numéro da posição " + i + ": "));
            }
            
            numeroDTO.setN(num);
            JOptionPane.showMessageDialog(null, numeroCTR.verificarPosicao(numeroDTO));
                    
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no sistema: " + e.getMessage());
        }
    }
}
 