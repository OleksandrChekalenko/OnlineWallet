package com.test.bu.service;

import com.test.bu.entity.Wallet;

import javax.transaction.Transactional;
import java.util.List;

public interface WalletService {

    Wallet getByNumber(long number);

    List<Wallet> getAll(int user);

    void save(Wallet wallet);

    void delete(long number);

    @Transactional
    void updateDel(Wallet wallet);

    void update(Wallet wallet);

    long getWalletsInDB();

    List<Wallet> sortByNumber(List<Wallet> walletList);

    List<Wallet> sortByCurrency(List<Wallet> walletList);

    List<Wallet> sortByFunds(List<Wallet> walletList);

    List<Wallet> sortByType(List<Wallet> walletList);

    List<Long> getAllWalletNumbers();

    void transfer(long numberFrom, long numberTo, double money);

    void exchange(long numberFrom, long numberTo, double money);
}
