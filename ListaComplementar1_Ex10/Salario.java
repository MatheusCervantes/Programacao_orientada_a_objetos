/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex10;

/**
 *
 * @author matheus
 */
public class Salario {
    private double salario, salariomin;
    public double Calcular (double salariomin, double salario) {
        this.salario = salario;
        this.salariomin = salariomin;
        return this.salario/this.salariomin;               
    }
}
