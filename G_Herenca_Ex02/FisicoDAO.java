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
public class FisicoDAO extends ClienteDAO{
    public String mostrarDadosFisico(FisicoDTO fisicoDTO) {
        return mostrarDadosCliente(fisicoDTO) + 
               "\nCPF: " + fisicoDTO.getCpf() +
               "\nRG: " + fisicoDTO.getRg();
        
    }
}
