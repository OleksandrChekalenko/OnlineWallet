package com.test.bu.service.interfaces;

import com.test.bu.entity.Role;
import com.test.bu.entity.Users;

/**
 * Created by Cagy on 10/17/2017.
 */
public interface RoleService extends IService<Role>{

    //void save(Role role);

    void delete(String name);

    Role getRoleByName(String name);
}
