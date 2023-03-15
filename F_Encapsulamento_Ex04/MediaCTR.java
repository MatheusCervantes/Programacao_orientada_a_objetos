/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex04;

/**
 *
 * @author aluno
 */
public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    public String calcularMedia (MediaDTO mediaDTO){
        return mediaDAO.calcularMedia(mediaDTO);
    }
}
