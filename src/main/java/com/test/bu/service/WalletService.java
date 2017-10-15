package com.test.bu.service;

import com.test.bu.entity.Wallet;

import java.security.Principal;
import java.util.List;

public interface WalletService {

    Wallet getByNumber(long number);

    List<Wallet> getAll(int user);

    void save(Wallet wallet);

    void delete(long number);

    void update(Wallet wallet);

    long getWalletsInDB();



    List<Long> getAllWalletNumbers();
}
