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

        poissons.add(new Merou("Maximette", Sexe.FEMELLE));
        poissons.add(new Bar("Josuette", Sexe.FEMELLE));
        poissons.add(new Carpe("Estebanette", Sexe.FEMELLE));
        poissons.add(new Sole("Enzette", Sexe.FEMELLE));
        poissons.add(new Thon("Adrienette", Sexe.FEMELLE));
        poissons.add(new PoissonClown("Kevinette", Sexe.FEMELLE));

        boolean over = false;
        Poisson poissonPredateurGagnant = null;

        for (int i = 1; i < 11; i++) {

            System.out.println("Tour : " + i);
            System.out.println();

            for (int iPoisson = 0; iPoisson < poissons.size(); iPoisson++) {

                Poisson poissonPredateur = poissons.get(iPoisson); // Tous les poissons
                int poissonPredateurHP = poissonPredateur.getPv();

                System.out.println(
                        poissonPredateur.getNom() + " est entrain de jouer, va perdre 1 PV, il a actuellement : "
                                + poissonPredateur.getPv() + " PV");

                poissonPredateurHP = poissonPredateurHP - 1;
                poissonPredateur.setPv(poissonPredateurHP);

                System.out.println(poissonPredateur.getNom() + " a " + poissonPredateur.getPv() + " PV");

                if (poissonPredateur.getPv() <= 5) {

                    // if (poissons.get(iPoisson) instanceof PoissonCarnivore poissonPredateur)
                    if (poissonPredateur instanceof PoissonCarnivore poissonPredateurCarnivore) {

                        Random rand = new Random();
                        int randomPoissonProieIndex = rand.nextInt(poissons.size());

                        Poisson poissonProie = poissons.get(randomPoissonProieIndex);
                        int poissonProieHP = poissonProie.getPv();

                        if (iPoisson == randomPoissonProieIndex) {
                            System.out
                                    .println(poissonPredateur.getNom() + " Impossible de manger "
                                            + poissonProie.getNom());

                        } else if (poissonPredateur.getClass() == poissonProie.getClass()) {

                            System.out.println("PEUT PAS MANGER UN POISSON DE LA MEME ESPECE");

                        } else {

                            System.err.println(poissonProie.getNom() + " avait " + poissonProie.getPv() + " PV");

                            poissonPredateurCarnivore.mangerPoisson(poissonProie);

                            System.out.println(poissonProie.getNom()
                                    + " s'est fait manger et à perdu 4 PV, il a donc maintenant : "
                                    + poissonProie.getPv() + " PV");

                            if (poissonProieHP <= 0) {

                                System.out.println(poissonProie.getNom() + " est mort");

                                poissons.remove(poissonProie); // si les hp du poisson sont à 0 ou en dessous il est
                                                               // enlever du tableau

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
