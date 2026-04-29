package fr.adrien;

import java.util.ArrayList;

import fr.adrien.enums.Sexe;
import fr.adrien.poissons.Carpe;
import fr.adrien.poissons.Merou;
import fr.adrien.poissons.Sole;
import fr.adrien.poissons.Thon;

public class Aquarium {
    public static void main(String[] args) {
        ArrayList<Poisson> poissons = new ArrayList<>();
        ArrayList<Algue> algues = new ArrayList<>();

        for(int x = 0; x < 10; x++) {
            Algue algue = new Algue();
            algues.add(algue);
        }

        Merou merou1 = new Merou("Josua", Sexe.FEMELLE);
        Carpe carpe1 = new Carpe("Adrien", Sexe.MALE);
        Sole sole1 = new Sole("Ludovic", Sexe.MALE);
        Thon thon1 = new Thon("Bobette", Sexe.FEMELLE);

        poissons.add(merou1);
        poissons.add(carpe1);
        poissons.add(sole1);
        poissons.add(thon1);

        for(int i = 0; i < 10; i++) {
            System.out.println("test boucle");
        }
    }
}
