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
public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();
    public void calcular (NumeroDTO numeroDTO) {
        numeroDAO.calcular(numeroDTO);
    }
    
    public String imprimir_matriz (NumeroDTO numeroDTO) {
        return numeroDAO.resposta_matriz;
    }
    
    public String diagonal_principal (NumeroDTO numeroDTO) {
        return numeroDAO.diagonal_principal;
    }
}
