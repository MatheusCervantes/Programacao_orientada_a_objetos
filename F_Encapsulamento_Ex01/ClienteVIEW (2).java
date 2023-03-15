/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex01;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ClienteVIEW {
    public static void main(String[] args) {
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe o seu RG: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: ")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.mostraNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + erro.getMessage());
        }
    }//Fecha o método main
}//Fecha a classe CLienteVIEW
