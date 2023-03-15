/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex06;

/**
 *
 * @author aluno
 */
public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();
    
    public String classificar (TrianguloDTO trianguloDTO) {
        return trianguloDAO.classificar(trianguloDTO);
    }
}
