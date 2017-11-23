package com.test.bu.dao.interfaces;

import com.test.bu.entity.Users;

import java.util.List;

public interface UsersDao extends IDAO<Users> {

   // void save(Users user);

    //void delete(Users entity);

    //Users update(Users user);

    List<Users> getAll();

    Users getUsersById(int id);

    Users getUserByName(String name);


}
