/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cardapio;

/**
 *
 * @author Matheus
 */
public class CardapioCTR {
    CardapioDAO cardapioDAO = new CardapioDAO();
    public String NotaFiscal (CardapioDTO cardapioDTO){
        return cardapioDAO.NotaFiscal(cardapioDTO);
    }
    
    public void calcular (CardapioDTO cardapioDTO){ 
        cardapioDAO.calcular(cardapioDTO);
    };
}
