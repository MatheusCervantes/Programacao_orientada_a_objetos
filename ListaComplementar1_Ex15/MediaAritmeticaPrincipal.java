/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaComplementar1_Ex15;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus
 * 15. Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele 
       obteve no semestre. No final informar o nome do aluno e a sua média aritmética
 */
public class MediaAritmeticaPrincipal {
    public static void main(String[] args) {
        MediaAritmetica mediaartmetica = new MediaAritmetica();
        JOptionPane.showMessageDialog(null, mediaartmetica.Calcular(
            JOptionPane.showInputDialog("Insira o nome do aluno: "), 
            Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1: ")), 
            Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2: ")), 
            Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 3: "))
        ));
    }
}
