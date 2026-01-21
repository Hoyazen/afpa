package fr.afpa;

import java.util.Scanner;
import java.text.Normalizer;

public class ChainesDeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // decompteVoyelles(scanner);
        // decompteMajuscules(scanner);
        // passageMajuscules(scanner);
        // inversionChaine(scanner);
        // transformationCamelCase(scanner);
        // tableauUnePhrase(scanner);
        palindrome(scanner);

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

    public static void transformationCamelCase(Scanner scanner) {
        System.out.println("Je vais supprimer les espaces :");
        String phraseUtilisateur = scanner.nextLine();

        int taillePhraseUtilisateur = phraseUtilisateur.length();

        StringBuilder resultat = new StringBuilder();

        boolean nouveauMot = true;

        for (int i = 0; i < taillePhraseUtilisateur; i++) {
            char phraseUtilisateurCharacter = phraseUtilisateur.charAt(i);

            if (Character.isLetter(phraseUtilisateurCharacter)) {
                resultat.append(phraseUtilisateurCharacter);
                nouveauMot = false;
            } else {
                nouveauMot = true;
            }
        }

        System.out.println(resultat.toString());
    }

    public static void tableauUnePhrase(Scanner scanner) {
        String[] tableauPhrase = { "String", "for", "ever" };

        for (String mot : tableauPhrase) {
            System.out.print(mot + " ");
        }

    }

    public static void palindrome(Scanner scanner) {
        System.out.println("Choisis une phrase et je te dis si elle est palindrome ou non :");
        String phraseUtilisateur = scanner.nextLine();

        String phraseNettoyee = Normalizer.normalize(phraseUtilisateur, Normalizer.Form.NFD)
        .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
        .replaceAll("[^a-zA-Z]", "")
        .toLowerCase();

        // System.out.println(phraseNettoyee);

        int longueurPhraseNettoyeeUtilisateur = phraseNettoyee.length();

        int i = 0;
        int y = longueurPhraseNettoyeeUtilisateur - 1;
            
        for (; i <= y; i++, y--) {
            char lettreGauche = phraseNettoyee.charAt(i);
            char lettreDroite = phraseNettoyee.charAt(y);

            if (lettreGauche != lettreDroite) {
                System.out.println("Ce n'est pas palindrome");
                return;
            }
        }

        System.out.println(phraseUtilisateur + " est palindrome");
    }
}
