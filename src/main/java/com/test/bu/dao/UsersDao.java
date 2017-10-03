package com.test.bu.dao;

import com.test.bu.entity.Users;

import java.util.List;

public interface UsersDao {

    void save(Users users);

    Users getUsersById(int id);

    Users update(Users newUsers);

    List<Users> getAll();

    void delete(int id);
}
