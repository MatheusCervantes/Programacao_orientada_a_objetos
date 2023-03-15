/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_Herenca_Ex02;

/**
 *
 * @author aluno
 */
public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String mostrarDadosFisico(FisicoDTO fisicoDTO) {
        return fisicoDAO.mostrarDadosFisico(fisicoDTO);
    }
}
