/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex1;
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
            int n[][] = new int[2][3];
            for (int linha = 0; linha < 2; linha++) {
                for (int coluna = 0; coluna < 3; coluna++) {
                    n[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da posição (" + (linha+1) + "," + (coluna+2) + ") :"));
                }
            }
            
            numeroDTO.setN(n);
            
            JOptionPane.showMessageDialog(null, numeroCTR.mostrarMatriz(numeroDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
