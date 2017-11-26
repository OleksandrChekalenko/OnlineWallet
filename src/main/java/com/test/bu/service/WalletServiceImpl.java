package com.test.bu.service;

import com.test.bu.dao.interfaces.WalletDao;
import com.test.bu.entity.Wallet;
import com.test.bu.service.interfaces.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletDao walletDao;

    @Override
    public Wallet getByNumber(long number) {
        return walletDao.getWalletByNumber(number);
    }

    @Override
    public List<Wallet> getAll(int user) {
        return walletDao.getAll(user);
    }

    @Override
    public void save(Wallet wallet) {
        walletDao.save(wallet);
    }

    @Override
    @Transactional
    public void delete(long number) {
        walletDao.delete(number);
    }

    @Override
    public List<Wallet> sortByNumber(List<Wallet> walletList) {
        Collections.sort(walletList, new Comparator<Wallet>() {
            @Override
            public int compare(Wallet o1, Wallet o2) {
                if (o1.getNumber() > o2.getNumber()) {
                    return 1;
                } else if (o1.getNumber() < o2.getNumber()) {
                    return -1;
                }
                return 0;
            }
        });
        return walletList;
    }

    @Override
    public List<Wallet> sortByCurrency(List<Wallet> walletList) {
        Collections.sort(walletList, new Comparator<Wallet>() {
            @Override
            public int compare(Wallet o1, Wallet o2) {
                return o1.getWalletCurrency().compareTo(o2.getWalletCurrency());
            }
        });
        return walletList;
    }

    @Override
    public List<Wallet> sortByFunds(List<Wallet> walletList) {
        Collections.sort(walletList, new Comparator<Wallet>() {
            @Override
            public int compare(Wallet o1, Wallet o2) {
                if (o1.getFunds() > o2.getFunds()) {
                    return 1;
                } else if (o1.getFunds() < o2.getFunds()) {
                    return -1;
                }
                return 0;
            }
        });
        return walletList;
    }

    @Override
    public List<Wallet> sortByType(List<Wallet> walletList) {
        Collections.sort(walletList, new Comparator<Wallet>() {
            @Override
            public int compare(Wallet o1, Wallet o2) {
                return o1.getType().compareTo(o2.getType());
            }
        });
        return walletList;
    }

    @Override
    @Transactional
    public void updateDel(Wallet wallet) {
        Wallet wallet1 = walletDao.getWalletByNumber(wallet.getNumber());
        wallet1.setFunds(wallet.getFunds());
        walletDao.update(wallet1);
    }

    @Override
    @Transactional
    public void update(Wallet wallet) {
        walletDao.update(wallet);
    }

    @Override
    public long getWalletsInDB() {
        return walletDao.getWalletsInDB();
    }

    @Override
    public List<Long> getAllWalletNumbers() {
        return walletDao.getAllWalletNumbers();
    }

    @Override
    @Transactional
    public void transfer(long numberFrom, long numberTo, double money) {
        /*Wallet fromWallet = walletDao.getWalletByNumber(numberFrom);
        Wallet toWallet = walletDao.getWalletByNumber(numberTo);
        fromWallet.setFunds(fromWallet.getFunds() - money);
        update(fromWallet);
        toWallet.setFunds(toWallet.getFunds() + money);
        update(toWallet);*/
        exchange(numberFrom, numberTo, money);
    }

    @Override
    public void exchange(long numberFrom, long numberTo, double money) {
        Wallet fromWallet = walletDao.getWalletByNumber(numberFrom);
        Wallet toWallet = walletDao.getWalletByNumber(numberTo);

        fromWallet.setFunds(fromWallet.getFunds() - money);
        switch (fromWallet.getWalletCurrency()) {
            case "USD":
                switch (toWallet.getWalletCurrency()) {
                    case "UAH": toWallet.setFunds(toWallet.getFunds() + (money * 27)); break;
                    case "EUR": toWallet.setFunds(toWallet.getFunds() + (money * 1.12)); break;
                    case "USD": toWallet.setFunds(toWallet.getFunds());break;
                }
            case "UAH":
                switch (toWallet.getWalletCurrency()) {
                    case "UAH": toWallet.setFunds(toWallet.getFunds());break;
                    case "EUR": toWallet.setFunds(toWallet.getFunds() + (money / 30.24));break;
                    case "USD": toWallet.setFunds(toWallet.getFunds() + (money / 27));break;
                }
            case "EUR":
                switch (toWallet.getWalletCurrency()) {
                    case "UAH": toWallet.setFunds(toWallet.getFunds() + (money * 30.24));break;
                    case "EUR": toWallet.setFunds(toWallet.getFunds());break;
                    case "USD": toWallet.setFunds(toWallet.getFunds() + (money * 1.12));break;
                }

        }
        update(fromWallet);
        update(toWallet);

                       /* if (fromWallet.getWalletCurrency().equals("USD") && toWallet.getWalletCurrency().equals("UAH")) {
                            fromWallet.setFunds(fromWallet.getFunds() - money);
                            toWallet.setFunds(toWallet.getFunds() + (money * 27));
                            update(fromWallet);
                            update(toWallet);
                        }
                        if (fromWallet.getWalletCurrency().equals("USD") && toWallet.getWalletCurrency().equals("EUR")) {

                            fromWallet.setFunds(fromWallet.getFunds() - money);
                            toWallet.setFunds(toWallet.getFunds() + (money * 1.12));
                            update(fromWallet);
                            update(toWallet);
                        }
                        if (fromWallet.getWalletCurrency().equals("UAH") && toWallet.getWalletCurrency().equals("EUR")) {
                            fromWallet.setFunds(fromWallet.getFunds() - money);
                            toWallet.setFunds(toWallet.getFunds() + (money / 30.24));
                            update(fromWallet);
                            update(toWallet);
                        }
                        if (fromWallet.getWalletCurrency().equals("UAH") && toWallet.getWalletCurrency().equals("USD")) {
                            fromWallet.setFunds(fromWallet.getFunds() - money);
                            toWallet.setFunds(toWallet.getFunds() + (money / 27));
                            update(fromWallet);
                            update(toWallet);
                        }
                        if (fromWallet.getWalletCurrency().equals("EUR") && toWallet.getWalletCurrency().equals("UAH")) {
                            fromWallet.setFunds(fromWallet.getFunds() - money);
                            toWallet.setFunds(toWallet.getFunds() + (money * 30.24));
                            update(fromWallet);
                            update(toWallet);
                        }
                        if (fromWallet.getWalletCurrency().equals("EUR") && toWallet.getWalletCurrency() == "USD") {
                            fromWallet.setFunds(fromWallet.getFunds() - money);
                            toWallet.setFunds(toWallet.getFunds() + (money * 1.12));
                            update(fromWallet);
                            update(toWallet);
                        }*/
        }
    }



