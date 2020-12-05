package com.example.PA4.Entidade;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Farmacia implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idfarm;

    private String localizacao;
    private String estado;
    private String descricao;

    public int getIdfarm() {
        return this.idfarm;
    }

    public void setIdfarm(int idfarm) {
        this.idfarm = idfarm;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
}
