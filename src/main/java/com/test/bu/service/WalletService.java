package com.test.bu.service;

import com.test.bu.entity.Wallet;

import java.util.List;

public interface WalletService {

    Wallet getById(int id);

    List<Wallet> getAll();

    void save(Wallet wallet);

    void delete(int id);

    void update(Wallet wallet);
}
