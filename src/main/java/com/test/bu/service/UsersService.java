package com.test.bu.service;

import com.test.bu.entity.Users;

import java.util.List;

public interface UsersService {

    Users getById(int id);

    Users getUserByName(String name);

    List<Users> getAll();

    List<Users> sortUsersById(List<Users> usersList);
    List<Users> sortUsersByName(List<Users> usersList);
    List<Users> sortUsersByFirstName(List<Users> usersList);
    List<Users> sortUsersByEmail(List<Users> usersList);

    void save(Users user);

    void delete(int id);

    void update(Users user);
}
