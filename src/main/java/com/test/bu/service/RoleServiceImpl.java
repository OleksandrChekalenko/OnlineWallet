package com.test.bu.service;

import com.test.bu.dao.interfaces.RoleDao;
import com.test.bu.entity.Role;
import com.test.bu.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/**
 * Created by Cagy on 10/17/2017.
 */

public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleDao roleDao;

    @Override
    public void save(Role role) {
        roleDao.save(role);

    }


    @Transactional
    public void delete(String name) {
        roleDao.delete(roleDao.getRoleByName(name));
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }
}
