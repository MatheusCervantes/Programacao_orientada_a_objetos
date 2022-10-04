/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex03;

/**
 *
 * @author aluno
 */
public class Soma {
    private int num, soma;
    public void calculo(int num){
        this.num = num;    
        this.soma+= num;
    }
    public int total(){
        return this.soma;
    }
}

