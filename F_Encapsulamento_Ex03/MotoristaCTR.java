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
public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String permissaoCNH (MotoristaDTO motoristaDTO) {
        return motoristaDAO.permissaoCNH(motoristaDTO);
    }
            
}
