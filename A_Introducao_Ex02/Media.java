/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex02;

/**
 *
 * @author Aluno
 */
public class Media {
    private float n1, n2, n3, resultado, p1, p2, p3;
    public float calcularMedia (float n1, float p1, float n2, float p2, float n3, float p3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        
        this.resultado = (this.n1*this.p1 + this.n2*this.p2 + this.n3*this.p3)/(this.p1+this.p2+this.p3);
        return this.resultado;
    }
    
}
