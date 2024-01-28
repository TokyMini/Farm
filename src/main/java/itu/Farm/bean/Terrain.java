package itu.Farm.bean;


import java.sql.Timestamp;

public class Terrain {
    String id;
    String idLocalisation;
    String description;
    String idUtilisateur;
    int nbParcelle;
    int etat;
    Timestamp daty;

    public Terrain(){}
    public Terrain(String id, String idLocalisation, String description, String idUtilisateur, int nbParcelle, int etat, Timestamp daty) {
        this.id = id;
        this.idLocalisation = idLocalisation;
        this.description = description;
        this.idUtilisateur = idUtilisateur;
        this.nbParcelle = nbParcelle;
        this.etat = etat;
        this.daty = daty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(String idLocalisation) {
        this.idLocalisation = idLocalisation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(String idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getNbParcelle() {
        return nbParcelle;
    }

    public void setNbParcelle(int nbParcelle) {
        this.nbParcelle = nbParcelle;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public Timestamp getDaty() {
        return daty;
    }

    public void setDaty(Timestamp daty) {
        this.daty = daty;
    }
}
