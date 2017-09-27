package com.test.bu.service;

import com.test.bu.entity.Wallet;

import java.util.List;

public interface WalletService {

    Wallet getByNumber(int number);

    List<Wallet> getAll();

    void save(Wallet wallet);

    void delete(int number);

    void update(Wallet wallet);
}
