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
public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    public void calcularMedia(MediaDTO mediaDTO) {
        mediaDAO.calcularMedia(mediaDTO);
    }
    
    public String imprimir() { 
        return mediaDAO.imprimir();
    }
}
