/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex03;

/**
 *
 * @author Aluno
 */
public class Salario {
    private float salario, porcentagem, sp;
    public float calcularSalario (float salario, float porcentagem){
        this.salario = salario;
        this.porcentagem = porcentagem;
        return sp = this.salario*(this.porcentagem/100)+ this.salario;
    }
}
