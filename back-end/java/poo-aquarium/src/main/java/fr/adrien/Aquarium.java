package fr.adrien;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import com.fasterxml.jackson.databind.ObjectMapper;

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
        Random rand = new Random();

        // poissons.add(new Merou("Maxime", Sexe.MALE));
        // poissons.add(new Bar("Josua", Sexe.MALE));
        // poissons.add(new Carpe("Esteban", Sexe.MALE));
        // poissons.add(new PoissonClown("Kevinette", Sexe.FEMELLE));

        try {

                for (Poisson poisson : poissons) {
                    System.out.println(poisson);
                }

                // Chargement du fichier JSON
                ObjectMapper mapper = new ObjectMapper();

                File file = new File("aquarium.json");

                mapper.writeValue(file, poissons);

                System.out.println("Aquarium sauvegardé dans : " + file.getAbsolutePath());

                // AquariumData data = mapper.readValue(
                //         new File("aquarium.json"),
                //         AquariumData.class);

                // Création des algues depuis le JSON
                // for (AlgueData algueData : data.getAlgues()) {

                //     for (int i = 0; i < algueData.getQuantite(); i++) {
                //         algues.add(new Algue());
                //     }
                // }

                // Création des poissons depuis le JSON
                // for (PoissonData poissonData : data.getPoissons()) {

                // Sexe sexe = Sexe.valueOf(poissonData.getSexe());

                // switch (poissonData.getRace()) {

                // case "Bar":
                // poissons.add(new Bar(poissonData.getNom(), sexe));
                // break;

                // case "Carpe":
                // poissons.add(new Carpe(poissonData.getNom(), sexe));
                // break;

                // case "Merou":
                // poissons.add(new Merou(poissonData.getNom(), sexe));
                // break;

                // case "PoissonClown":
                // poissons.add(new PoissonClown(poissonData.getNom(), sexe));
                // break;

                // case "Sole":
                // poissons.add(new Sole(poissonData.getNom(), sexe));
                // break;

                // case "Thon":
                // poissons.add(new Thon(poissonData.getNom(), sexe));
                // break;
                // }
                // }

            } catch (Exception e) {

                System.out.println("Erreur chargement JSON");
                e.printStackTrace();
                return;
            }

        boolean over = false;
        Poisson gagnant = null;

        // Boucle principale
        for (int tour = 1; tour <= 15; tour++) {

            RapportTour rapport = new RapportTour(tour);

            for (int i = poissons.size() - 1; i >= 0; i--) {

                Poisson poisson = poissons.get(i);

                boolean aDejaReproduit = false;

                // Vieillissement
                int ancienAge = poisson.getAge();

                poisson.setAge(poisson.getAge() + 1);

                rapport.addEvolution(
                        poisson.getNom()
                                + " (" + poisson.getType() + ") âge "
                                + ancienAge
                                + " -> "
                                + poisson.getAge());

                // Mort vieillesse
                if (poisson.getAge() >= 20) {

                    rapport.addMort(
                            poisson.getNom()
                                    + " (" + poisson.getType() + ") est mort de vieillesse");

                    poissons.remove(i);
                    continue;
                }

                // Perte PV
                poisson.setPv(poisson.getPv() - 1);

                // Mort PV
                if (poisson.getPv() <= 0) {

                    rapport.addMort(
                            poisson.getNom()
                                    + " (" + poisson.getType() + ") est mort (PV = 0)");

                    poissons.remove(i);
                    continue;
                }

                // Action faim
                if (poisson.getPv() <= 5) {

                    // Carnivore
                    if (poisson instanceof PoissonCarnivore carnivore) {

                        if (poissons.size() > 1) {

                            Poisson proie = poissons.get(rand.nextInt(poissons.size()));

                            if (poisson != proie
                                    && poisson.getClass() != proie.getClass()) {

                                carnivore.mangerPoisson(proie);

                                rapport.addAction(
                                        poisson.getNom()
                                                + " (" + poisson.getType() + ") mange "
                                                + proie.getNom()
                                                + " (" + proie.getType() + ")");

                                if (proie.getPv() <= 0) {

                                    rapport.addMort(
                                            proie.getNom()
                                                    + " (" + proie.getType() + ") est mangé");

                                    poissons.remove(proie);
                                }
                            }
                        }

                    }

                    // Herbivore
                    else if (poisson instanceof PoissonHerbivore herbivore) {

                        if (!algues.isEmpty()) {

                            Algue algue = algues.get(rand.nextInt(algues.size()));

                            herbivore.mangerAlgue(algue);

                            rapport.addAction(
                                    poisson.getNom()
                                            + " (" + poisson.getType() + ") mange une algue");
                        }
                    }

                } else {

                    // Reproduction
                    if (!aDejaReproduit && poissons.size() > 1) {

                        Poisson partenaire = poissons.get(rand.nextInt(poissons.size()));

                        if (poisson != partenaire
                                && poisson.getClass() == partenaire.getClass()
                                && poisson.getSexe() != partenaire.getSexe()) {

                            Sexe sexeBebe = rand.nextBoolean()
                                    ? Sexe.MALE
                                    : Sexe.FEMELLE;

                            Poisson bebe = creerBebeSimple(poisson, sexeBebe);

                            if (bebe != null) {

                                poissons.add(bebe);

                                rapport.addReproduction(
                                        poisson.getNom()
                                                + " (" + poisson.getType() + ") + "
                                                + partenaire.getNom()
                                                + " (" + partenaire.getType() + ") -> "
                                                + bebe.getNom()
                                                + " (" + bebe.getType() + ")");

                                aDejaReproduit = true;
                            }
                        }
                    }
                }
            }

            // Reproduction algues
            for (int i = 0; i < algues.size(); i++) {

                Algue a = algues.get(i);

                if (algues.size() < 50 && a.getPv() >= 10) {

                    int pv = a.getPv() / 2;

                    a.setPv(pv);

                    Algue bebe = new Algue();
                    bebe.setPv(pv);

                    algues.add(bebe);

                    rapport.addAction("Une algue se divise");
                }
            }

            // Affichage rapport
            rapport.afficher(poissons.size(), algues.size());

            // Fin de simulation
            if (poissons.size() == 1) {

                gagnant = poissons.get(0);
                over = true;
            }

            if (over) {

                System.out.println();
                System.out.println("===== FIN DE LA SIMULATION =====");
                System.out.println("Gagnant : "
                        + gagnant.getNom()
                        + " ("
                        + gagnant.getType()
                        + ")");

                break;
            }
        }
    }

    // Création d'un bébé selon l'espèce du parent
    private static Poisson creerBebeSimple(Poisson parent, Sexe sexe) {

        String nom = parent.getNom() + "Junior";

        if (parent instanceof Merou)
            return new Merou(nom, sexe);

        if (parent instanceof Bar)
            return new Bar(nom, sexe);

        if (parent instanceof Carpe)
            return new Carpe(nom, sexe);

        if (parent instanceof Sole)
            return new Sole(nom, sexe);

        if (parent instanceof Thon)
            return new Thon(nom, sexe);

        if (parent instanceof PoissonClown)
            return new PoissonClown(nom, sexe);

        return null;
    }
}