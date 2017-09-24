package com.test.bu.service;

import com.test.bu.dao.GoodsDao;
import com.test.bu.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods getById(int id) {
        return goodsDao.getGoodsById(id);
    }

    @Override
    public List<Goods> getAll() {
        return goodsDao.getAll();
    }

    @Override
    public void save(Goods wallet) {
        goodsDao.save(wallet);
    }

    @Override
    public void delete(int id) {
        goodsDao.delete(id);
    }

    @Override
    public void update(Goods wallet) {

    }

}
