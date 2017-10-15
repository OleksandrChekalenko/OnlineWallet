package com.test.bu.service;

import com.test.bu.entity.Wallet;

import java.util.List;

public interface WalletService {

    Wallet getByNumber(long number);

    List<Wallet> getAll();

    void save(Wallet wallet);

    void delete(long number);

    void update(Wallet wallet);

    long getWalletsInDB();



    List<Long> getAllWalletNumbers();
}
