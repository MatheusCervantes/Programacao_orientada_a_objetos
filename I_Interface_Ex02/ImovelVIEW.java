/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Interface_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ImovelVIEW {
    public static void main(String[] args) {
        try{
            CasaDTO casaDTO = new CasaDTO();
            CasaCTR casaCTR = new CasaCTR();
            
            casaDTO.setEndereco(JOptionPane.showInputDialog("Insira o endereço do imóvel: "));
            casaDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Insira o número do imóvel: ")));
            casaDTO.setBairro(JOptionPane.showInputDialog("Insira o bairro: "));
            casaDTO.setCidade(JOptionPane.showInputDialog("Insira a cidade: "));
            casaDTO.setProprietario(JOptionPane.showInputDialog("Insira o nome do proprietário: "));
            casaDTO.setN_quartos(Integer.parseInt(JOptionPane.showInputDialog("Insira o número de quartos: ")));
            casaDTO.setN_banheiros(Integer.parseInt(JOptionPane.showInputDialog("Insira o número de banheiros: ")));
            
            JOptionPane.showMessageDialog(null, casaCTR.publicarDados(casaDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}