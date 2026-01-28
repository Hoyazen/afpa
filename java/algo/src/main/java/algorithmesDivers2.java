import java.util.Scanner;

public class algorithmesDivers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        rechercheDichotomique(scanner);

        scanner.close();
    }

    public static void rechercheDichotomique(Scanner scanner) {

        int[] tableau = {53, 12, 89, 24, 70, 8, 96, 21, 58, 32, 85, 14, 53, 94, 80, 19, 22, 87, 74, 89, 10};
        System.out.println(tableau.length);

        for (int i = 0; i < tableau.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[j] < tableau[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = tableau[i];
            tableau[i] = tableau[minIndex];
            tableau[minIndex] = temp;
        }

        System.out.println("Tableau trié :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        System.out.print("Entrez la valeur à rechercher : ");
        int valueToFind = scanner.nextInt();

        int gauche = 0;
        int droite = tableau.length - 1;
        boolean trouve = false;

        while (gauche <= droite) {
            int milieu = (gauche + droite) / 2;

            if (tableau[milieu] == valueToFind) {
                System.out.println("Valeur trouvée à l'index " + milieu);
                trouve = true;
                break;
            } 
            else if (valueToFind < tableau[milieu]) {
                droite = milieu - 1;
            } 
            else {
                gauche = milieu + 1;
            }
        }

        if (!trouve) {
            System.out.println("Valeur non trouvée dans le tableau.");
        }
    }

}