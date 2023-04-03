package fr.claquetteuuuh;
import fr.claquetteuuuh.Utils.*;
public class Main {
    public static void main(String[] args){
        /*Sommet s1 = new Sommet("s1", "H");
        Sommet s2 = new Sommet("s2", "O");
        Sommet s3 = new Sommet("s3", "M");

        GrapheList graphe = new GrapheList();
        graphe.addSommet(s1);
        graphe.addSommet(s2);
        graphe.addSommet(s3);
        s1.setTeteLien(new LienMaillon(s2, 30, 3, 500, "l1"));
        s1.ajoutLien(s3, 20, 90, 1000, "l2");
        System.out.println(graphe.toString());

        System.out.println(graphe.toString());
        System.out.println("quoicoubeh");

        System.out.println(s1.afficherVoisin());
        System.out.println("quoicoubeh");
        graphe.supprimerSommet("s3");
        System.out.println(s1.afficherVoisin());
        System.out.println("quoicoubeh");

        System.out.println(graphe.toString());
         */


        String filename = "C:\\Users\\Thomas\\Documents\\GitHub\\SAE-graphe\\out\\production\\SAE\\common\\liste-successeurs.csv";
        GrapheList graphe = Utils.fichierToGraphe(filename);

        System.out.println(graphe.toString());
    }
}
