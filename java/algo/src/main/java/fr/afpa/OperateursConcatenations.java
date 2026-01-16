package fr.afpa;

public class OperateursConcatenations {

    public static void main(String[] args) {
        nomComplet();
        reecritureMoliere();
    }

    // Exercice 1
    public static void nomComplet() {
        String prenom;
        String nom;
        String nomComplet;

        prenom = "Adrien";
        nom = "Simon";
        nomComplet = prenom + " " + nom;

        System.out.println(nomComplet);
    }

    // Exercice 2
    public static void reecritureMoliere() {
        String partie1;
        String partie2;
        String partie3;

        partie1 = "vos beaux yeux";
        partie2 = "belle marquise";
        partie3 = "me font mourir d'amour";

        System.out.println(partie1 + " " + partie2 + " " + partie3);
        System.out.println(partie1 + " " + partie3 + " " + partie2);
    }

}
