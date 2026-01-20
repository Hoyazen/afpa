package fr.afpa;

import java.util.Scanner;

public class ChainesDeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        decompteVoyelles(scanner);

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
}
