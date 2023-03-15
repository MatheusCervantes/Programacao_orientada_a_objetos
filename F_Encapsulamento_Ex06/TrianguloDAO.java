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
public class TrianguloDAO {
    private boolean verificar (TrianguloDTO trianguloDTO) {
        if ((trianguloDTO.getLado1() + trianguloDTO.getLado2()) > trianguloDTO.getLado3() && 
            (trianguloDTO.getLado2() + trianguloDTO.getLado3()) > trianguloDTO.getLado1() && 
            (trianguloDTO.getLado1() + trianguloDTO.getLado3()) > trianguloDTO.getLado2())
            return true;
        else
            return false;
    }
    
    public String classificar (TrianguloDTO trianguloDTO) {
        if (verificar(trianguloDTO)== true) {
            if (trianguloDTO.getLado1() == trianguloDTO.getLado2() && trianguloDTO.getLado1() == trianguloDTO.getLado3())
                return "Triângulo Equilátero";
            else if (trianguloDTO.getLado1() != trianguloDTO.getLado2() && trianguloDTO.getLado1() != trianguloDTO.getLado3())
                return "Triângulo Escaleno";
            else
                return "Triângulo Isósceles";
        }
        else
            return "Não é possível criar um triângulo com os lados inseridos.";
    }
}
