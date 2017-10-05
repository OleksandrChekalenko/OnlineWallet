package com.test.bu.dao;

import com.test.bu.entity.Users;

import java.util.List;

public interface UsersDao {

    void save(Users user);

    Users getUsersById(int id);

    Users update(Users newUsers);

    List<Users> getAll();

    void delete(Users entity);
}
