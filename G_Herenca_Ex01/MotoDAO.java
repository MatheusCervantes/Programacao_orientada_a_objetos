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
public class MotoDAO extends VeiculoDAO {
    public String imprimirDadosMoto (MotoDTO motoDTO) {
        return imprimiDadosVeiculo(motoDTO) + 
            "\nAs Cilindradas é: " + motoDTO.getCilindrada() +
            "\nO Tipo do Motor é: " + motoDTO.getTipo_motor();       
    }
}
