/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex03;

/**
 *
 * @author aluno
 */
public class MotoristaDAO {
    public String permissaoCNH (MotoristaDTO motoristaDTO) {
        if (motoristaDTO.getIdade() >= 18)
            return "Você pode ter CNH.";
        else
            return "Você não tem idade suficiente para ter CNH.";
    }
}
