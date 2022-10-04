/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex12;

/**
 *
 * @author matheus
 */
public class Conta {
    private double salario, vconta1, vconta2;
    public double Calcular (double salario, double vconta1, double vconta2) {
        return salario - (vconta1*1.02 + vconta2*1.02);
    }
}
