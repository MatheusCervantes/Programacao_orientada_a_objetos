/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ClienteVIEW {
    public static void main(String[] args) {
        try {
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Informa o nome: "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
            clienteDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarInformacoes(clienteDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no sistema: " + e .getMessage());
        }
    }
}
