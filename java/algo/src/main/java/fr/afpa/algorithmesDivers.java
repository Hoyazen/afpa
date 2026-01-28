package fr.afpa;

import java.math.BigInteger;
import java.util.Scanner;

public class algorithmesDivers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int resultat = pgcd(24, 18);
        // System.out.println("Le plus grand commun diviseur est : " + resultat);

        // triangleCaracteres(scanner);

        // trianglesCaracteresV2(scanner);

        // isValid(null);
        // System.out.println(isValid(new BigInteger("4223982640269299")));

        validationDates(scanner);

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
            compteur--;
            resultat = resultat.substring(0, resultat.length() - 1);
            System.out.println(resultat);
        }
    }

    public static boolean isValid(BigInteger cardNumber) {

        if (cardNumber == null) {
            return false;
        }

        int somme = 0;
        boolean doubler = false;

        while (cardNumber.compareTo(BigInteger.ZERO) > 0) {

            int chiffre = cardNumber.mod(BigInteger.TEN).intValue();

            if (doubler) {
                chiffre = chiffre * 2;

                if (chiffre > 9) {
                    chiffre = (chiffre / 10) + (chiffre % 10);
                }
            }

            somme += chiffre;
            doubler = !doubler;
            cardNumber = cardNumber.divide(BigInteger.TEN);
        }

        return somme % 10 == 0;
    }

    public static void validationDates(Scanner scanner) {

        System.out.println("Un jour ?");
        int reponseJour = scanner.nextInt();

        System.out.println("Un mois ?");
        int reponseMois = scanner.nextInt();

        System.out.println("Une année ?");
        int reponseAnnee = scanner.nextInt();

        int jourMax;
        boolean estBissextile;

        if (reponseAnnee > 2025 || reponseAnnee <= 1930) {
            System.out.println("Cette année n'est pas valide");
            return;
        }

        estBissextile = (reponseAnnee % 400 == 0) ||
                (reponseAnnee % 4 == 0 && reponseAnnee % 100 != 0);

        if (reponseMois < 1 || reponseMois > 12) {
            System.out.println("Ce mois n'existe pas");
            return;
        }

        if (reponseJour <= 0) {
            System.out.println("Ce jour n'existe pas");
            return;
        }

        if (reponseMois == 1 || reponseMois == 3 || reponseMois == 5 || reponseMois == 7 || reponseMois == 8 || reponseMois == 10 || reponseMois == 12) {
            jourMax = 31;
        } else if (reponseMois == 4 || reponseMois == 6 || reponseMois == 9 || reponseMois == 11) {
            jourMax = 30;
        } else { //février
            if (estBissextile) {
                jourMax = 29;
            } else {
                jourMax = 28;
            }
        }

        if (reponseJour > jourMax) {
            System.out.println("Ce jour n'existe pas pour ce mois");
            return;
        }

        System.out.println("La date est valide");
    }
}
