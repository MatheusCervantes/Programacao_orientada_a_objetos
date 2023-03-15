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
public class ClienteDAO {
   public String mostrarDadosCliente(ClienteDTO clienteDTO) {
       return   "Nome: " + clienteDTO.getNome() +
              "\nEndereço: " + clienteDTO.getEndereco() +
              "\nNumero: " + clienteDTO.getNumero() + 
              "\nCidade: " + clienteDTO.getCidade() +
              "\nEstado: " + clienteDTO.getEstado();
   }
}
