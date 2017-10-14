package com.test.bu.service;

import com.test.bu.entity.Users;

import java.util.List;

public interface UsersService {

    Users getById(int id);

    Users getUserByName(String name);

    List<Users> getAll();

    void save(Users user);

    void delete(int id);

    void update(Users wallet);
}
