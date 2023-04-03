package fr.claquetteuuuh;

public class GrapheList {
    private SommetMaillon teteGraphe;
    public GrapheList(){
        this.teteGraphe = null;
    }

    public int nbSommet(){
        int count = 0;
        SommetMaillon temp = this.teteGraphe;
        while (temp != null){
            count += 1;
            temp = temp.getSuivant();
        }
        return count;
    }

    public boolean addSommet(Sommet sommet){
        boolean success = false;
        SommetMaillon temp = this.teteGraphe;
        if(temp == null){
            this.teteGraphe = new SommetMaillon(sommet);
            success = true;
        }else{
            while (temp.getSuivant() != null){
                temp = temp.getSuivant();
            }
            temp.setSuivant(new SommetMaillon(sommet));
            success = true;
        }
        return success;

    }

    public boolean supprimerSommet(String nomSommet){
        SommetMaillon tmp = this.teteGraphe;
        SommetMaillon precedent = this.teteGraphe;

        if(tmp.getVal().getNom().equalsIgnoreCase(nomSommet)){
            this.teteGraphe = tmp.getSuivant();
            return true;
        }else{
            while(tmp != null){
                if(tmp.getVal().getNom().equalsIgnoreCase(nomSommet)){
                    precedent.setSuivant(tmp.getSuivant());

                    SommetMaillon tmp2 = this.teteGraphe;
                    while(tmp2 != null){
                        if(tmp2.getVal().estVoisin(nomSommet)){
                            tmp2.getVal().supprimerLien(nomSommet);
                        }
                        tmp2 = tmp2.getSuivant();
                    }
                    return true;
                }
                precedent = tmp;
                tmp = tmp.getSuivant();
            }
        }
        return false;
    }

    public String toString() {
        String display = "";
        SommetMaillon temp = this.teteGraphe;
        while(temp != null){
            display += temp.getVal().toString() + "\n";
            temp = temp.getSuivant();
        }

        return display;
    }

    public void afficherVoisinDansGraphe(Sommet sommet) {

        LienMaillon tmp = sommet.getTeteLien();
        while (tmp.getSuivant() != null) {
            System.out.println(tmp.getBatiment().toString());
            tmp = tmp.getSuivant();
        }
    }

    public Sommet returnSommet(String nomSommet){
        SommetMaillon tmp = this.teteGraphe;
        if(tmp != null){
            if(tmp.getVal().getNom().equalsIgnoreCase(nomSommet)){
                return tmp.getVal();
            }else {
                while (tmp.getSuivant() != null) {
                    if (tmp.getSuivant().getVal().getNom().equalsIgnoreCase(nomSommet)) {
                        return tmp.getSuivant().getVal();
                    }
                    tmp = tmp.getSuivant();

                }
            }
        }
        return null;
    }
}
