package fr.adrien;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import fr.adrien.poissons.Bar;
import fr.adrien.poissons.Carpe;
import fr.adrien.poissons.Merou;
import fr.adrien.poissons.PoissonClown;
import fr.adrien.poissons.Sole;
import fr.adrien.poissons.Thon;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")

@JsonSubTypes({

        @JsonSubTypes.Type(value = Thon.class, name = "thon"),

        @JsonSubTypes.Type(value = Carpe.class, name = "carpe"),

        @JsonSubTypes.Type(value = Merou.class, name = "merou"),

        @JsonSubTypes.Type(value = Bar.class, name = "bar"),

        @JsonSubTypes.Type(value = Sole.class, name = "sole"),

        @JsonSubTypes.Type(value = PoissonClown.class, name = "clown")

})

public class PoissonData {

    private String nom;
    private String race;
    private String sexe;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}