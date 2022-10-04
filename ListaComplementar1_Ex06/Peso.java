/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex06;

/**
 *
 * @author matheus
 */
public class Peso {
    private double peso;
    public String Calcular (double peso) {
        this.peso = peso;
        return "A) Engordou 15% = " + peso*1.15 + "\n"
             + "B) Emagreceu 20% = " + peso*0.80;
                
    }
}
