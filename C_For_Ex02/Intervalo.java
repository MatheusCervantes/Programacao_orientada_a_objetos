/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex02;

/**
 *
 * @author aluno
 */
public class Intervalo {
    private int n1, n2;
    private String imprimir = "";
    public String calculo(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
        for(int i = n1; i<=this.n2; i++) {
            this.imprimir = this.imprimir + i + "\n";
        }
        return this.imprimir;
    }
}
