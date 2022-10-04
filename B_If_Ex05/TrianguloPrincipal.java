/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_If_Ex05;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class TrianguloPrincipal {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
            JOptionPane.showMessageDialog(null, 
                    triangulo.vtrian(
                            Integer.parseInt(JOptionPane.showInputDialog("Informe o lado a do triângulo: ")), 
                            Integer.parseInt(JOptionPane.showInputDialog("Informe o lado b do triângulo: ")), 
                            Integer.parseInt(JOptionPane.showInputDialog("Informe o lado c do triângulo: "))));
    }
}
