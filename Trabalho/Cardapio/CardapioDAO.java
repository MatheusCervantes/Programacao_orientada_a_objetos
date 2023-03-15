/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cardapio;

/**
 *
 * @author Matheus
 */
public class CardapioDAO {
    public void calcular (CardapioDTO cardapioDTO) {
        if (cardapioDTO.getCodigo() == 1) {   
            cardapioDTO.setThamburger(((cardapioDTO.getThamburger())+1.5));
            cardapioDTO.setTotal((cardapioDTO.getTotal() + 1.5));
        }
        else if (cardapioDTO.getCodigo() == 2) {
            cardapioDTO.setTcheeseburger(((cardapioDTO.getTcheeseburger()) + 1.8));
            cardapioDTO.setTotal((cardapioDTO.getTotal() + 1.8));
        }
        else if (cardapioDTO.getCodigo() == 3) {
            cardapioDTO.setTmistoquente(((cardapioDTO.getTmistoquente()) + 1.2));
            cardapioDTO.setTotal((cardapioDTO.getTotal() + 1.2));
        }
        else if (cardapioDTO.getCodigo() == 4) {
            cardapioDTO.setTamericano(((cardapioDTO.getTamericano()) + 2));
            cardapioDTO.setTotal((cardapioDTO.getTotal() + 2));
        }
        else if (cardapioDTO.getCodigo() == 5) {
            cardapioDTO.setTqueijoprato(((cardapioDTO.getTqueijoprato())+ 1));
            cardapioDTO.setTotal((cardapioDTO.getTotal() + 1));
        }
    }
    
    public String NotaFiscal (CardapioDTO cardapioDTO) {
        String mensagem =           "---------------------------------------------------------\n"
                                 +  "|Código       Produto                   Preço(R$)\n";
        if (cardapioDTO.getThamburger()!=0)
            mensagem = mensagem +   "|1                 Hamburger                   " + cardapioDTO.getThamburger();
        if (cardapioDTO.getTcheeseburger()!=0)
            mensagem = mensagem + "\n|2                 Cheeseburguer           " + cardapioDTO.getTcheeseburger();
        if (cardapioDTO.getTmistoquente()!=0)
            mensagem = mensagem + "\n|3                 Misto Quente               " + cardapioDTO.getTmistoquente();
        if (cardapioDTO.getTamericano()!=0)
            mensagem = mensagem + "\n|4                 Americano                    " + cardapioDTO.getTamericano();
        if (cardapioDTO.getTqueijoprato()!=0)
            mensagem = mensagem + "\n|5                 Queijo Prato                 " + cardapioDTO.getTqueijoprato();
        mensagem = mensagem +     "\n---------------------------------------------------------"
                                + "\n|                   Total                               "+ cardapioDTO.getTotal()
                                + "\n---------------------------------------------------------";
        return mensagem;
    }
}
