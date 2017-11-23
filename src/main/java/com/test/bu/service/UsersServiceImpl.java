package com.test.bu.service;

import com.test.bu.dao.interfaces.UsersDao;
import com.test.bu.entity.Users;
import com.test.bu.service.interfaces.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Comparator;
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
    public Users getUserByName(String name) {
        return usersDao.getUserByName(name);
    }

    @Override
    public List<Users> getAll() {
        return usersDao.getAll();
    }

    @Override
    public void save(Users user) {
        usersDao.save(user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        usersDao.delete(usersDao.getUsersById(id));
    }

    @Override
    public void update(Users user) {
        usersDao.update(user);

    }

    @Override
    public List<Users> sortUsersById(List<Users> usersList) {
        Collections.sort(usersList, new Comparator<Users>() {
            @Override
            public int compare(Users o1, Users o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                }
                return 0;
            }
        });
        return usersList;
    }

    @Override
    public List<Users> sortUsersByName(List<Users> usersList) {
        Collections.sort(usersList, new Comparator<Users>() {
            @Override
            public int compare(Users o1, Users o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return usersList;
    }

    @Override
    public List<Users> sortUsersByFirstName(List<Users> usersList) {
        Collections.sort(usersList, new Comparator<Users>() {
            @Override
            public int compare(Users o1, Users o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return usersList;
    }

    @Override
    public List<Users> sortUsersByEmail(List<Users> usersList) {
        Collections.sort(usersList, new Comparator<Users>() {
            @Override
            public int compare(Users o1, Users o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return usersList;
    }
}
