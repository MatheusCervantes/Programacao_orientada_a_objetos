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
public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    public String mostrarDadosJuri(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostrarDadosJuri(juridicoDTO);
    }
}
