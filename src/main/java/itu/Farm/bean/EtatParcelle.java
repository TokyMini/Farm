package itu.Farm.bean;

import java.sql.Timestamp;

public class EtatParcelle {
    String idParcelle;
    String idCulture;
    int etat;
    Timestamp plantation;

    public EtatParcelle(){}
    public EtatParcelle(String idParcelle, String idCulture, int etat, Timestamp plantation) {
        this.idParcelle = idParcelle;
        this.idCulture = idCulture;
        this.etat = etat;
        this.plantation = plantation;
    }

    public String getIdParcelle() {
        return idParcelle;
    }

    public void setIdParcelle(String idParcelle) {
        this.idParcelle = idParcelle;
    }

    public String getIdCulture() {
        return idCulture;
    }

    public void setIdCulture(String idCulture) {
        this.idCulture = idCulture;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public Timestamp getPlantation() {
        return plantation;
    }

    public void setPlantation(Timestamp plantation) {
        this.plantation = plantation;
    }
}
