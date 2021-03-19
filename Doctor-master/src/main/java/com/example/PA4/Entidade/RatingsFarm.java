package com.example.PA4.Entidade;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TB_RatingFarm")
public class RatingsFarm {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFarm_2;
    private float RatingFarm;
    private int idFarmnota; //saber qual idfarm vai receber a nota
    private int iduser; //fk
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public int getIdFarm_2() {
        return idFarm_2;
    }
    public void setIdFarm_2(int idFarm_2) {
        this.idFarm_2 = idFarm_2;
    }
    public float getRatingFarm() {
        return RatingFarm;
    }
    public void setRatingFarm(float ratingFarm) {
        RatingFarm = ratingFarm;
    }
    public int getIdFarmnota() {
        return idFarmnota;
    }
    public void setIdFarmnota(int idFarmnota) {
        this.idFarmnota = idFarmnota;
    }
    public int getIduser() {
        return iduser;
    }
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
}

