/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex06;

/**
 *
 * @author Aluno
 */
public class Numero {
    private int numero, nmaior=-999999999, nmenor=999999999;
    public void MnumeroNnumero (int numero){
        this.numero = numero;
        if (this.numero > this.nmaior)
            this.nmaior = this.numero;
        
        if (this.numero < this.nmenor)
            this.nmenor = this.numero;
        
    }
    public String MostrarNmNn (){
        return "O maior número digitado foi: " + this.nmaior + "\n O menor número digitado foi: " + this.nmenor;
    }
}
