package fr.afpa;

import java.util.Scanner;

public class StructuresControleAlternatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // majorite(scanner);
        // nombrePositifNegatif(scanner);
        // verificationParite(scanner);
        // signeProduit(scanner);
        // signePorduitZero(scanner);
        // categoriesSportives(scanner);
        // divisiblePar3(scanner);
        // tarificationPhotocopies(scanner);
        // etatEau(scanner);
        // tauxParticipationEmployeur(scanner);
        // verificationSolde(scanner);
        minMax(scanner);

        scanner.close();
    }

    // Exercice 1
    public static void majorite(Scanner scanner) {
        System.out.println("Quel est ton âge ?");
        byte age = scanner.nextByte();

        if (age >= 18) {
            System.out.println("Tu es majeur");
        } else {
            System.out.println("Tu es mineur");
        }
    }

    // Exercice 2
    public static void nombrePositifNegatif(Scanner scanner) {
        System.out.println("Choisi un nombre : ");
        int nombre = scanner.nextInt();

        if (nombre > 0) {
            System.out.println("Positif");
        } else {
            System.out.println("Négatif");
        }
    }

    // Exercice 3
    public static void verificationParite(Scanner scanner) {
        System.out.println("Choisi un nombre entier");
        int nombreEntier = scanner.nextInt();

        if (nombreEntier % 2 == 0) {
            System.out.println("C'est pair");
        } else {
            System.out.println("C'est impair");
        }
    }

    // Exercice 4
    public static void signeProduit(Scanner scanner) {
        System.out.println("Choisi un premier nombre : ");
        float nombre1 = scanner.nextFloat();

        System.out.println("Choisis en un deuxième : ");
        float nombre2 = scanner.nextFloat();

        if ((nombre1 > 0 && nombre2 > 0) || (nombre1 < 0 && nombre2 < 0)) {
            System.out.println("Positif");
        } else {
            System.out.println("Négatif");
        }
    }

    // Exercice 5
    public static void signePorduitZero(Scanner scanner) {
        System.out.println("Choisi un premier nombre : ");
        float nombre1 = scanner.nextFloat();

        System.out.println("Choisis en un deuxième : ");
        float nombre2 = scanner.nextFloat();

        if ((nombre1 > 0 && nombre2 > 0) || (nombre1 < 0 && nombre2 < 0)) {
            System.out.println("Positif");
        } else if (nombre1 == 0 || nombre2 == 0) {
            System.out.println("Nul");
        } else {
            System.out.println("Négatif");
        }
    }

    // Exercice 6
    public static void categoriesSportives(Scanner scanner) {
        System.out.println("Ton âge stp ? ");
        byte age = scanner.nextByte();

        if (age >= 6 && age <= 7) {
            System.out.println("Poussin");
        } else if (age >= 8 && age <= 9) {
            System.out.println("Pupille");
        } else if (age >= 10 && age <= 11) {
            System.out.println("Minime");
        } else if (age >= 12) {
            System.out.println("Cadet");
        } else {
            System.out.println("Impossible");
        }
    }

    // Exercice 7
    public static void divisiblePar3(Scanner scanner) {
        System.out.println("Un nombre entier : ");
        int nombre = scanner.nextInt();

        if (nombre % 3 == 0) {
            System.out.println("Divisible par 3");
        } else {
            System.out.println("Non divisible par 3");
        }
    }

    // Exercice 8
    public static void tarificationPhotocopies(Scanner scanner) {
        System.out.println("Combien de copies ? ");
        int nombreCopies = scanner.nextInt();
        float moinsDixCopies = nombreCopies * 0.5f;
        float entreDixEtVingtCopies = nombreCopies * 0.4f;
        float plusVingtCopies = nombreCopies * 0.3f;

        if (nombreCopies < 10 && nombreCopies > 0) {
            System.out.println(moinsDixCopies + " euros");
        } else if (nombreCopies > 10 && nombreCopies < 20) {
            System.out.println(entreDixEtVingtCopies + " euros");
        } else if (nombreCopies > 20) {
            System.out.println(plusVingtCopies + " euros");
        } else {
            System.out.println("Impossible");
        }
    }

    // Exercice 9
    public static void etatEau(Scanner scanner) {
        System.out.println("Quelle est la température de l'eau ? ");
        float temperatureEau = scanner.nextFloat();

        if (temperatureEau < 0) {
            System.out.println("SOLIDE");
        } else if (temperatureEau >= 0 && temperatureEau <= 100) {
            System.out.println("LIQUIDE");
        } else {
            System.out.println("GAZEUX");
        }
    }

    // Exercice 10
    public static void tauxParticipationEmployeur(Scanner scanner) {
        float taux = 0f;

        System.out.println("Es-tu célibataire ? Il faut répondre : 'oui' ou 'non' ");
        String celibataireOuiNon = scanner.nextLine();

        if (celibataireOuiNon.equalsIgnoreCase("oui")) {
            taux = taux + 20;
        } else {
            taux = taux + 25;
        }

        System.out.println(taux);

        System.out.println("Avez-vous des enfants ? Il faut répondre : 'oui' ou 'non' ");
        String enfantsOuiNon = scanner.nextLine();

        if (enfantsOuiNon.equalsIgnoreCase("oui")) {
            System.out.println("Combien d'enfants ? ");
            byte nombreEnfants = scanner.nextByte();

            taux = (nombreEnfants * 15) + taux;

            if (taux > 50) {
                taux = 50;
            }

            System.out.println("Votre taux est donc de : " + taux);
        } else {
            System.out.println("Votre taux reste le même : " + taux);
        }

        System.out.println("Quel est votre salaire mensuel ? en euros : ");
        float salaireMensuel = scanner.nextFloat();

        if (salaireMensuel < 1800) {
            taux = taux * 1.10f;
            System.out.println("Votre taux est de : " + taux);

            if (taux > 50) {
                taux = 50;
            }
        } else if (taux > 50) {
            taux = 50;
            System.out.println("Votre taux est de : " + taux);
        } else {
            System.out.println("Votre taux est de : " + taux);
        }
    }

    public static void verificationSolde(Scanner scanner) {
        System.out.println("Combien t'as d'agent ? ");

        float argent = scanner.nextFloat();

        System.out.println("Combien coûte l'article ? ");

        float prixArticle = scanner.nextFloat();

        System.out.println("Combien souhaitez vous d'articles ? ");

        int nombreArticles = scanner.nextInt();

        float prixFinal = prixArticle * nombreArticles;

        float restes = argent - prixFinal;

        if (prixFinal > argent) {
            System.out.println("Trop pauvre");
        } else if (prixFinal < argent) {
            System.out.println("Tu peux et il te reste : " + restes);
        } else {
            System.out.println("Tout pile assez");
        }
    }

    public static void minMax(Scanner scanner) {
        System.out.println("Choisissez un nombre : ");

        float premierNombre = scanner.nextFloat();

        System.out.println("Un deuxième nombre : ");

        float deuxiemeNombre = scanner.nextFloat();

        System.out.println("Un troisième nombre : ");

        float troisiemeNombre = scanner.nextFloat();

        float min = Math.min(premierNombre, Math.min(deuxiemeNombre, troisiemeNombre));

        float max = Math.max(premierNombre, Math.max(deuxiemeNombre, troisiemeNombre));

        System.out.println("Le plus petit est : " + min);

        System.out.println("Le plus grand est : " + max);
    }
}
