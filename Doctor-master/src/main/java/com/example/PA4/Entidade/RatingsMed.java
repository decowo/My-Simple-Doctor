package com.example.PA4.Entidade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_RatingMedicamento")
public class RatingsMed {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idmed_2_pk; // pk da entity
    private float Rating;//nota de 0 a 5
    private int idmednota; //saber qual idmed vai receber a nota

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Usuario iduser; //fk pra saber quem deu a nota



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idmed", referencedColumnName = "idmed")
    private Medicamento idmed_2_fk;//fk ligada ao medicamento



    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public int getIdmed_2() {
        return idmed_2_pk;
    }
    public void setIdmed_2(int idmed_2_pk) {
        this.idmed_2_pk = idmed_2_pk;
    }
    public float getRating() {
        return Rating;
    }
    public void setRating(float rating) {
        Rating = rating;
    }
    public int getIdmednota() {
        return idmednota;
    }
    public void setIdmednota(int idmednota) {
        this.idmednota = idmednota;
    }
    public Usuario getIduser() {
        return iduser;
    }
    public void setIduser(Usuario iduser) {
        this.iduser = iduser;
    }
    public Medicamento getIdmed_2_fk() {
        return idmed_2_fk;
    }
    public void setIdmed_2_fk(Medicamento idmed_2_fk) {
        this.idmed_2_fk = idmed_2_fk;
    }
}
