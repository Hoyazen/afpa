package fr.afpa;

import java.util.Scanner;

public class ChainesDeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // decompteVoyelles(scanner);
        // decompteMajuscules(scanner);
        // passageMajuscules(scanner);
        inversionChaine(scanner);

        scanner.close();
    }

    public static void decompteVoyelles(Scanner scanner) {
        System.out.println("Une phrase ? Je vais compter le nombre de voyelles :");
        String phraseUtilisateur = scanner.nextLine();

        int taillePhraseUtilisateur = phraseUtilisateur.length();
        int compteur = 0;

        for (int i = 0; i < taillePhraseUtilisateur; i++) {
            char result = phraseUtilisateur.charAt(i);

            if (result == 'a' || result == 'e' || result == 'i' || result == 'o' || result == 'u' || result == 'y') {
                compteur++;
            }
        }

        System.out.println("Il y a " + compteur + " voyelles dans votre phrase");
    }

    public static void decompteMajuscules(Scanner scanner) {
        System.out.println("Je vais compter le nombre de majuscule dans votre phrase :");
        String phraseUtilisateur = scanner.nextLine();

        int taillePhraseUtilisateur = phraseUtilisateur.length();
        int compteur = 0;

        for (int i = 0; i < taillePhraseUtilisateur; i++) {
            char result = phraseUtilisateur.charAt(i);

            if (Character.isUpperCase(result)) {
                compteur++;
            }
        }

        System.out.println("Il y a " + compteur + " de majuscules dans votre phrase");
    }

    public static void passageMajuscules(Scanner scanner) {
        System.out.println("Je vais mettre votre phrase en majuscule :");
        String phraseUtilisateur = scanner.nextLine();

        String phraseUtilisateurMajuscules = phraseUtilisateur.toUpperCase();

        System.out.println(phraseUtilisateurMajuscules);
    }

    public static void inversionChaine(Scanner scanner) {
        System.out.println("Je vais inverser votre phrase :");
        String phraseUtilisateur = scanner.nextLine();

        String phraseUtilisateurInversee = new StringBuilder(phraseUtilisateur).reverse().toString();

        System.out.println(phraseUtilisateurInversee);
    }
}
