/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_If_Ex04;

/**
 *
 * @author Aluno
 */
public class Categoria {
    private double a, p;
    public String resposta;
    public String cat (double a, double p) {
        this.a = a;
        this.p = p;
        if (a < 1.20){
            if (p <= 60)
                this.resposta = "Categoria A";
            else if ((p <=90)&& (p>60))
                this.resposta = "Categoria D";
            else if (p >90)
                this.resposta = "Categoria G";   
    }
        if ((a >= 1.20)&& (a <= 1.70)){
            if (p <= 60)
                this.resposta = "Categoria B";
            else if ((p <=90)&& (p>60))
                this.resposta = "Categoria E";
            else if (p >90)
                this.resposta = "Categoria H";   
    }
       if (a > 1.70){
            if (p <= 60)
                this.resposta = "Categoria C";
            else if ((p <=90)&& (p>60))
                this.resposta = "Categoria F";
            else if (p >90)
                this.resposta = "Categoria I";   
    }
        return this.resposta;
    }
}
