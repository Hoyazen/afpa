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
        Random rand = new Random(); // ✅ un seul Random

        // Création des algues
        for (int x = 0; x < 10; x++) {
            algues.add(new Algue());
        }

        // Création des poissons
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

        for (int tour = 1; tour < 31; tour++) {

            System.out.println("---------------");
            System.out.println("TOUR NUMÉRO " + tour);
            System.out.println();

            // parcours à l'envers pour éviter les bugs de suppression
            for (int i = poissons.size() - 1; i >= 0; i--) {

                Poisson poissonPredateur = poissons.get(i);

                // incrément de l'âge correctement
                poissonPredateur.setAge(poissonPredateur.getAge() + 1);

                System.out.println(poissonPredateur.getNom() + " a " + poissonPredateur.getAge() + " ANS");

                // mort par vieillesse
                if (poissonPredateur.getAge() >= 20) {
                    System.out.println(poissonPredateur.getNom() + " est mort de vieillesse");
                    poissons.remove(i);
                    continue;
                }

                System.out.println("C'est au tour de " + poissonPredateur.getNom() +
                        ". Il a actuellement : " + poissonPredateur.getPv() + " PV");

                // perte de PV
                poissonPredateur.setPv(poissonPredateur.getPv() - 1);

                System.out.println(poissonPredateur.getNom() + " a maintenant "
                        + poissonPredateur.getPv() + " PV");
                System.out.println();

                // Si faible vie → manger
                if (poissonPredateur.getPv() <= 5) {

                    if (poissonPredateur instanceof PoissonCarnivore carnivore) {

                        if (poissons.size() <= 1) continue;

                        int indexProie = rand.nextInt(poissons.size());
                        Poisson poissonProie = poissons.get(indexProie);

                        if (poissonPredateur == poissonProie) {
                            System.out.println("Impossible de se manger soi-même");
                            continue;
                        }

                        if (poissonPredateur.getClass() == poissonProie.getClass()) {
                            System.out.println("Même espèce → impossible de manger");
                            continue;
                        }

                        System.out.println(poissonProie.getNom() + " avait " + poissonProie.getPv() + " PV");

                        carnivore.mangerPoisson(poissonProie);

                        System.out.println(poissonProie.getNom()
                                + " a été attaqué et a maintenant "
                                + poissonProie.getPv() + " PV");

                        // test après attaque
                        if (poissonProie.getPv() <= 0) {
                            System.out.println(poissonProie.getNom() + " est mort");
                            poissons.remove(poissonProie);
                        }

                    } else if (poissonPredateur instanceof PoissonHerbivore herbivore) {

                        if (algues.isEmpty()) continue;

                        int indexAlgue = rand.nextInt(algues.size());
                        Algue algue = algues.get(indexAlgue);

                        herbivore.mangerAlgue(algue);
                    }
                }
            }

            // condition de fin
            if (poissons.size() == 1) {
                poissonPredateurGagnant = poissons.get(0);
                over = true;
            }

            if (over) {
                System.out.println("Fin du jeu ! Le gagnant est : "
                        + poissonPredateurGagnant.getNom());
                break;
            }
        }
    }
}