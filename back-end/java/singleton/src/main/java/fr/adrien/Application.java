package fr.adrien;

public class Application {

    public static void main(String[] args) {

        PasswordVault vault1 = PasswordVault.getInstance();
        PasswordVault vault2 = PasswordVault.getInstance();

        vault1.addPassword("gmail", "1234");

        System.out.println(vault2.getPassword("gmail"));

        System.out.println(vault1 == vault2); // doit afficher true

        System.out.println("Mot de passe gmail : " + vault2.getPassword("gmail"));
        
        System.out.println("Singleton OK ? " + (vault1 == vault2));
    }
}