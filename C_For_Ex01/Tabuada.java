/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex01;

/**
 *
 * @author aluno
 */
public class Tabuada {
    private int numero;
    private String imprimir = "";
    public String calcular(int numero){
        this.numero = numero;
        for (int i = 0; i<=10; i++){
            this.imprimir = this.imprimir + "\n" + this.numero + " X " + i + " = " + (this.numero*i);
        }
        return this.imprimir;
    }
}
