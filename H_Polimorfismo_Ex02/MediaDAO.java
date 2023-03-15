/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex02;

/**
 *
 * @author aluno
 */
public class MediaDAO {
    String media;
    public void calcularMedia(MediaDTO mediaDTO) {
        if (mediaDTO.getOpc()== 2)
            this.calcularMedia(mediaDTO.getNota1(), mediaDTO.getNota2());
        else if (mediaDTO.getOpc() == 3)
            this.calcularMedia(mediaDTO.getNota1(), mediaDTO.getNota2(), mediaDTO.getNota3());
        else if (mediaDTO.getOpc() == 4)
            this.calcularMedia(mediaDTO.getNota1(), mediaDTO.getNota2(), mediaDTO.getNota3(), mediaDTO.getNota4());
        else
            media = "Opção selecionada é inválida.";
        this.imprimir();
    }
    
    public void calcularMedia(double n1, double n2) {
        media = "A média é: " + (n1+n2)/2;
    }
    
    public void calcularMedia(double n1, double n2, double n3) {
        media = "A média é: " + (n1+n2+n3)/3; 
    }
    
    public void calcularMedia(double n1, double n2, double n3, double n4) {
        media = "A média é: " + (n1+n2+n3+n4)/4;
    }
    
    public String imprimir() { 
            return media;
    }
    
}
