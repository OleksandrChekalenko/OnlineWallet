package com.test.bu.service;

import com.test.bu.dao.WalletDao;
import com.test.bu.entity.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletDao walletDao;

    @Override
    public Wallet getByNumber(long number) {
        return walletDao.getWalletByNumber(number);
    }

    @Override
    public List<Wallet> getAll(int user) {
        return walletDao.getAll(user);
    }

    @Override
    public void save(Wallet wallet) {
        walletDao.save(wallet);
    }

    @Override
    @Transactional
    public void delete(long number) {
        walletDao.delete(Math.toIntExact(number));
    }

    /*  @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(userDao.getById(id));
    }*/

    @Override
    @Transactional
    public void update(Wallet wallet) {
        Wallet wallet1 = walletDao.getWalletByNumber(wallet.getNumber());
        wallet1.setFunds(wallet.getFunds());
        walletDao.update(wallet1);
    }

    @Override
    public long getWalletsInDB() {
        return walletDao.getWalletsInDB();
    }

    @Override
    public List<Long> getAllWalletNumbers() {
        return walletDao.getAllWalletNumbers();
    }

    @Override
    @Transactional
    public void transfer(long numberFrom, long numberTo, double money) {
        Wallet fromWallet = walletDao.getWalletByNumber(numberFrom);
        Wallet toWallet = walletDao.getWalletByNumber(numberTo);
        fromWallet.setFunds(fromWallet.getFunds() - money);
        update(fromWallet);
        toWallet.setFunds(toWallet.getFunds() + money);
        update(toWallet);
    }
}
