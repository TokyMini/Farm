package itu.Farm.bean;

public class Culture {
    String id;
    String nom;
    double rendement;
    double prix;
    double duree;

    public Culture(){}

    public Culture(String id, String nom, double rendement, double prix, double duree) {
        this.id = id;
        this.nom = nom;
        this.rendement = rendement;
        this.prix = prix;
        this.duree = duree;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getRendement() {
        return rendement;
    }

    public void setRendement(double rendement) {
        this.rendement = rendement;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }
}
