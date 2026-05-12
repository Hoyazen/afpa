package fr.adrien;

import java.util.List;

public class AquariumData {

    private List<PoissonData> poissons;
    private List<AlgueData> algues;

    public List<PoissonData> getPoissons() {
        return poissons;
    }

    public void setPoissons(List<PoissonData> poissons) {
        this.poissons = poissons;
    }

    public List<AlgueData> getAlgues() {
        return algues;
    }

    public void setAlgues(List<AlgueData> algues) {
        this.algues = algues;
    }
}