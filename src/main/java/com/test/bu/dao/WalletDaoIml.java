package com.test.bu.dao;

import com.test.bu.entity.Wallet;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.security.Principal;
import java.util.List;
public class WalletDaoIml implements WalletDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(Wallet wallet) {
        entityManager.persist(wallet);
    }

    @Override
    public Wallet getWalletByNumber(long number) {
        return entityManager.createQuery("SELECT w FROM Wallet w WHERE NUMBER=:NUMBER", Wallet.class)
                .setParameter("NUMBER", number)
                .getSingleResult();
    }

    @Override
    @Transactional
    public Wallet update(Wallet newWallet) {
        return entityManager.merge(newWallet);
    }

    @Override
    public List<Wallet> getAll(int user) {

        return entityManager.createQuery("SELECT w FROM Wallet w WHERE user=:user", Wallet.class)
                .setParameter("user", user)
                .getResultList();
    }

    @Override
    public void delete(int walletByNumber) {

        entityManager.remove(getWalletByNumber(walletByNumber));
    }


    @Override
    public long getWalletsInDB() {
        return (long) entityManager.createQuery("SELECT count(id) FROM Wallet").getSingleResult();
    }

    @Override
    public List<Long> getAllWalletNumbers() {
        return entityManager.createQuery("SELECT (number) FROM Wallet").getResultList();
    }
}

