package com.test.bu.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String firstName;
    private String phoneNumber;
    @OneToMany(fetch = FetchType.EAGER, targetEntity = Wallet.class)
    @JoinColumn(name = "user_id")
    private List<Wallet> walletsList;

    public Users() {
    }

    public Users(String name, String firstName, String phoneNumber) {
        this.name = name;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public List<Wallet> getWalletsList() {
        return walletsList;
    }

    public void setWalletsList(List<Wallet> walletsList) {
        this.walletsList = walletsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Users{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
