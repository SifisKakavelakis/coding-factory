package gr.aueb.cf.cf9.ch18.bankapp.dao;

import gr.aueb.cf.cf9.ch18.bankapp.model.Account;

import java.util.*;

public class AccountDAOImpl implements IAccountDAO {
    private final List<Account> accounts = new ArrayList<>();

    @Override
    public Account saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);      // equals

        if (index == -1) {              // Αν δεν υπαρχει στην λιστα
            accounts.add(account);       // τοτε κανε insert
            return account;
        }

        // Αν υπαρχει ηδη το Account
        accounts.set(index, account);       // τοτε κανε update
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));
    }

    @Override
    public Optional<Account> findByIban(String iban) {
        return accounts.stream()
                .filter(account -> account.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> findAllAccount() {
//        return new ArrayList<>(accounts);
        return Collections.unmodifiableList(accounts);
//        return List.copyOf(accounts);
    }

    @Override
    public boolean isAccountExist(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }
}
