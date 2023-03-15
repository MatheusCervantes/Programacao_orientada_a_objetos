/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_Herenca_Ex02;

/**
 *
 * @author aluno
 */
public class JuridicoDAO extends ClienteDAO{
    public String mostrarDadosJuri(JuridicoDTO juridicoDTO){
        return mostrarDadosCliente(juridicoDTO) + 
               "\nCNPJ: " + juridicoDTO.getCnpj() +
               "\nIE: " + juridicoDTO.getIe();
    }
}
