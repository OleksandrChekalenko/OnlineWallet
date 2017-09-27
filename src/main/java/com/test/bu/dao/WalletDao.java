package com.test.bu.dao;

import com.test.bu.entity.Wallet;

import java.util.List;

public interface WalletDao {

    void save(Wallet wallet);

    Wallet getWalletByNumber(int number);

    Wallet update(Wallet newWallet);

    List<Wallet> getAll();

    void delete(int id);
}
