package fr.adrien.poissons;

import fr.adrien.alimentations.PoissonHerbivore;
import fr.adrien.enums.Sexe;
import fr.adrien.reproduction.HermaphroditeOpportuniste;

public class Sole extends PoissonHerbivore {

    public Sole(String nom, Sexe sexe) {
        super(nom, sexe, new HermaphroditeOpportuniste());
    }
}