/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex04;

/**
 *
 * @author aluno
 */
public class MediaDAO {
    public String calcularMedia (MediaDTO  mediaDTO){
        if ((mediaDTO.n1+mediaDTO.n2)/2 >= 7)
            return "Aluno aprovado com média: " + (mediaDTO.n1+mediaDTO.n2)/2;
        else if ((mediaDTO.n1+mediaDTO.n2)/2 < 4)
            return "Aluno reprovado com média: " + (mediaDTO.n1+mediaDTO.n2)/2;
        else
            return "Aluno de recuperação com média: " + (mediaDTO.n1+mediaDTO.n2)/2;
    }
}
