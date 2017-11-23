package com.test.bu.dao;

import com.test.bu.dao.interfaces.UsersDao;
import com.test.bu.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class UsersDaoImp implements UsersDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(Users user) {
        entityManager.persist(user);
    }

    @Override
    public Users getUsersById(int id) {
        return entityManager.createQuery("SELECT u FROM Users u WHERE id=:id", Users.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Users getUserByName(String name) {
        return entityManager.createQuery("SELECT u FROM Users u WHERE name =:name", Users.class)
                .setParameter("name", name).getSingleResult();
    }

    @Override
    @Transactional
    public Users update(Users newUsers) {

        return entityManager.merge(newUsers);
    }

    @Override
    public List<Users> getAll() {
        return entityManager.createQuery("SELECT u FROM Users u", Users.class).getResultList();
    }

    @Override
    public void delete(Users users) {
        entityManager.remove(users);
    }



}
