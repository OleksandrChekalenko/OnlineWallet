package com.test.bu.service;

import com.test.bu.dao.WalletDao;
import com.test.bu.entity.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletDao walletDao;

    @Override
    public Wallet getByNumber(int number) {
        return walletDao.getWalletByNumber(number);
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
    @Transactional
    public void delete(int number) {
        walletDao.delete(number);
    }

    /*  @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(userDao.getById(id));
    }*/

    @Override
    public void update(Wallet wallet) {
        walletDao.update(wallet);
    }


}
