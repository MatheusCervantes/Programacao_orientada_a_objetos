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
public class CasaDAO implements ICasaDAO{
    private String mensagem;
    public String publicarDados(CasaDTO casaDTO) {
        this.mensagem = "Endereço: " + casaDTO.getEndereco() +
                        "\nNúmero do imóvel: " + casaDTO.getNumero() +
                        "\nBairro: " + casaDTO.getBairro() +
                        "\nCidade: " + casaDTO.getCidade() +
                        "\nProprietário: " + casaDTO.getProprietario() +
                        "\nNúmero de quartos: " + casaDTO.getN_quartos() +
                        "\nNúmero de banheiros: " + casaDTO.getN_banheiros();
        return this.mensagem;
    }    
}