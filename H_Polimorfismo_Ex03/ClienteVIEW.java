/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ClienteVIEW {
    public static void main(String[] args) {
        try {
            FisicoDTO fisicoDTO = new FisicoDTO();
            FisicoCTR fisicoCTR = new FisicoCTR();
            
            fisicoDTO.setNome(JOptionPane.showInputDialog("Insira o nome: "));
            fisicoDTO.setEndereco(JOptionPane.showInputDialog("Insira o endereço: "));
            fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número: ")));
            fisicoDTO.setCidade(JOptionPane.showInputDialog("Insira a cidade: "));
            fisicoDTO.setEstado(JOptionPane.showInputDialog("Insira o estado: "));
            fisicoDTO.setCpf(JOptionPane.showInputDialog("Insira o CPF: "));
            fisicoDTO.setRg(JOptionPane.showInputDialog("Insira o RG: "));
            
            JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDadosCli(fisicoDTO));
            
            JuridicoDTO juridicoDTO = new JuridicoDTO();
            JuridicoCTR juridicoCTR = new JuridicoCTR();
            
            juridicoDTO.setNome(JOptionPane.showInputDialog("Insira o nome da empresa: "));
            juridicoDTO.setEndereco(JOptionPane.showInputDialog("Insira o endereço: "));
            juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número: ")));
            juridicoDTO.setCidade(JOptionPane.showInputDialog("Insira a cidade: "));
            juridicoDTO.setEstado(JOptionPane.showInputDialog("Insira o estado: "));
            juridicoDTO.setCnpj(JOptionPane.showInputDialog("Insira o CNPF: "));
            juridicoDTO.setIe(JOptionPane.showInputDialog("Insira o IE: "));
            
            JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDadosCli(juridicoDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
