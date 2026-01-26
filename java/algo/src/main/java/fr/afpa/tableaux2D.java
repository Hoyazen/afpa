package fr.afpa;

import java.util.Scanner;

public class tableaux2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // analyseAlgorithme1(scanner);
        // analyseAlgorithme2(scanner);
        // analyseAlgorithme3(scanner);
        // analyseAlgorithme4(scanner);
        // analyseAlgorithme5(scanner);
        // affichageTableau(scanner);
        // initialisationTableau(scanner);
        // valeurMaximale(scanner);
        // sommeTableau(scanner);
        diagonalesTableaux(scanner);

        scanner.close();
    }

    public static void analyseAlgorithme1(Scanner scanner) {
        int[][] tableau = {
            {6, 6, 6},
            {0, 0, 0},
            {9, 9, 9}
        };

        for(int i = 0; i < 2; i++) {
            System.out.println("---");
            for(int j = 0; j < 2; j ++) {
                System.out.println(tableau[i][j]);
            }
        }
    }

    public static void analyseAlgorithme2(Scanner scanner) {
        int[][] tableau = new int[2][3];
        int val = 1;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                tableau[i][j] = val;
                val = val + 1;
            }
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println(tableau[i][j]);
            }
        }
    }

    public static void analyseAlgorithme3(Scanner scanner) {
        int[][] tableau = new int[2][3];
        int val = 1;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                tableau[i][j] = val;
                val = val + 1;
            }
        }

        for(int j = 0; j < 3; j++) {
            for(int i = 0; i < 2; i++) {
                System.out.println(tableau[i][j]);
            }
        }
    }

    public static void analyseAlgorithme4(Scanner scanner) {
        int[][] tableau = new int[4][2];

        for (int k = 0; k < 4; k ++) {
            for (int m = 0; m < 2; m++) {
                tableau[k][m] = k + m;
            }
        }

        for (int k = 0; k < 4; k++) {
            for (int m = 0; m < 2; m++) {
                System.out.println(tableau[k][m]);
            }
        }
    }

    public static void analyseAlgorithme5(Scanner scanner) {
        // int[][] tableau = new int[4][2];

        // for (int k = 0; k < 4; k ++) {
        //     for (int m = 0; m < 2; m++) {
        //         tableau[k][m] = 2 * k + (m + 1);
        //     }
        // }

        // for (int k = 0; k < 4; k++) {
        //     for (int m = 0; m < 2; m++) {
        //         System.out.println(tableau[k][m]);
        //     }
        // }

        int[][] tableau = new int[4][2];

        for (int k = 0; k < 4; k ++) {
            for (int m = 0; m < 2; m++) {
                tableau[k][m] = (k + 1) + 4 * m;
            }
        }

        for (int k = 0; k < 4; k++) {
            for (int m = 0; m < 2; m++) {
                System.out.println(tableau[k][m]);
            }
        }
    }

    public static void affichageTableau(Scanner scanner) {
        int[][] tableau = new int[3][4];
        tableau[0][0] = 13;
        tableau[0][1] = 44;
        tableau[0][2] = 231;
        tableau[0][3] = 12;
        tableau[1][0] = 0;
        tableau[1][1] = 0;
        tableau[1][2] = 2;
        tableau[1][3] = 0;
        tableau[2][0] = 56;
        tableau[2][1] = 87;
        tableau[2][2] = 9;
        tableau[2][3] = 19;

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void initialisationTableau(Scanner scanner) {
        int[][] tableau = new int[4][10];

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = 0;
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void valeurMaximale(Scanner scanner) {
        int[][] tableau = new int[3][3];

        for (int i = 0; i < tableau.length; i ++) {
            for (int j = 0; j < tableau[i].length; j ++) {
                tableau[i][j] = (int)(Math.random() * 100);
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }

        int max = tableau[0][0];

        for (int i = 0; i < tableau.length; i ++) {
            for (int j = 0; j < tableau[i].length; j ++) {
                if (tableau[i][j] > max) {
                    max = tableau[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("La valeur max est : " + max);
    }

    public static void sommeTableau(Scanner scanner) {
        int[][] tableau = new int[3][3];

        for (int i = 0; i < tableau.length; i ++) {
            for (int j = 0; j < tableau[i].length; j ++) {
                tableau[i][j] = (int)(Math.random() * 100);
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }

        int valeur = 0;

        for (int i = 0; i < tableau.length; i ++) {
            for (int j = 0; j < tableau[i].length; j ++) {
                valeur = valeur + tableau[i][j];
            }
        }
        System.out.println();
        System.out.println("Le tout donne : " + valeur);
    }

    public static void diagonalesTableaux(Scanner scanner) {
        int[][] array2D = {
                {4, 6, 5, 2},
                {7, 11, 34, 1},
                {28, 6, 2, 15},
                {1, 2, 3, 19}
            };

            int width = 4;
            int height = 4;
            int diagonalType = 1;

            int somme = 0;

            for (int i = 0; i < height; i++) {
                if (diagonalType == 1) {
                    somme += array2D[i][i];
                } else if (diagonalType == 2) {
                    somme += array2D[i][width - 1 - i];
                }
            }

            System.out.println("Somme de la diagonale " + diagonalType + " = " + somme);
        }
    }
