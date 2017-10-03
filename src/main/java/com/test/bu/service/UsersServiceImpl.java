package com.test.bu.service;

import com.test.bu.dao.UsersDao;
import com.test.bu.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public Users getById(int id) {
        return usersDao.getUsersById(id);
    }

    @Override
    public List<Users> getAll() {
        return usersDao.getAll();
    }

    @Override
    public void save(Users wallet) {
        usersDao.save(wallet);
    }

    @Override
    public void delete(int id) {
        usersDao.delete(id);
    }

    @Override
    public void update(Users wallet) {

    }

}