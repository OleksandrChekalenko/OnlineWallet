package com.test.bu.service;

import com.test.bu.dao.WalletDao;
import com.test.bu.entity.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletDao walletDao;

    @Override
    public Wallet getById(int id) {
        return walletDao.getWalletByNumber(id);
    }

    @Override
    public List<Wallet> getAll() {
        return walletDao.getAll();
    }

    @Override
    public void save(Wallet wallet) {
        walletDao.save(wallet);
    }

    @Override
    public void delete(int id) {
        walletDao.delete(id);
    }

    @Override
    public void update(Wallet wallet) {
        walletDao.update(wallet);
    }


}
