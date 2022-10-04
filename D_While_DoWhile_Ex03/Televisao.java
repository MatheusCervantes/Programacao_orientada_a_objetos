/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex03;

/**
 *
 * @author aluno
 */
public class Televisao {
    private int c9, c12, c23, c40, ocanais,opc;
    public void canais (int opc){
        this.opc = opc;
        switch(this.opc){
            case 9:
                this.c9++;
            break;
            case 12:
                this.c12++;
            break;
            case 23:
                this.c23++;
            break;
            case 40:
                this.c40++;
            break;
            default:
                if (opc != 0)
                 this.ocanais++;   
        }
    }
    public String mostrar(){
        return 
               "-------------------------\n" 
             + "-Audiência\n"
             + "-------------------------\n"             
             + "-Canal 9: " + this.c9 +"\n" 
             + "-Canal 12: " + this.c12 +"\n" 
             + "-Canal 23: " + this.c23 +"\n" 
             + "-Canal 40: " + this.c40 +"\n"
             + "-Outros canais: " + this.ocanais +"\n"
             + "-------------------------\n"; 
    }
    
}

