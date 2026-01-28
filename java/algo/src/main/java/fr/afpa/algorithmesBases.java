package fr.afpa;

public class algorithmesBases {
    public static void main(String[] args) {
        int[] tab = {42, 7, 19, 3, 88};

        triSelection(tab);
        
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        int[] tableau = {42, 7, 19, 3, 88};

        triBulle(tableau);
    }

    public static void triBulle(int[] tab) {
        int tmp;

        for (int i = tab.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (tab[k] > tab[k + 1]) {
                    tmp = tab[k];
                    tab[k] = tab[k + 1];
                    tab[k + 1] = tmp;
                }
            }
        }
    }

    public static void triSelection(int[] tableau) {
        int n = tableau.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (tableau[i] > tableau[j]) {

                    int temp = tableau[i];
                    tableau[i] = tableau[j];
                    tableau[j] = temp;
                }
            }
        }
    }
}
