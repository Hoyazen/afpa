package fr.afpa;

import java.util.Scanner;

public class SaisieUtilisateur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        saisieSimple(scanner);
        verificationAge(scanner);
        prixTtc(scanner);

        scanner.close();
    }

    // Exercice 1
    public static void saisieSimple(Scanner scanner) {
        System.out.println("Veuillez saisir un nombre : ");

        int nombre = scanner.nextInt();
        int carre = nombre * nombre;

        System.out.println("Le carré de " + nombre + " est : " + carre);
    }

    // Exercice 2
    public static void verificationAge(Scanner scanner) {
        System.out.println("Votre âge ?");

        byte age = scanner.nextByte();

        System.out.println(age >= 18);
    }

    // Exercice 4
    public static void prixTtc(Scanner scanner) {
        System.out.println("prix de votre article ?");
        float prixArticle = scanner.nextFloat();

        System.out.println("Combien d'articles ?");
        int nombreArticle = scanner.nextInt();

        System.out.println("Taux de la TVA en % exemple : 20% = 20");
        float tva = scanner.nextFloat();

        float prixTtc = prixArticle * nombreArticle * (1 + tva / 100);

        System.out.println("Le prix total TTC de votre commande est de : " + prixTtc);
    }

}
