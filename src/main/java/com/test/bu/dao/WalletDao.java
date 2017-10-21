package com.test.bu.dao;

import com.test.bu.entity.Wallet;

import java.security.Principal;
import java.util.List;

public interface WalletDao {

    void save(Wallet wallet);

    Wallet getWalletByNumber(long number);

    Wallet update(Wallet newWallet);

    List<Wallet> getAll(int user);

   // void delete(int number);

    void delete(long walletByNumber);

    long getWalletsInDB();

    List<Long> getAllWalletNumbers();
}
