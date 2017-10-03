package com.test.bu.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "WALLET")
public class Wallet {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name = "NUMBER")
    private Integer number;
    @Column(name = "TYPE")
    private String type;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Goods> goodsList;

    public Wallet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getType() {        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Wallet{");
        sb.append("id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", type='").append(type).append('\'');
        sb.append(", goodsList=").append(goodsList);
        sb.append('}');
        return sb.toString();
    }
}
