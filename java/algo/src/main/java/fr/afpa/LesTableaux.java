package fr.afpa;

import java.util.Scanner;

public class LesTableaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // iterationSimple(scanner);
        // initialisationTableau(scanner);
        // initialisationTableau2(scanner);
        // rechercheSequentielle(scanner);
        // double[] notes = new double[9];
        // saisieNotes(scanner, notes);
        // analyseAlgorithme(scanner);
        // analyseAlgorithme2(scanner);
        // analyseAlgorithme3(scanner);
        // calculMoyenne(scanner);
        // sommeDeuxIndex(scanner);
        // sommeElementsTableau(scanner);
        // int[] tableau = { 1, 3, 7, 2, 5, 19 };
        // verificationOrdreCroissant(scanner, tableau);
        int[] array1 = { 1, 3, 4, 5 };
        int[] array2 = { 2, 4, 6, 8 };
        // additionTableau(array1, array2);
        operationsTableaux(array1, array2);

        scanner.close();
    }

    public static void iterationSimple(Scanner scanner) {
        double[] doubleArray = { 12.2, 11.3, 4.4, 2.0 };
        int i;

        for (i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
    }

    public static void initialisationTableau(Scanner scanner) {
        String[] voyelles = { "A", "E", "I", "O", "U", "Y" };
        int i;

        for (i = 0; i < voyelles.length; i++) {
            System.out.println(voyelles[i]);
        }
    }

    public static void initialisationTableau2(Scanner scanner) {
        int[] entiers = new int[7];
        int i;

        for (i = 0; i <= 6; i++) {
            entiers[i] = 0;
        }
    }

    public static void rechercheSequentielle(Scanner scanner) {
        int[] entiers = { 1, 2, 4, 8, 5 };
        int value = 8;

        // int i;

        // for (i = 0; i < entiers.length; i++) {
        // if (value == entiers[i]) {
        // System.out.println("Le numéro : " + value + " est à l'index : " + i);
        // break;
        // } else {
        // System.out.println("Toujours pas");
        // }
        // }

        int index = 0;
        boolean trouve = false;

        // while (index < entiers.length && !trouve) {
        // if (entiers[index] == value) {
        // System.out.println("Le numéro : " + value + " est à l'index : " + index);
        // trouve = true;
        // } else {
        // index++;
        // }
        // }

        // if (!trouve) {
        // System.out.println("Valeur non trouvée");
        // }

        do {
            if (entiers[index] == value) {
                System.out.println("Le numéro : " + value + " est à l'index : " + index);
                trouve = true;
            } else {
                index++;
            }
        } while (index < entiers.length && !trouve);

        if (!trouve) {
            System.out.println("Valeur non trouvée");
        }

    }

    public static void saisieNotes(Scanner scanner, double[] notes) {

        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrez la note " + (i + 1) + " : ");
            notes[i] = scanner.nextDouble();
        }
    }

    public static void analyseAlgorithme(Scanner scanner) {
        int[] nb = new int[7];

        int i;

        for (i = 0; i < 6; i++) {
            nb[i] = i * i;
        }

        for (i = 0; i < 6; i++) {
            System.out.println(nb[i]);
        }
    }

    public static void analyseAlgorithme2(Scanner scanner) {
        int[] n = new int[7];

        int i;
        int k;

        n[0] = 1;

        for (k = 1; k < 7; k++) {
            n[k] = n[k - 1] + 2;
        }

        for (i = 0; i < 7; i++) {
            System.out.println(n[i]);
        }
    }

    public static void analyseAlgorithme3(Scanner scanner) {
        int[] suite = new int[8];

        int i;

        suite[0] = 1;
        suite[1] = 1;

        for (i = 2; i < 8; i++) {
            suite[i] = suite[i - 1] + suite[i - 2];
        }

        for (i = 0; i < 8; i++) {
            System.out.println(suite[i]);
        }
    }

    public static void calculMoyenne(Scanner scanner) {
        int[] tableau = { 5, 4, 9, 10, 46, 18 };

        int i;
        int somme = 0;

        for (i = 0; i < tableau.length; i++) {
            somme = somme + tableau[i];
        }

        float moyenne = 0;

        moyenne = (float) somme / tableau.length;
        System.out.println(moyenne);
    }

    public static void sommeDeuxIndex(Scanner scanner) {
        int[] tableau = { 4, 6, 2, 2 };

        int i = 1;
        int j = 3;
        int k;
        int somme = 0;

        for (k = i; k < j; k++) {
            somme = somme + tableau[k];
        }

        System.out.println(somme);
    }

    public static void sommeElementsTableau(Scanner scanner) {
        int[] tableau = { 5, 4, 9, 10, 46, 18 };

        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme = somme + tableau[i];
        }

        System.out.println(somme);
    }

    public static int verificationOrdreCroissant(Scanner scanner, int[] tableau) {

        for (int i = 0; i < tableau.length - 1; i++) {
            if (tableau[i] > tableau[i + 1]) {
                return 0;
            }
        }

        return 1;
    }

    public static void additionTableau(int[] array1, int[] array2) {

        int[] resultat = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            resultat[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < resultat.length; i++) {
            System.out.println(resultat[i]);
        }
    }

    public static void operationsTableaux(int[] array1, int[] array2) {
        int somme = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                somme = somme + (array1[i] * array2[j]);
            }
        }

        System.out.println(somme);
    }

    public static void fusionTableaux(int[] array1, int[] array2) {

    }

}
