package fr.afpa.restapi.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;

import fr.afpa.restapi.dao.AccountDao;
import fr.afpa.restapi.model.Account;

@RestController
@RequestMapping("/accounts")
public class AccountRestController {

    private AccountDao accountDao;

    public AccountRestController(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @GetMapping
    public List<Account> getAccounts() {
        return accountDao.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccount(@PathVariable long id) {
        return accountDao.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account account) {
        return accountDao.save(account);
    }

    @PutMapping
    public Account updateAccount(@RequestBody Account account) {
        return accountDao.save(account);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAccount(@PathVariable long id) {

        Optional<Account> account = accountDao.findById(id);

        if (account.isPresent()) {
            accountDao.delete(account.get());
        }
    }
}