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
public class CarroDAO extends VeiculoDAO {
    public String imprimirDadosCarro (CarroDTO carroDTO) {
        return imprimiDadosVeiculo(carroDTO) + 
              "\nA Potência é: " + carroDTO.getPotencia()+
              "\nA quantidade de portas é: " + carroDTO.getQtd_portas();
    }
}
