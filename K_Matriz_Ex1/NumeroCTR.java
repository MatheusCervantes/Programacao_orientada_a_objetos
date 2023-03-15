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
public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();
    public String mostrarMatriz (NumeroDTO numeroDTO) {
        return numeroDAO.mostrarMatriz(numeroDTO);
    }
}
