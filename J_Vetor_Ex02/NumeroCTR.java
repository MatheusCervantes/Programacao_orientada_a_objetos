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
public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();   
    public String inserirNumero(NumeroDTO numeroDTO) {
        return numeroDAO.inserirNumero(numeroDTO);
    }
}
