/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_Herenca_Ex01;

/**
 *
 * @author aluno
 */
public class MotoCTR {
    MotoDAO motoDAO = new MotoDAO();
    public String imprimirDadosMoto (MotoDTO motoDTO) {
        return motoDAO.imprimirDadosMoto(motoDTO);
    }
}
