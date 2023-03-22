package fr.claquetteuuuh;

public class SommetMaillon {
    private Sommet val;
    private SommetMaillon suivant = null;
    public SommetMaillon(Sommet refere){
        this.val = refere;
    }

    public SommetMaillon getSuivant() {
        return suivant;
    }

    public Sommet getVal() {
        return val;
    }

    public void setSuivant(SommetMaillon suivant) {
        this.suivant = suivant;
    }

    public void setVal(Sommet val) {
        this.val = val;
    }
}
