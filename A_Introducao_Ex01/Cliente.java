package A_Introducao_Ex01;
import javax.swing.JOptionPane;
public class Cliente {
    private String nome, rg;
    private int idade;
    
    public void Mostrar (String nome, String rg, int idade){
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
       JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome + "\nA idade informado foi: " + this.idade + "\nO RG informado foi: " + this.rg);
        //System.out.println("O nome informado foi: " + this.nome + "\nO RG informado foi: " + this.rg);
              
    }
    
    public void mostrarNome(String nome) {
        this.nome = nome;
        //System.out.println("O nome informado foi: " + this.nome);
    }
    
    public void mostrarIdade(int idade) {
        this.idade = idade;
        //JOptionPane.showMessageDialog(null, "A idade informado foi: " + this.idade);
    }
}//fecha a classe

