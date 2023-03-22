package fr.claquetteuuuh;

public class Main {
    public static void main(String[] args){
        Sommet s1 = new Sommet("s1", "H");
        Sommet s2 = new Sommet("s2", "O");

        GrapheList graphe = new GrapheList();
        graphe.addSommet(s1);
        graphe.addSommet(s2);
        System.out.println(graphe.toString());
    }
}
