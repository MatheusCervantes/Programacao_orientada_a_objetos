/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex04;

/**
 *
 * @author Aluno
 */
public class Salario {
    private double salario, vendas, comissao, sf;
    public String calcularSalario (double salario, double vendas){
        this.salario = salario;
        this.vendas = vendas;
        
        this.comissao = this.vendas *0.04;
        this.sf = this.salario + this.salario*this.comissao; 
        return "O salário final foi " + sf + " e a comissão foi " + comissao;
    }
}
