/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Vetor_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class NumeroVIEW {

    public static void main(String[] args) {
        try {
            NumeroCTR numeroCTR = new NumeroCTR();
            NumeroDTO numeroDTO = new NumeroDTO();
            int num[] = new int[20];

            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o número na posição " + (i + 1) + ": "));
            }

            numeroDTO.setNumero(num);
            JOptionPane.showMessageDialog(null, numeroCTR.inserirNumero(numeroDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
