package fr.adrien;

import java.io.File;

import fr.adrien.entities.Personne;
import tools.jackson.databind.ObjectMapper;

public class Application {

    public static void main(String[] args) {
        // With default settings can use
        ObjectMapper mapper = new ObjectMapper(); // create once, reuse

        Personne personne = new Personne("Adrien", 24);

        String jsonString = mapper.writeValueAsString(personne);

        System.out.println(jsonString);

        Personne p1 = mapper.readValue(jsonString, Personne.class);

        System.out.println(p1);

        File file = new File("personne.json");

        mapper.writeValue(file, personne);
    }
}
