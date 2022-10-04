/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_If_Ex05;

/**
 *
 * @author Aluno
 */
public class Triangulo {
    private int a, b, c;
    public String vtrian (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if ((a+c >b) && (c+b>a) && (a+b>c)){
            if ((a==b) &&( a==c))
                return "Triângulo Equilátero";
            else if ((a==b) || (a==c) || (b==c))
                return "Triângulo Isósceles";
            else
                return "Triângulo Escaleno";
        }
        else
            return "Não é um triângulo";
    }
}
