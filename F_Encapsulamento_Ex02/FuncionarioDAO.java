/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex02;

/**
 *
 * @author aluno
 */
public class FuncionarioDAO {
    public String imprimir (FuncionarioDTO funcionarioDTO) {
        return "O código informado foi: " + funcionarioDTO.getCodigo() + 
                "\nO telefone informado foi: " + funcionarioDTO.getTelefone();
    }
    
}
