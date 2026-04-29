package fr.adrien;

// je met abstract pour ne pas pouvoir créer un nouvel objet à partir de EtreVivant
public abstract class EtreVivant {
    private int pv;
    private int age;
    
    public EtreVivant(int pv, int age) {
        this.pv = pv;
        this.age = age;
    }

    public void incrementAge() {
        
    }
}
