package fr.adrien.poissons;

import fr.adrien.alimentations.PoissonHerbivore;
import fr.adrien.enums.Sexe;
import fr.adrien.reproduction.Monosexue;

public class Carpe extends PoissonHerbivore {

    public Carpe(String nom, Sexe sexe) {
        super(nom, sexe, new Monosexue());
    }
}