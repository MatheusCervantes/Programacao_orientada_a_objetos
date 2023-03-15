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
public class FisicoDAO extends ClienteDAO {
    public String mostrarDadosCli (FisicoDTO fisicoDTO) {
        return super.mostrarDadosCli(fisicoDTO) +
               "\nCPF: " + fisicoDTO.getCpf() +
               "\nRG: " + fisicoDTO.getRg();
    }
}
