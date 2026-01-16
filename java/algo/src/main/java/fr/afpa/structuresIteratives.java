package fr.afpa;

import java.util.Scanner;

public class structuresIteratives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // saisieControlee(scanner);
        // plusPetitGrand(scanner);
        // dixNombresSuivants(scanner);
        // tableMultiplication(scanner);
        // sommeDesEntiers(scanner);
        // factorielle(scanner);
        // jeuEchec(scanner);
        // carreValeurs(scanner);
        // maximumNombres(scanner);
        // maximum(scanner);
        // abonnesYoutube(scanner);
        // sommeZeroAN(scanner);
        // fizzBuzz(scanner);
        renduMonnaie(scanner);

        scanner.close();
    }

    public static void saisieControlee(Scanner scanner) {
        byte nombre;

        do {
            System.out.print("Choisis un nombre entre 1 et 3 : ");
            nombre = scanner.nextByte();
        } while (nombre < 1 || nombre > 3);

        System.out.println("Merci ! Tu as choisi : " + nombre);
    }

    public static void plusPetitGrand(Scanner scanner) {
        byte nombre;

        do {
            System.out.println("Choisis un nombre entre 10 et 20 :");
            nombre = scanner.nextByte();

            if (nombre > 20) {
                System.out.println("Plus petit !");
            } else if (nombre < 10) {
                System.out.println("Plus grand !");
            }
        } while (nombre > 20 || nombre < 10);
    }

    public static void dixNombresSuivants(Scanner scanner) {
        System.out.println("Choisi un nombre :");
        int nombre = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(nombre + (i + 1));
        }
    }

    public static void tableMultiplication(Scanner scanner) {
        System.out.println("Nombre de départ :");
        int nombre = scanner.nextInt();

        int i;

        for (i = 0; i < 10; i++) {
            int multiplicateur = i + 1;
            int resultat = nombre * multiplicateur;

            System.out.println(nombre + " x " + multiplicateur + " = " + resultat);
        }
    }

    public static void sommeDesEntiers(Scanner scanner) {
        System.out.println("Choisis un nombre :");
        int nombre = scanner.nextInt();

        int i;
        int somme = 0;

        for (i = 0; i < nombre; i++) {
            somme = somme + i;
        }

        System.out.println(somme);
    }

    public static void factorielle(Scanner scanner) {
        System.out.println("Choisis un nombre :");
        int n = scanner.nextInt();

        long factorielle = 1;

        for (int i = 1; i <= n; i++) {
            factorielle = factorielle * i;
        }

        System.out.println(n + "! = " + factorielle);
    }

    public static void jeuEchec(Scanner scanner) {
        long total = 0;
        long grains = 1;

        for (int i = 1; i <= 63; i++) {
            total = total + grains;
            grains = grains * 2;
        }

        System.out.println("Nombre total de grains sur l'échiquier : " + total);
    }

    public static void carreValeurs(Scanner scanner) {
        System.out.println("Combien de lignes souhaites-tu afficher ?");
        int lignes = scanner.nextInt();

        int i;
        int j;

        for (i = 1; i <= lignes; i++) {
            for (j = 1; j <= lignes; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void maximumNombres(Scanner scanner) {
        int i;
        int maximum = Integer.MIN_VALUE;
        int position = 0;

        for (i = 1; i <= 10; i++) {
            System.out.println("Choisissez le numéro " + i + " :");
            int nombre = scanner.nextInt();

            if (nombre > maximum) {
                maximum = nombre;
                position = i;
            }
        }

        System.out.println("Le plus grand est : " + maximum);
        System.out.println("La position est : " + position);
    }

    public static void maximum(Scanner scanner) {
        int maximum = Integer.MIN_VALUE;
        int positionMax = 0;
        int numero = 0;
        int nombre;

        System.out.println("Saisissez des nombres (0 pour arrêter) :");

        while (true) {
            numero++;
            System.out.print("Choisissez le numéro " + numero + " : ");
            nombre = scanner.nextInt();

            if (nombre == 0) {
                System.out.println("Fin du processus.");
                break;
            }

            if (nombre > maximum) {
                maximum = nombre;
                positionMax = numero;
            }
        }

        if (numero == 1 && maximum == Integer.MIN_VALUE) {
            System.out.println("Aucun nombre saisi.");
        } else {
            System.out.println("Le plus grand nombre est : " + maximum);
            System.out.println("C'était le nombre numéro " + positionMax);
        }
    }

    public static void abonnesYoutube(Scanner scanner) {
        int abonnes = 2500;
        float croissance = 1.05f;

        System.out.println("Ton nombre d'abonnées dans x mois : ");
        int nombreMois = scanner.nextInt();

        int i;

        for (i = 0; i < nombreMois; i++) {
            abonnes = (int) (abonnes * croissance);
        }

        System.out.println(abonnes);
    }

    public static void sommeZeroAN(Scanner scanner) {
        System.out.println("Choisis un nombre");

        int n = scanner.nextInt();
        int somme = 0;
        int i;

        for (i = 0; i <= n; i++) {
            somme = somme + i;
        }

        System.out.println("Ton nombre est : " + somme);
    }

    public static void fizzBuzz(Scanner scanner) {
        System.out.println("Choisis un numéro :");
        int numero = scanner.nextInt();

        int i;

        for (i = 1; i <= numero; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void renduMonnaie(Scanner scanner) {
        int total = 0;
        int valeur;

        do {
            System.err.println("Choisis un nouveau nombre (0 pour terminer)");
            valeur = scanner.nextInt();
            total = total + valeur;

        } while (valeur != 0);

        System.out.println("Votre total est de : " + total);

        System.out.println("Combien souhaitez-vous donner ?");
        int solde = scanner.nextInt();

        int renduMonnaie = solde - total;

        int nbBillet10 = renduMonnaie / 10;
        renduMonnaie = renduMonnaie % 10;

        int nbBillet5 = renduMonnaie / 5;
        renduMonnaie = renduMonnaie % 5;

        int nbBillet1 = renduMonnaie;

        System.out.println("Billets de 10€ : " + nbBillet10);
        System.out.println("Billets de 5€ : " + nbBillet5);
        System.out.println("Billets de 1€ : " + nbBillet1);
    }
}
