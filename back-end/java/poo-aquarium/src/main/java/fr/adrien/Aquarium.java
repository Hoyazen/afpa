package fr.adrien;

import java.util.ArrayList;
import java.util.Random;

import fr.adrien.alimentations.PoissonCarnivore;
import fr.adrien.alimentations.PoissonHerbivore;
import fr.adrien.enums.Sexe;
import fr.adrien.poissons.Bar;
import fr.adrien.poissons.Carpe;
import fr.adrien.poissons.Merou;
import fr.adrien.poissons.PoissonClown;
import fr.adrien.poissons.Sole;
import fr.adrien.poissons.Thon;

public class Aquarium {
    public static void main(String[] args) {
        ArrayList<Poisson> poissons = new ArrayList<>();
        ArrayList<Algue> algues = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            Algue algue = new Algue();
            algues.add(algue);
        }

        poissons.add(new Merou("Maxime", Sexe.MALE));
        poissons.add(new Bar("Josua", Sexe.MALE));
        poissons.add(new Carpe("Esteban", Sexe.MALE));
        poissons.add(new Sole("Enzo", Sexe.MALE));
        poissons.add(new Thon("Adrien", Sexe.MALE));
        poissons.add(new PoissonClown("Kevin", Sexe.MALE));

        poissons.add(new Merou("Maxime", Sexe.FEMELLE));
        poissons.add(new Bar("Josua", Sexe.FEMELLE));
        poissons.add(new Carpe("Esteban", Sexe.FEMELLE));
        poissons.add(new Sole("Enzo", Sexe.FEMELLE));
        poissons.add(new Thon("Adrien", Sexe.FEMELLE));
        poissons.add(new PoissonClown("Kevin", Sexe.FEMELLE));

        boolean over = false;
        Poisson poissonPredateurGagnant = null;

        for (int i = 0; i < 5; i++) { // ma boucle du nombre de tour de jeu

            for (int iPoisson = 0; iPoisson < poissons.size(); iPoisson++) { // boucle sur la taille du tableau des poissons

                Poisson poissonPredateur = poissons.get(iPoisson); // tous les poissons
                int poissonPredateurHP = poissonPredateur.getPv(); // le .get c'est pour récupérer l'information
                poissonPredateurHP = poissonPredateurHP - 1;
                poissonPredateur.setPv(poissonPredateurHP); // et le .set c'est pour modifier l'information (la sauvegarder) vu qu'on l'a modifié juste avant
                System.out.println(poissonPredateur.getNom() + " a " + poissonPredateur.getPv() + " pv");

                if (poissonPredateur.getPv() <= 5) {

                    // if (poissons.get(iPoisson) instanceof PoissonCarnivore poissonPredateur)
                    if (poissonPredateur instanceof PoissonCarnivore) {

                        // le random en JAVA
                        Random rand = new Random();
                        int randomPoissonProieIndex = rand.nextInt(poissons.size());

                        // pour récupérer un poisson random de la liste des poissons
                        Poisson poissonProie = poissons.get(randomPoissonProieIndex);
                        int poissonProieHP = poissonProie.getPv();

                        if (iPoisson == randomPoissonProieIndex) { // vérification pour pas que le poissons se mange lui même
                            System.out
                                    .println(poissonPredateur.getNom() + " Impossible de manger " + poissonProie.getNom());
                        } else {

                            ((PoissonCarnivore) poissonPredateur).mangerPoisson(poissonProie); // on met poissons carnivore pour qu'il prenne bien que les poissonsPredateurs carnivores, ce sont les seules qui peuvent manger d'autres poissons (on cast)
                            poissonProieHP = poissonProieHP - 4;
                            poissonProie.setPv(poissonProieHP);
                            System.out.println(poissonProie.getNom() + " a " + poissonProie.getPv() + " pv");

                            if (poissonProieHP <= 0) {
                                System.out.println(poissonProie.getNom() + " est mort");
                                poissons.remove(poissonProie);
                            }
                            // poissons.remove(poissonProie);

                            // if (poissons.size() == 1) {
                            // poissonPredateurGagnant = poissonPredateur;
                            // over = true;
                            // }
                        }

                        System.out.println("************************");

                        // if (algues.get(iAlgue) instanceof PoissonHerbivore poissonPredateur)
                    } else if (poissonPredateur instanceof PoissonHerbivore) {

                        // même logique que le poissonCarnivore pour l'instant
                        Random rand = new Random();
                        int randomAlgueIndex = rand.nextInt(algues.size());

                        Algue algueProie = algues.get(randomAlgueIndex);
                        ((PoissonHerbivore) poissonPredateur).mangerAlgue(algueProie);
                        System.out.println("=====================");
                    }
                }
            }

            if (over) {
                System.out.println("finito il n'en reste qu'un et c'est : " + poissonPredateurGagnant.getNom());
                break;
            }
            System.out.println("-------------------------------------");
        }
    }
}
