/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex2;

/**
 *
 * @author aluno
 */
public class NumeroDAO {
    String resposta_matriz = "Matriz: \n", diagonal_principal = "Diagonal principal: \n";
    public void calcular (NumeroDTO numeroDTO) {
        int n[][] = numeroDTO.getN();
        for (int linha = 0; linha < 20; linha++) {
            for (int coluna = 0; coluna < 20; coluna++) {
                this.resposta_matriz += n[linha][coluna] + "  "; 
                this.diagonal_principal += "  ";
                if (linha==coluna)
                    this.diagonal_principal += n[linha][coluna]; 
            }
            this.resposta_matriz += "\n";
            this.diagonal_principal += "\n";
        }
    }
    
    public String imprimir_matriz (NumeroDTO numeroDTO) {
        return this.resposta_matriz;
    }
    
    public String diagonal_principal (NumeroDTO numeroDTO) {
        return this.diagonal_principal;
    }
}
