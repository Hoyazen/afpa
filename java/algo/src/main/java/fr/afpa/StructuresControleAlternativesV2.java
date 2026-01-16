package fr.afpa;

import java.util.Scanner;

public class StructuresControleAlternativesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // conditionLogique(scanner);
        // conditionLogique2(scanner);
        // heureMinute(scanner);
        // heureSeconde(scanner);
        // electionslegislatives(scanner);
        assuranceAutomobile(scanner);

        scanner.close();
    }

    public static void conditionLogique(Scanner scanner) {
        System.out.println("Choisis un nombre : ");
        int foo = scanner.nextInt();

        System.out.println("Un deuxième : ");
        int bar = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choisis un mot : ");
        String quz = scanner.nextLine();

        if (foo > bar + 4) {
            foo = foo + 1;
        } else {
            if (quz.equalsIgnoreCase("OK")) {
                foo = foo + 1;
            } else {
                foo = foo - 1;
            }
        }

        System.out.println(foo);
    }

    public static void conditionLogique2(Scanner scanner) {
        System.out.println("Choisis un nombre : ");
        int foo = scanner.nextInt();

        System.out.println("Un deuxième : ");
        int bar = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choisis un mot : ");
        String quz = scanner.nextLine();

        if (foo > bar + 4 && !quz.equalsIgnoreCase("OK")) {
            foo = foo + 1;
        } else {
            foo = foo - 1;
        }
    }

    public static void heureMinute(Scanner scanner) {
        System.out.println("Une heure : ");
        byte heure = scanner.nextByte();

        System.out.println("Des minutes : ");
        byte minutes = scanner.nextByte();

        minutes = (byte) (minutes + 1);

        System.out.println("Dans une minute il sera : " + heure + " H et " + minutes + " Minutes");

    }

    public static void heureSeconde(Scanner scanner) {
        System.out.println("Une heure : ");
        byte heure = scanner.nextByte();

        System.out.println("Des minutes : ");
        byte minutes = scanner.nextByte();

        System.out.println("Des secondes : ");
        byte secondes = scanner.nextByte();

        secondes = (byte) (secondes + 1);

        System.out.println(
                "Dans une seconde il sera : " + heure + " H et " + minutes + " Minutes " + secondes + " Secondes");
    }

    public static void electionslegislatives(Scanner scanner) {
        System.out.print("Entrez le score du candidat 1 : ");
        double c1 = scanner.nextDouble();

        System.out.print("Entrez le score du candidat 2 : ");
        double c2 = scanner.nextDouble();

        System.out.print("Entrez le score du candidat 3 : ");
        double c3 = scanner.nextDouble();

        System.out.print("Entrez le score du candidat 4 : ");
        double c4 = scanner.nextDouble();

        if (c1 > 50) {
            System.out.println("Le candidat 1 est élu dès le premier tour");
        } else if (c1 >= 12.5) {
            if (c1 >= c2 && c1 >= c3 && c1 >= c4) {
                System.out.println("Le candidat 1 est en ballottage favorable");
            } else {
                System.out.println("Le candidat 1 est en ballottage défavorable");
            }
        } else {
            System.out.println("Le candidat 1 est battu dès le premier tour");
        }
    }

    public static void assuranceAutomobile(Scanner scanner) {
        String t1 = "bleu";
        String t2 = "vert";
        String t3 = "orange";
        String t4 = "rouge";
        int anneeBase = 2025;
        int permisTemps = 0;

        System.out.println("Votre âge ? ");
        byte age = scanner.nextByte();
        scanner.nextLine();

        System.out.println("Avez-vous le permis ? oui ou non ");
        String permis = scanner.nextLine();

        if (permis.equalsIgnoreCase("oui")) {
            System.out.println("En quelle année avez-vous eu le permis ? ");
            permisTemps = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Pas de permis");
            return;
        }

        int permis2Ans = anneeBase - permisTemps;

        System.out.println("Combien d'accidents avez-vous eu ? ");
        int accident = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Depuis combien d'années êtes-vous client ? ");
        int ancienneteClient = scanner.nextInt();
        scanner.nextLine();

        String tarif = "";

        if (age < 25 && permis2Ans < 2) {
            if (accident == 0) {
                tarif = t4;
            } else {
                System.out.println("Assurance refusée");
                return;
            }
        } else if ((age < 25 && permis2Ans >= 2) || (age >= 25 && permis2Ans < 2)) {
            if (accident == 0) {
                tarif = t3;
            } else if (accident == 1) {
                tarif = t4;
            } else {
                System.out.println("Assurance refusée");
                return;
            }
        } else if (age >= 25 && permis2Ans >= 2) {
            if (accident == 0) {
                tarif = t2;
            } else if (accident == 1) {
                tarif = t3;
            } else if (accident == 2) {
                tarif = t4;
            } else {
                System.out.println("Assurance refusée");
                return;
            }
        }

        if (!tarif.isEmpty() && ancienneteClient > 1) {
            if (tarif.equals(t4))
                tarif = t3;
            else if (tarif.equals(t3))
                tarif = t2;
            else if (tarif.equals(t2))
                tarif = t1;
        }

        System.out.println("Votre tarif est : " + tarif);
    }
}
