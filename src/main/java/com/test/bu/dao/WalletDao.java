package com.test.bu.dao;

import com.test.bu.entity.Wallet;

import java.util.List;

public interface WalletDao {

    void save(Wallet wallet);

    Wallet getWalletByNumber(long number);

    Wallet update(Wallet newWallet);

    List<Wallet> getAll();

   // void delete(int number);

    void delete(int walletByNumber);

    long getWalletsInDB();
}
