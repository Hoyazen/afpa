package fr.afpa;

import java.util.Scanner;

public class tableaux2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        analyseAlgorithme1(scanner);

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
}
