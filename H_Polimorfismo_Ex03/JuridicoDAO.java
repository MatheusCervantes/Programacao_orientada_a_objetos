/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex03;

/**
 *
 * @author aluno
 */
public class JuridicoDAO extends ClienteDAO {
    public String mostrarDadosCli (JuridicoDTO juridicoDTO) {  
        return super.mostrarDadosCli(juridicoDTO) +
               "\nCNPJ: " + juridicoDTO.getCnpj() +
               "\nIE: " + juridicoDTO.getIe();
    }
}
