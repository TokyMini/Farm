package itu.Farm.bean;

public class Utilisateur {
    String id;
    String nom;
    String email;
    String mdp;
    int type;

    public  Utilisateur(){};
    public Utilisateur(String id, String nom, String email, String mdp, int t) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.mdp = mdp;
        this.type = t;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
