/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex1;

/**
 *
 * @author aluno
 */
public class NumeroDAO {
    public String mostrarMatriz (NumeroDTO numeroDTO) {
        String resposta="";
        int n[][] = numeroDTO.getN();
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                resposta += n[linha][coluna] + "  ";
            }
            resposta += "\n";
        }
        return resposta;
    }
}
