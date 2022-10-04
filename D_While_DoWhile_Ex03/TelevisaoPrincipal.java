/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class TelevisaoPrincipal {
    public static void main(String[] args) {
        int opc=-1;
        Televisao televisao = new Televisao();
        while (opc !=0){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Escolha qual canal você deseja assistir: \n"
                  + "Canal 9: 9\n"
                  + "Canal 12: 12\n"
                  + "Canal 23: 23\n"
                  + "Canal 40: 40\n"
                  + "Caso seja outro canal digite o seu número. \n"
                  + "Digite 0 para computar.")
            );
            televisao.canais(opc);
        }
        JOptionPane.showMessageDialog(null, televisao.mostrar());
    }
}
