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
public class ClienteDAO {
    public String mostrarDadosCli (ClienteDTO clienteDTO) {
        return "Nome: " + clienteDTO.getNome() +
               "\nEndereço: " + clienteDTO.getEndereco() +
               ", " + clienteDTO.getNumero() +
               "\nCidade: " + clienteDTO.getCidade() +
               "\nEstado: " + clienteDTO.getEstado();
    }
}
