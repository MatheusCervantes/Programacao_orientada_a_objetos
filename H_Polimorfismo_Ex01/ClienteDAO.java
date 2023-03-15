/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex01;

/**
 *
 * @author aluno
 */
public class ClienteDAO {
    public String mostrarInformacoes (ClienteDTO clienteDTO) {
        return "O nome informada foi: " + clienteDTO.getNome() +
                "\nO RG informado foi: " + clienteDTO.getRg() +
                verifica(clienteDTO.getIdade()) +
                verifica(clienteDTO.getAltura());
    }
    
    private String verifica (int idade) {
        if(idade >= 18)
            return "\nIdade maior que 18 anos, pode entrar no brinquedo.";
        else
            return "\nIdade menor que 18 anos, não pode entrar no brinquedo.";
    }
    
    private String verifica (double altura) {
        if(altura > 1.5) 
            return "\nAltura maior que 1.5, pode entrar no brinquedo.";
        else
            return "\nAltura menor que 1.5, não pode entrar no brinquedo.";       
    }
}

