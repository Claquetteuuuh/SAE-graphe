package fr.claquetteuuuh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Utils {

    public static void main(String[] args){
        GrapheList graphe = new GrapheList();
        String ligne = "S25;4;5;26;8;11;9;10;24";
        Sommet sommet = lineToSommetEtVoisin(graphe, ligne);
        System.out.println(sommet.getNom());
        System.out.println(sommet.afficherVoisin());
        System.out.println();
        System.out.println(graphe.toString());
    }

    public static GrapheList fichierToGraphe(String filename) {
        GrapheList graphe = new GrapheList();
        try{
            Scanner file = new Scanner(new FileReader("C:\\Users\\Thomas\\Documents\\GitHub\\SAE-graphe\\out\\production\\SAE\\common\\liste-successeurs.csv"));
            while(file.hasNextLine()){
                String s = file.nextLine();
                lineToSommetEtVoisin(graphe, s);
            }
            file.close();
            return graphe;
        }catch (FileNotFoundException e){
            System.out.println("Le fichier n'est pas trouvé !");
            return null;
        }
    }

    public static Sommet lineToSommetEtVoisin(GrapheList graphe, String line){

        // gestion de chaque objet de la ligne
        String[] lineSplited = line.split(";"); // decoupage de la ligne
        // verifie si le sommet n'est pas deja dans le graphe
        /////
        Sommet sommet = new Sommet(lineSplited[0], "");

        // boucle pour ajouter les voisins
        for(int i = 1; i<lineSplited.length && lineSplited[i] != ""; i++){
            // recuperation du sommet dans le graphe
            Sommet voisin = graphe.returnSommet("S" + lineSplited[i]);
            if(voisin  != null) {
                // si le sommet a ajouter est deja dans le lien
                sommet.ajoutLien(voisin, -1, -1, -1, "");
            }else{
                // pas de sommet portant ce nom dans le graphe
                voisin = new Sommet("S" + lineSplited[i], ""); // creation du sommet
                boolean added = graphe.addSommet(voisin); // ajout du sommet dans le graphe
                if(added){
                    boolean success = sommet.ajoutLien(voisin, -1, -1, -1, ""); // ajout du lien
                    if(!success){
                        // probleme
                    }
                }
            }
        }
        return sommet;
    }
}
