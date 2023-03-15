/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Vetor_Ex01;

/**
 *
 * @author aluno
 */
public class NumeroDAO {
    private String resposta = "";
    public String verificarPosicao (NumeroDTO numeroDTO) {
        int n[] = numeroDTO.getN();
        for (int i = 0; i < n.length; i++) {
            if (i%2==0)
                this.resposta += n[i] + "\n";
        }
        return this.resposta;
    }
}

