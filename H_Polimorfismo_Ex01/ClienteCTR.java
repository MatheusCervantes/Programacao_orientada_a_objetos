/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex01;

/**
 *
 * @author aluno
 */
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    public String mostrarInformacoes (ClienteDTO clienteDTO) {
        return clienteDAO.mostrarInformacoes(clienteDTO);
    }
}
