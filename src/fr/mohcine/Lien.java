package fr.mohcine;
public class Lien {

    private Noeud[] liaison = {null,null};
    private int numLien;
    private int risque;
    private int distance;
    private int temps;

    public Lien(int numlien, int risque, int distance, int temps, Noeud[] liaison){
        this.numLien = numlien;
        this.risque = risque;
        this.distance = distance;
        this.temps = temps;
        this.liaison = liaison;
    }

    public int getNumLien() {
        return numLien;
    }
    public int getRisque() {
        return risque;
    }
    public int getDistance() {
        return distance;
    }
    public int getTemps() {
        return temps;
    }
    public Noeud[] getLiaison() {
        return liaison;
    }

    public void setNumLien(int numLien) {
        this.numLien = numLien;
    }
    public void setRisque(int risque) {
        this.risque = risque;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public void setTemps(int temps) {
        this.temps = temps;
    }
    public void setLiaison(Noeud[] liaison) {
        this.liaison = liaison;
    }
}
