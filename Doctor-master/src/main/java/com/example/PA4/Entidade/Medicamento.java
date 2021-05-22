package com.example.PA4.Entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_Medicamento")
public class Medicamento implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idmed;
    private Float notaMed;
    private String urlimagem;
    private String nome;
    private String indicacao;
    private String IDAnvisa;

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
        return "Medicamentos [idmed=" + idmed + ",IDAnvisa=" + IDAnvisa +",indicacao=" + indicacao + ", nome="
                + nome + ", urlimagem=" + urlimagem + "]";
    }

    public String getIDAnvisa() {
        return IDAnvisa;
    }

    public void setIDAnvisa(String iDAnvisa) {
        IDAnvisa = iDAnvisa;
    }
    public Float getNotaMed() {
        return notaMed;
    }

    public void setNotaMed(Float notaMed) {
        this.notaMed = notaMed;
    }

}
