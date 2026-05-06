package fr.adrien.reproduction;

import fr.adrien.Poisson;

public interface ReproductionStrategie {

    void majSexeSelonAge(Poisson poisson);
    
    boolean peutSeReproduireAvec(Poisson p1, Poisson p2);
}