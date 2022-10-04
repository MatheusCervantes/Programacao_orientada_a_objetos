/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex04;

/**
 *
 * @author aluno
 */
public class Altura {
    private double altura, soma;
    private int am;
    public double Media (){
        return this.soma/20;
    }
    public int Maior2m (){
        return this.am;
    }
    public void Calcular (double altura){
        this.altura = altura;
        if (this.altura > 2)
            this.am = this.am + 1;
        this.soma += altura;
    }
}
