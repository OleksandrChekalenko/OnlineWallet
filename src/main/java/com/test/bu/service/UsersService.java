package com.test.bu.service;

import com.test.bu.entity.Users;

import java.util.List;

public interface UsersService {

    Users getById(int id);

    List<Users> getAll();

    void save(Users wallet);

    void delete(int id);

    void update(Users wallet);
}
