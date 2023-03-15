/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Vetor_Ex02;

/**
 *
 * @author aluno
 */
public class NumeroDAO {
    public String inserirNumero(NumeroDTO numeroDTO) {
        int n[] = new int[20];
        String resposta="";
        n = numeroDTO.getNumero();
        for (int i = 19; i >= 0; i--) {
            resposta += n[i] + "\n";
        }
        return resposta;
    }
}
