package com.example.PA4.Entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicamento implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idmed;
    
    private String urlimagem;
    private String nome;
    private String indicacao;
    private float avaliacao;

    public float getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    public int getIdmed() {
        return idmed;
    }

    public void setIdmed(int idmed) {
        this.idmed = idmed;
    }

    public String getUrlimagem() {
        return urlimagem;
    }

    public void setUrlimagem(String urlimagem) {
        this.urlimagem = urlimagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }



    @Override
    public String toString() {
        return "Medicamentos [avaliacao=" + avaliacao + ", idmed=" + idmed + ", indicacao=" + indicacao + ", nome="
                + nome + ", urlimagem=" + urlimagem + "]";
    }

    
}
