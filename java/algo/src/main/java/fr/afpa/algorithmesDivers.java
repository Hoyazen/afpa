package fr.afpa;

import java.util.Scanner;

public class algorithmesDivers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int resultat = pgcd(24, 18);
        // System.out.println("Le plus grand commun diviseur est : " + resultat);

        // triangleCaracteres(scanner);

        trianglesCaracteresV2(scanner);

        scanner.close();
    }

    public static int pgcd(int a, int b) {
        int reste;
        while (b != 0) {
            reste = a % b;
            a = b;
            b = reste;
        }
        return a;
    }

    public static void triangleCaracteres(Scanner scanner) {
        System.out.println("Combien de niveaux d'étoiles veux-tu ? ");
        int reponseUtilistateur = scanner.nextInt();

        int compteur = 0;

        String resultat = "";

        while (compteur < reponseUtilistateur) {
            compteur++;
            resultat = resultat + "*";
            System.out.println(resultat);
        }
    }

    public static void trianglesCaracteresV2(Scanner scanner) {
        System.out.println("Combien de niveaux d'étoiles veux-tu ? ");
        int reponseUtilistateur = scanner.nextInt();

        int compteur = 0;

        String resultat = "";

        while (compteur < reponseUtilistateur) {
            compteur++;
            resultat = resultat + "*";
            System.out.println(resultat);
        }  

        while (compteur > 0) {
            compteur --;
            resultat = resultat.substring(0, resultat.length() - 1);
            System.out.println(resultat);
        }
    }
}
