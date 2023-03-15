/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Interface_Ex02;

/**
 *
 * @author aluno
 */
public interface IImovelDTO {
    public void setEndereco(String endereco);
    public void setNumero(int numero);
    public void setBairro(String bairro);
    public void setCidade(String cidade);
    public void setProprietario(String proprietario);
    public String getEndereco();
    public int getNumero();
    public String getBairro();
    public String getCidade();
    public String getProprietario();
}