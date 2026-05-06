package fr.adrien.poissons;

import fr.adrien.alimentations.PoissonCarnivore;
import fr.adrien.enums.Sexe;
import fr.adrien.reproduction.HermaphroditeAge;

public class Merou extends PoissonCarnivore {

    public Merou(String nom, Sexe sexe) {
        super(nom, sexe, new HermaphroditeAge());
    }
}