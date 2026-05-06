package fr.adrien.poissons;

import fr.adrien.alimentations.PoissonCarnivore;
import fr.adrien.enums.Sexe;
import fr.adrien.reproduction.HermaphroditeOpportuniste;

public class PoissonClown extends PoissonCarnivore {

    public PoissonClown(String nom, Sexe sexe) {
        super(nom, sexe, new HermaphroditeOpportuniste());
    }
}