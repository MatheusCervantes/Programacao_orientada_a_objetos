/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_Herenca_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class VeiculoVIEW {
    public static void main(String[] args) {
        try {
            CarroDTO carroDTO = new CarroDTO();
            CarroCTR carroCTR = new CarroCTR();
        
            carroDTO.setPlaca(JOptionPane.showInputDialog("Informe a Placa: "));
            carroDTO.setCor(JOptionPane.showInputDialog("Informe a cor: "));
            carroDTO.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Informe a Potência: ")));
            carroDTO.setQtd_portas(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de portas: ")));
        
            JOptionPane.showMessageDialog(null, carroCTR.imprimirDadosCarro(carroDTO));
        
            MotoDTO motoDTO = new MotoDTO();
            MotoCTR motoCTR = new MotoCTR();
        
            motoDTO.setPlaca(JOptionPane.showInputDialog("Informe a Placa: "));
            motoDTO.setCor(JOptionPane.showInputDialog("Informe a cor: "));
            motoDTO.setCilindrada(Integer.parseInt(JOptionPane.showInputDialog("Informe as Cilindradas: ")));
            motoDTO.setTipo_motor(JOptionPane.showInputDialog("2T / 4T: "));
        
            JOptionPane.showMessageDialog(null, motoCTR.imprimirDadosMoto(motoDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
