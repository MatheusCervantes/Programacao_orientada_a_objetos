/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cardapio;
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus
 */
public class CardapioVIEW {
    public static void main(String[] args) {
        try{
            CardapioCTR cardapioCTR = new CardapioCTR();
            CardapioDTO cardapioDTO = new CardapioDTO();
            while (cardapioDTO.getCodigo() != 0) {
                JOptionPane.showMessageDialog(null, 
                      "---------------------------------------------------------\n"
                    + "|Código         Produto                   Preço(R$)\n"
                    + "|1                    Hamburger                1.50\n"
                    + "|2                    Cheeseburguer        1.80\n"
                    + "|3                    Misto Quente            1.20\n"
                    + "|4                    Americano                2.00\n"
                    + "|5                    Queijo Prato             1.00\n"
                    + "---------------------------------------------------------\n"      
                    + "|0                    Para Sair\n"   
                    + "---------------------------------------------------------\n" 
                );
                cardapioDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto que desejada adquirir: ")));
                if ((cardapioDTO.getCodigo() <0) || cardapioDTO.getCodigo() >5)
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                else
                    cardapioCTR.calcular(cardapioDTO);
            }
            JOptionPane.showMessageDialog(null, cardapioCTR.NotaFiscal(cardapioDTO));
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
