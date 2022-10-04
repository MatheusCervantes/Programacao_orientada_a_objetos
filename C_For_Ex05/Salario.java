/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex05;
import java.text.DecimalFormat;

/**
 *
 * @author Aluno
 */
public class Salario {
    DecimalFormat formatando = new DecimalFormat("##,###.00");
    private int ano;
    private double salario, percentual;
    public String Aumento (int ano){
        this.ano = ano;
        this.salario=1000; 
        this.percentual=0.015;
        for (int a=1996; a<=this.ano; a++){
            this.salario = this.salario + this.salario*this.percentual;
            this.percentual = this.percentual*2;
        }
            
        return "O salário em " + this.ano + " será de R$ " + formatando.format(this.salario);
    }
}
