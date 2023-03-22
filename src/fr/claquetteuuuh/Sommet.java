package fr.claquetteuuuh;

public class Sommet {
    private String nom;
    private String type;
    private LienMaillon teteLien = null;

    public Sommet(String nom, String type){
        this.nom = nom;
        this.type = type;
    }

    public String toString() {
        return "Sommet{" +
                "nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", teteLien=" + teteLien +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public LienMaillon getTeteLien() {
        return teteLien;
    }

    public void setTeteLien(LienMaillon teteLien) {
        this.teteLien = teteLien;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }
}
