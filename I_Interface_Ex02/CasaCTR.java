/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Interface_Ex02;

/**
 *
 * @author aluno
 */
public class CasaCTR {
    CasaDAO casaDAO = new CasaDAO();
    public String publicarDados(CasaDTO casaDTO) {
        return casaDAO.publicarDados(casaDTO);
    }
}