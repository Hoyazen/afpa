package fr.afpa;

public class Variables {

    public static void main(String[] args) {
        // variablesExercice1();
        // variablesExercice2();
        // variablesExercice3();
        // variablesExercice4();
        // variablesExercice5();
        // variablesExercice6();
        // variablesExercice7();
        // variablesExercice8();
        // variablesExercice9();
        // variablesExercice10();
        variablesExercice11();
    }

    // LES VARIABLES

    // Exercice 1 :
    public static void variablesExercice1() {
        byte a;
        byte b;

        a = (byte) 1;
        b = (byte) (a + 3);
        a = (byte) 3;

        System.out.println(a + " " + b);
    }

    // Exercice 2 :
    public static void variablesExercice2() {
        byte a;
        byte b;
        byte c;

        a = (byte) 5;
        b = (byte) 3;
        c = (byte) (a + b);
        a = (byte) 2;
        c = (byte) (b - a);

        System.out.println(a + " " + b + " " + c);
    }

    // Exercice 3 :
    public static void variablesExercice3() {
        byte a;
        byte b;

        a = (byte) 5;
        b = (byte) (a + 4);
        a = (byte) (a + 1);
        b = (byte) (a - 4);

        System.out.println(a + " " + b);
    }

    // Exercice 4 :
    public static void variablesExercice4() {
        byte a;
        byte b;
        byte c;

        a = (byte) 3;
        b = (byte) 10;
        c = (byte) (a + b);
        b = (byte) (a + b);
        a = c;

        System.out.println(a + " " + b + " " + c);
    }

    // Exercice 5 :
    public static void variablesExercice5() {
        byte a;
        byte b;

        a = (byte) 5;
        b = (byte) 2;
        a = b;
        b = a;

        System.out.println(a + " " + b);
    }

    // Exercice 6 :
    public static void variablesExercice6() {
        byte a;
        byte b;
        byte c;

        a = (byte) 5;
        b = (byte) 2;
        c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);
    }

    // Exercice 7 :
    public static void variablesExercice7() {
        byte a;
        byte b;
        byte c;
        byte d;

        a = (byte) 5;
        b = (byte) 6;
        c = (byte) 7;
        d = a;
        a = c;
        c = b;
        b = d;

        System.out.println(a + " " + b + " " + c);
    }

    // Exercice 8 :
    public static void variablesExercice8() {
        String a;
        String b;
        String c;

        a = "423";
        b = "12";
        c = a + b;

        System.out.println(c);
    }

    // Exercice 9 :
    public static void variablesExercice9() {
        String a;
        String b;
        int c;

        a = "423";
        b = "12";
        // c = a. + b;

        // System.out.println(a + " " + b + " " + c);
    }

    // Exercice 10 :
    public static void variablesExercice10() {
        String a;
        int b;
        int c;

        a = "423";
        // b = "12";
        // c = a. + b;

        // System.out.println(a + " " + b + " " + c);
    }

    // Exercice 11 :
    public static void variablesExercice11() {
        String prenom;
        byte age;
        float taille;
        boolean inscription;

        prenom = "Adrien";
        age = 24;
        taille = 1.80f;
        taille = (float) 1.80;
        inscription = true;

        System.out.println(prenom);
        System.out.println(age);
        System.out.println(taille);
        System.out.println(inscription);
    }

}
