package fr.afpa;

public class OperateursArithmetiques {

    public static void main(String[] args) {
        calculatriceSimple();
        calculDaire();
        volumeCone();
    }

    // Exercice 1
    public static void calculatriceSimple() {
        byte a;
        byte b;
        byte c;
        byte d;
        byte e;
        byte f;

        a = 5;
        b = 3;
        c = (byte) (a + b);
        d = (byte) (a - b);
        e = (byte) (a * b);
        f = (byte) (a / b);

        System.out.println(c + " " + d + " " + e + " " + f);
    }

    // Exercice 2
    public static void calculDaire() {
        int aire;
        int longueur;
        int largeur;

        longueur = 320;
        largeur = 398;

        aire = largeur * longueur;

        System.out.println(aire);

    }

    // Exercice 3
    public static void volumeCone() {
        int rayon;
        int hauteur;
        double volume;

        rayon = 5;
        hauteur = 12;

        volume = (1d / 3) * Math.PI * rayon * hauteur;

        System.out.println(volume);

    }

}
