package com.test.bu.dao;

import com.test.bu.entity.Role;
import com.test.bu.entity.Users;

/**
 * Created by Cagy on 10/17/2017.
 */
public interface RoleDao {

    void save(Role role);

    void delete(Role role);

    Role getRoleByName(String name);
}
