package com.test.bu.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "WALLET")
public class Wallet {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private long number;
    private String type;
    private String walletCurrency;

    /*@OneToMany(fetch = FetchType.EAGER)
    private List<Users> usersList;*/

    public Wallet() {
    }

    public String getWalletCurrency() {
        return walletCurrency;
    }

    public void setWalletCurrency(String walletCurrency) {
        this.walletCurrency = walletCurrency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getType() {        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }*/

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Wallet{");
        sb.append("id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
