/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex01;

/**
 *
 * @author aluno
 */
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String mostraNomeRg(ClienteDTO clienteDTO) {
        return clienteDAO.mostrarNomeRg(clienteDTO);
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO) {
        return clienteDAO.mostrarNomeIdade(clienteDTO);
    }
    
}// Fecha a classe ClienteCTR