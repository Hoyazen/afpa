package fr.afpa.restapi.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import fr.afpa.restapi.dao.AccountDao;
import fr.afpa.restapi.model.Account;

/**
 * Une implémentation de {@link AccountDao} basée sur un
 * {@link java.util.HashMap}
 */
@Repository
public class InMemoryAccountDao implements AccountDao {

    /**
     * Table de hachage permettant de stocker les objets de {@link Account}
     */
    private Map<Long, Account> accountMap = new HashMap<>();

    private long idSequence = 1L;

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accountMap.values());
    }

    @Override
    public Optional<Account> findById(long id) {
        return Optional.ofNullable(accountMap.get(id));
    }

    @Override
    public Account save(Account account) {

        if (account.getId() == null) {
            account.setId(idSequence++);
        }

        accountMap.put(account.getId(), account);

        return account;
    }

    @Override
    public void delete(Account account) {
        accountMap.remove(account.getId());
    }

    public void clear() {
        accountMap.clear();
        idSequence = 1L;
    }
}