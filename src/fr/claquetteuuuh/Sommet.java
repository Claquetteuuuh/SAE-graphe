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

    public boolean estVoisin(String nomSommet){
        LienMaillon tmp = this.teteLien;
        while(tmp != null){
            if(tmp.getBatiment().getNom().equalsIgnoreCase(nomSommet)){
                return true;
            }
            tmp = tmp.getSuivant();
        }
        return false;
    }

    public boolean ajoutLien(Sommet sommet, double distance, double fiabilite, int duree, String nomLien){
        LienMaillon tmp = this.teteLien;
        while(tmp != null){
            if(tmp.getSuivant() == null){
                tmp.setSuivant(new LienMaillon(sommet, distance, fiabilite, duree, nomLien));
                return true;
            }
            tmp = tmp.getSuivant();
        }
        return false;
    }

    public boolean supprimerLien(String nomSommet){
        LienMaillon tmp = this.getTeteLien();
        LienMaillon precedent = this.getTeteLien();

        if(tmp.getBatiment().getNom().equalsIgnoreCase(nomSommet)){
            this.setTeteLien(tmp.getSuivant());
            return true;
        }else{
            while (tmp != null){
                if(tmp.getBatiment().getNom().equalsIgnoreCase(nomSommet)){
                    precedent.setSuivant(tmp.getSuivant());
                    return true;
                }
                precedent = tmp;
                tmp = tmp.getSuivant();
            }
        }
        return false;
    }

    public String afficherVoisin() {
        String separation = " ; ";
        String voisinString = "";
        LienMaillon tmp = this.getTeteLien();
        while (tmp != null) {
            voisinString += tmp.getBatiment().toString() + separation;
            tmp = tmp.getSuivant();
        }
        return voisinString;
    }


}
