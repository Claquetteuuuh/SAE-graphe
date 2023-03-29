package fr.claquetteuuuh;

public class Main {
    public static void main(String[] args){
        Sommet s1 = new Sommet("s1", "H");
        Sommet s2 = new Sommet("s2", "O");
        Sommet s3 = new Sommet("s3", "M");

        GrapheList graphe = new GrapheList();
        graphe.addSommet(s1);
        graphe.addSommet(s2);
        graphe.addSommet(s3);
        s1.setTeteLien(new LienMaillon(s2, 30, 3, 500, "l1"));
        s1.ajoutLien(s3, 20, 90, 1000, "l2");
        System.out.println(graphe.toString());
        System.out.println(s1.afficherVoisin());
        System.out.println(s1.supprimerLien("s2"));
        System.out.println(s1.estVoisin("S2"));
        System.out.println(s1.afficherVoisin());

    }
}
