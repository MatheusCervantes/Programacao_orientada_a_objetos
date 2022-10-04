package A_Introducao_Ex01;
import javax.swing.JOptionPane;
public class PrincipalCliente {
    public static void main (String[] args){
        Cliente cliente = new Cliente();
        String nome, rg;
        int idade;
        
        nome = JOptionPane.showInputDialog("Informe o nome: ");
        rg = JOptionPane.showInputDialog("Informe o Rg: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        
        cliente.Mostrar(nome, rg, idade);
        cliente.mostrarNome(nome);
        cliente.mostrarIdade(idade);
    }
}
