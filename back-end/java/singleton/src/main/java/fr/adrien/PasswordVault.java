package fr.adrien;

import java.util.HashMap;
import java.util.Map;

public class PasswordVault {

    private static PasswordVault instance;
    private Map<String, String> passwords;

    private PasswordVault() {
        passwords = new HashMap<>();
    }

    public static PasswordVault getInstance() {
        if (instance == null) {
            instance = new PasswordVault();
        }
        return instance;
    }

    public void addPassword(String service, String password) {
        passwords.put(service, password);
    }

    public String getPassword(String service) {
        return passwords.get(service);
    }
}