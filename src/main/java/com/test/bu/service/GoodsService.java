package com.test.bu.service;

import com.test.bu.entity.Goods;

import java.util.List;

public interface GoodsService {

    Goods getById(int id);

    List<Goods> getAll();

    void save(Goods wallet);

    void delete(int id);

    void update(Goods wallet);
}
