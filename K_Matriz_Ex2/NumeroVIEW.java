/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex2;
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
            
            int n[][] = new int[20][20];
            
            for (int linha = 0; linha < 20; linha++) {
                for (int coluna = 0; coluna < 20; coluna++) {
                    n[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da posição (" + (linha+1) + "," + (coluna+1) + ") :" ));
                }
            }
            
            numeroDTO.setN(n);
            
            numeroCTR.calcular(numeroDTO);
            JOptionPane.showMessageDialog(null, numeroCTR.imprimir_matriz(numeroDTO));
            JOptionPane.showMessageDialog(null, numeroCTR.diagonal_principal(numeroDTO));            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
