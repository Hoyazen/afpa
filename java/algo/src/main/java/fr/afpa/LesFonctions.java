package fr.afpa;

import java.util.Scanner;

public class LesFonctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // sayHello();
        // getHelloString();
        // subtract(2, 2);
        // sommeEntiers(2);
        // factorial(3;)
        maxDesTrois(0, 0, 0);

        scanner.close();
    }

    public static void sayHello() {
        System.out.println("Hello world");
    }

    public static String getHelloString() {
        return "Hi, how are you?";
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int sommeEntiers(int n) {
        int somme = 0;

        for (int i = 0; i <= n; i++) {
            somme = somme + i;
        }

        return somme;
    }

    public static int factorial(int n) {
        int resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat = resultat * i;
        }

        return resultat;
    }

    public static int maxDesTrois(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

}
