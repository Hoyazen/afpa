package fr.adrien.reproduction;

import fr.adrien.Poisson;

public class Monosexue implements ReproductionStrategie {

    @Override
    public void majSexeSelonAge(Poisson poisson) {
        // ne change jamais
    }

    @Override
    public boolean peutSeReproduireAvec(Poisson p1, Poisson p2) {
        return p1.getSexe() != p2.getSexe();
    }
} 