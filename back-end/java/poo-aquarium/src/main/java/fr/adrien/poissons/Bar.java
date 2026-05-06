package fr.adrien.poissons;

import fr.adrien.alimentations.PoissonHerbivore;
import fr.adrien.enums.Sexe;
import fr.adrien.reproduction.HermaphroditeAge;

public class Bar extends PoissonHerbivore {

    public Bar(String nom, Sexe sexe) {
        super(nom, sexe, new HermaphroditeAge());
    }
}