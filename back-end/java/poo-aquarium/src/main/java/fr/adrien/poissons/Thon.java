package fr.adrien.poissons;

import fr.adrien.alimentations.PoissonCarnivore;
import fr.adrien.enums.Sexe;
import fr.adrien.reproduction.Monosexue;

public class Thon extends PoissonCarnivore {

    public Thon(String nom, Sexe sexe) {
        super(nom, sexe, new Monosexue());
    }
}