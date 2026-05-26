package fr.afpa.restapi.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.afpa.restapi.dao.AccountDao;
import fr.afpa.restapi.model.Account;

/**
 * TODO ajouter la/les annotations nécessaires pour faire de
 * "AccountRestController" un contrôleur de REST API
 */
@RestController
@RequestMapping("/accounts")
public class AccountRestController {

    private final AccountDao accountDao;

    /**
     * TODO implémenter un constructeur
     *
     * TODO injecter {@link AccountDao} en dépendance par injection via
     * constructeur
     */
    public AccountRestController(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * TODO implémenter une méthode qui traite les requêtes GET et qui renvoie
     * une liste de comptes
     */
    @GetMapping
    public List<Account> getAccounts() {
        return accountDao.findAll();
    }

    /**
     * TODO implémenter une méthode qui traite les requêtes GET avec un
     * identifiant "variable de chemin"
     */
    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable long id) {

        Optional<Account> optionalAccount = accountDao.findById(id);

        if (optionalAccount.isPresent()) {
            return ResponseEntity.ok(optionalAccount.get());
        }

        return ResponseEntity.notFound().build();
    }

    /**
     * TODO implémenter une méthode qui traite les requêtes POST
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account account) {

        return accountDao.save(account);
    }

    /**
     * TODO implémenter une méthode qui traite les requêtes PUT
     */
    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(
            @PathVariable long id,
            @RequestBody Account account) {

        Optional<Account> optionalAccount = accountDao.findById(id);

        if (optionalAccount.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Account existingAccount = optionalAccount.get();

        existingAccount.setFirstName(account.getFirstName());
        existingAccount.setLastName(account.getLastName());
        existingAccount.setEmail(account.getEmail());
        existingAccount.setBirthday(account.getBirthday());
        existingAccount.setBalance(account.getBalance());

        Account updatedAccount = accountDao.save(existingAccount);

        return ResponseEntity.ok(updatedAccount);
    }

    /**
     * TODO implémenter une méthode qui traite les requêtes DELETE
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAccount(@PathVariable long id) {

        Optional<Account> optionalAccount = accountDao.findById(id);

        optionalAccount.ifPresent(accountDao::delete);
    }
}