package com.test.bu.dao;

import com.test.bu.entity.Wallet;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
    public Wallet getWalletByNumber(int number) {
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
    public List<Wallet> getAll() {
        return entityManager.createQuery("SELECT w FROM Wallet w", Wallet.class).getResultList();
    }

    /*@Override
    public void delete(int number) {
        entityManager.remove(number);
    }*/

    @Override
    public void delete(Wallet walletByNumber) {
        entityManager.remove(walletByNumber);
    }


}
