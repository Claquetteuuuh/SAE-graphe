package fr.mohcine;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class MainSaeGraphes {
    private Noeud type;
    private static ArrayList<Noeud> noeuds = new ArrayList<>();
    private static ArrayList<Lien> liens = new ArrayList<>();

    public static ArrayList<Noeud> getNoeuds() {
        return noeuds;
    }

    public static ArrayList<Lien> getLiens() {
        return liens;
    }

    // charger le fichier CSV
    /*
    private static void chargement()
    {
        // initialisation des variables noeud et lien
        Noeud noeudA = null, noeudB = null;
        Lien lienAB = null;
        Scanner scanner = null;
        // lien du fichier CSV
        File file = new File("C:/Users/Mohcine/Documents/NetBeansProjects/SAE_Graphe/graphes/Graphe.csv");
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // traitement du fichier CSV
        while (scanner.hasNextLine()) {
            String[] slice = scanner.nextLine().split(":", 2);
            String[] noeudParam = slice[0].split(",");
            Boolean exist = false;
            if (noeuds != null)
            {
                for (Noeud noeud : noeuds)
                {
                    if (noeud.getType() == noeudParam[0].charAt(0) && noeud.getNom().equals(noeudParam[1]))
                    {
                        exist = true;
                        noeudA = noeud;
                    }
                }
            }
            if (!exist)
            {
                noeudA = new Noeud(noeudParam[1], noeudParam[0].charAt(0));
                noeuds.add(noeudA);
            }


            String[] listNouveauliens = slice[1].split(";");

            for(String lien : listNouveauliens){
                slice = lien.split("::");
                String[] voisin = slice[1].split(",");
                exist = false;
                if (noeuds != null)
                {
                    for (Noeud noeud : noeuds)
                    {
                        if (noeud.getType() == voisin[0].charAt(0) && noeud.getNom().equals(voisin[1]))
                        {
                            exist = true;
                            noeudB = noeud;
                        }
                    }
                }
                if (!exist)
                {
                    noeudB =  new Noeud(voisin[1], voisin[0].charAt(0));
                }
                String[] lienParam = slice[0].split(",");
                lienAB = new Lien(Integer.valueOf(lienParam[1]),lienParam[0].charAt(0),noeudA,noeudB);
                liens.add(lienAB);
                // ici j essaye de recuperer les variables et les rentrer directememnt dans les parametres du lien
                    Lien lien_tmp = new Lien(int distance, char type, Noeud start, Noeud arrival);
                    if(!Liens.liens.contains(lien_tmp))
                    {


                    }
            }




        }
    }
*/
}






    /*void afficherVoisinDirect(Noeud nom)
    {

        ArrayList<String> tabVoisin = new ArrayList();

        Noeud test;

        while (test.suivant != None)
        {
            if (test.nomLien == nom)
            {
                tabVoisin.add(test.nomLien.batimentCible);
            }
            test = test.suivant;
        }

        ListIterator<String> tabNom = tabNom.listIterator();
        while (tabNom.hasNext())
            System.out.println(tabNom.next());
    }





    }
*/