/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex13;

/**
 *
 * @author matheus
 */
public class CalcularSalario {
    private double salariominimo; 
    private int horas, horasextras;
    public double SalarioTotal (double salariominimo, int horas, int horasextras) {
        this.salariominimo = salariominimo;
        this.horas = horas;
        this.horasextras = horasextras;
        return ((this.salariominimo*0.125)*this.horas) + ((this.salariominimo*0.25)*this.horasextras);
    } 
}
