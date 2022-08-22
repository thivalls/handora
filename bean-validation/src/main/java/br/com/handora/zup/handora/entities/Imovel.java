package br.com.handora.zup.handora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private Integer quartos;
    @Column(nullable = false)
    private Integer areaConstruida;
    @Column(nullable = false)
    private Boolean possuiGaragem;

    @Deprecated
    public Imovel() {
    }

    public Imovel(String nome, String endereco, Integer quartos, Integer areaConstruida, Boolean possuiGaragem) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = quartos;
        this.areaConstruida = areaConstruida;
        this.possuiGaragem = possuiGaragem;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Integer getQuartos() {
        return quartos;
    }

    public Integer getAreaConstruida() {
        return areaConstruida;
    }

    public Boolean getPossuiGaragem() {
        return possuiGaragem;
    }
}
