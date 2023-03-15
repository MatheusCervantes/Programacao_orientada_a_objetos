/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex05;

/**
 *
 * @author aluno
 */
public class ClassificacaoSoloCTR {
    ClassificacaoSoloDAO classificacaoSoloDAO = new ClassificacaoSoloDAO();
    public String solo (ClassificacaoSoloDTO classificacaoSoloDTO) {
        return classificacaoSoloDAO.solo(classificacaoSoloDTO);
    }
}
