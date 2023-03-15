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
public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();
    public String verificarPosicao (NumeroDTO numeroDTO) {
        return numeroDAO.verificarPosicao(numeroDTO);
    }
}
