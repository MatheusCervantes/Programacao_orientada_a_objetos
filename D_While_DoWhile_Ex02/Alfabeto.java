/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex02;

/**
 *
 * @author Aluno
 */
public class Alfabeto {
    private int na, ne, ni, no, nu, nc=-1;
    void tletras (String letra){
        if (letra.equalsIgnoreCase("A"))
            this.na++;
        else if (letra.equalsIgnoreCase("E"))
            this.ne++;
        else if (letra.equalsIgnoreCase("I"))
            this.ni++;
        else if (letra.equalsIgnoreCase("O"))
            this.no++;
        else if (letra.equalsIgnoreCase("U"))
            this.nu++;
        else
            this.nc++;
    }
    String mostrar (){
        return "Há " + this.na + " letras A.\n"
             + "Há " + this.ne + " letras E.\n"
             + "Há " + this.ni + " letras I.\n"
             + "Há " + this.no + " letras O.\n"
             + "Há " + this.nu + " letras U.\n"
             + "Há " + this.nc + " consoantes.\n";
    }
}
