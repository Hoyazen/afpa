package fr.afpa;

public class algorithmesDivers {
    public static void main(String[] args) {
        int resultat = pgcd(24, 18);
        System.out.println("Le plus grand commun diviseur est : " + resultat);
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
}
