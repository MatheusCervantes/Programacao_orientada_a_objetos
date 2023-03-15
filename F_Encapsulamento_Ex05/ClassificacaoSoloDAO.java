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
public class ClassificacaoSoloDAO {
    public String solo (ClassificacaoSoloDTO classificacaoSoloDTO) {
        if ((classificacaoSoloDTO.getPontagua() <= 10) && (classificacaoSoloDTO.getPontagua() >= 0))
            return "A amostrar é do tipo: Rochoso";
        else if ((classificacaoSoloDTO.getPontagua() > 10) && (classificacaoSoloDTO.getPontagua() <= 40))
            return "A amostrar é do tipo: Firme";
        else if ((classificacaoSoloDTO.getPontagua() > 40) && (classificacaoSoloDTO.getPontagua() <= 80))
            return "A amostrar é do tipo: Pantanoso";
        else
            return "Quantidade de água inválida.";
    }
}
