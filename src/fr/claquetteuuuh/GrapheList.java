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

    public String toString() {
        String display = "";
        SommetMaillon temp = this.teteGraphe;
        while(temp != null){
            display += temp.getVal().toString() + "\n";
            temp = temp.getSuivant();
        }

        return display;
    }
}
