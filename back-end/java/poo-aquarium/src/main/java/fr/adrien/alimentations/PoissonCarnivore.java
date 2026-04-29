package fr.adrien.alimentations;

import fr.adrien.Poisson;
import fr.adrien.enums.Sexe;

public abstract class PoissonCarnivore extends Poisson implements Carnivore {

    public PoissonCarnivore(String nom, Sexe sexe) {
        super(nom, sexe);
        //TODO Auto-generated constructor stub
    }

    public void mangerPoisson(Poisson poissonProie) {
        System.out.println("predateur " + this.getNom() + " à mangé " + poissonProie.getNom());
    }

}
