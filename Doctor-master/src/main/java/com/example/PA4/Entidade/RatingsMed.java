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
    private Medicamento idmed_2;
    private float Rating;
    private int idmednota; //saber qual idmed vai receber a nota
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Usuario iduser; //fk
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public Medicamento getIdmed_2() {
        return idmed_2;
    }
    public void setIdmed_2(Medicamento idmed_2) {
        this.idmed_2 = idmed_2;
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
}
