package br.com.handora.zup.handora.requests;

import br.com.handora.zup.handora.entities.Imovel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ImovelRequest {
    @NotBlank()
    @Length(min = 10, max = 255)
    private String nome;
    @NotBlank()
    @Length(min = 60, max = 255)
    private String endereco;
    @Min(1)
    @NotNull()
    private Integer quartos;
    @Min(40)
    @NotNull()
    private Integer areaConstruida;
    @NotNull()
    private Boolean possuiGaragem;

    @Deprecated
    public ImovelRequest() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setQuartos(Integer quartos) {
        this.quartos = quartos;
    }

    public void setAreaConstruida(Integer areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public void setPossuiGaragem(Boolean possuiGaragem) {
        this.possuiGaragem = possuiGaragem;
    }

    public Imovel toModel() {
        return new Imovel(nome, endereco, quartos, areaConstruida, possuiGaragem);
    }

    @Override
    public String toString() {
        return "ImovelRequest{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", quartos=" + quartos +
                ", areaConstruida=" + areaConstruida +
                ", possuiGaragem=" + possuiGaragem +
                '}';
    }
}
