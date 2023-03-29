package fr.claquetteuuuh;

public class LienMaillon {
    private String nomLien;
    private Sommet batiment;
    private double distance;
    private double fiabilite;
    private int duree;
    private LienMaillon suivant = null;

    public LienMaillon(Sommet batimentCible, double distance, double fiabilite, int duree, String nomLien){
        this.nomLien = nomLien;
        this.batiment = batimentCible;
        this.distance = distance;
        this.fiabilite = fiabilite;
        this.duree = duree;
    }


    public double getDistance() {
        return distance;
    }

    public double getFiabilite() {
        return fiabilite;
    }

    public LienMaillon getSuivant() {
        return suivant;
    }

    public int getDuree() {
        return duree;
    }

    public Sommet getBatiment() {
        return batiment;
    }

    public void setSuivant(LienMaillon suivant) {
        this.suivant = suivant;
    }

    public void setBatiment(Sommet batiment) {
        this.batiment = batiment;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setFiabilite(double fiabilite) {
        this.fiabilite = fiabilite;
    }
}
