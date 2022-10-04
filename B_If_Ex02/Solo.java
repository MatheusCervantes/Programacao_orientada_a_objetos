/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_If_Ex02;

/**
 *
 * @author Aluno
 */
public class Solo {
    private int p;
    public String resposta;
    public String resolver(int p){
        this.p = p;
        if (p <= 10)
            this.resposta = "Rochosa";
        else if ((p > 10) && (p <= 40))
            this.resposta = "Firme";
        else if ((p > 40) && (p <= 80))
            this.resposta = "Pantanosa";
        else
            this.resposta = "Quantidade de água inválida";
        return this.resposta;
    }
}
