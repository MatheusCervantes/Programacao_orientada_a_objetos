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
public class CarroCTR {
    CarroDAO carroDAO = new CarroDAO();
    public String imprimirDadosCarro(CarroDTO carroDTO) {
        return carroDAO.imprimirDadosCarro(carroDTO);
    }
}
