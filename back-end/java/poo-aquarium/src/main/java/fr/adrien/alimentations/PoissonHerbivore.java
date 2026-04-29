package fr.adrien.alimentations;

import fr.adrien.Algue;
import fr.adrien.Poisson;
import fr.adrien.enums.Sexe;

public abstract class PoissonHerbivore extends Poisson implements Herbivore{

    public PoissonHerbivore(String nom, Sexe sexe) {
        super(nom, sexe);
        //TODO Auto-generated constructor stub
    }

    public void mangerAlgue(Algue algueProie) {
        System.out.println("predateur " + this.getNom() + " à mangé une algue");
    }
    
}
