/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cardapio;

/**
 *
 * @author Matheus
 */
public class CardapioDTO {
    private int codigo=-1;
    private double tcheeseburger, tmistoquente, tamericano, tqueijoprato, total;
    private double thamburger;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getThamburger() {
        return thamburger;
    }

    public void setThamburger(double thamburger) {
        this.thamburger = thamburger;
    }

    public double getTcheeseburger() {
        return tcheeseburger;
    }

    public void setTcheeseburger(double tcheeseburger) {
        this.tcheeseburger = tcheeseburger;
    }

    public double getTmistoquente() {
        return tmistoquente;
    }

    public void setTmistoquente(double tmistoquente) {
        this.tmistoquente = tmistoquente;
    }

    public double getTamericano() {
        return tamericano;
    }

    public void setTamericano(double tamericano) {
        this.tamericano = tamericano;
    }

    public double getTqueijoprato() {
        return tqueijoprato;
    }

    public void setTqueijoprato(double tqueijoprato) {
        this.tqueijoprato = tqueijoprato;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
