/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_Herenca_Ex01;

/**
 *
 * @author aluno
 */
public class VeiculoDAO {
    public String imprimiDadosVeiculo (VeiculoDTO veiculoDTO) {
        return "A placa é: " + veiculoDTO.getPlaca() + 
               "\nA cor é: " + veiculoDTO.getCor();
    }
}
