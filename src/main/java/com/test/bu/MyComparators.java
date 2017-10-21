package com.test.bu;

import com.test.bu.entity.Wallet;
import java.util.Comparator;


public class MyComparators {



    class CurrencyComparator implements Comparator<Wallet> {
        @Override
        public int compare(Wallet o1, Wallet o2) {
            return o1.getWalletCurrency().compareTo(o2.getWalletCurrency());
        }
    }

    /*class NumberComparator implements Comparator<Wallet> {

        @Override
        public int compare(Wallet o1, Wallet o2) {
            if (o1.getNumber() > o2.getNumber()) {
                return 1;
            } else if (o1.getNumber() < o2.getNumber()) {
                return -1;
            }
            return 0;
        }
    }*/

    /*class FoundsComparator implements Comparator<Wallet> {
        @Override
        public int compare(Wallet o1, Wallet o2) {
            if (o1.getFunds() > o2.getFunds()) {
                return 1;
            }else if (o1.getFunds() < o2.getFunds()) {
                return -1;
            }
            return 0;
        }
    }*/
    class TypeVisaComparator implements Comparator<Wallet> {
        @Override
        public int compare(Wallet o1, Wallet o2) {
            /*if (o1.getType().equals("VISA")) {
                return 1;
            } else if (o1.getType().equals("MASTER CARD")) {
                return -1;
            }

            return 0;*/
            return o1.getType().compareTo(o2.getType());
        }
    }
}
/* return o1.getWalletCurrency().compareTo(o2.getWalletCurrency());*/