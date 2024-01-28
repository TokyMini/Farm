package itu.Farm.bean;

public class Parcelle {
    String id;
    String idTerrain;
    double largeur;
    double longueur;

    public Parcelle(){}
    public Parcelle(String id, String idTerrain, double largeur, double longueur) {
        this.id = id;
        this.idTerrain = idTerrain;
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdTerrain() {
        return idTerrain;
    }

    public void setIdTerrain(String idTerrain) {
        this.idTerrain = idTerrain;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}
