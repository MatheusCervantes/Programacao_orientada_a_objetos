/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Switch_Ex07;

/**
 *
 * @author aluno
 */
public class Conta {
    private String opcao; private double n1, n2;
    public String calcular(String opcao, double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
        this.opcao = opcao.toUpperCase();
        switch(this.opcao){
            case "A":
                return "O resultado é: " + (this.n1+this.n2);
            case "S":
                return "O resultado é: " + (this.n1-this.n2);
            case "M":
                return "O resultado é: " + (this.n1*this.n2);
            case "D":
                return "O resultado é: " + (this.n1/this.n2);
            default:
                return "Opção inválida.";
        }
    }
}
