package com.test.bu.dao.interfaces;

import com.test.bu.entity.Wallet;

import java.security.Principal;
import java.util.List;

public interface WalletDao extends IDAO<Wallet> {

    //void save(Wallet wallet);

   // Wallet update(Wallet newWallet);

    void delete(long walletByNumber);

    Wallet getWalletByNumber(long number);

    List<Wallet> getAll(int user);

    long getWalletsInDB();

    List<Long> getAllWalletNumbers();
}
