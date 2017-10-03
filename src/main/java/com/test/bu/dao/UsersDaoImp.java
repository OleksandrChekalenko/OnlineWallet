package com.test.bu.dao;

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
    public void save(Users users) {
        entityManager.persist(users);
    }

    @Override
    public Users getUsersById(int id) {
        return entityManager.createQuery("SELECT u FROM Users u WHERE id=:id", Users.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Users update(Users newUsers) {
        return null;
    }

    @Override
    public List<Users> getAll() {
        return entityManager.createQuery("SELECT g FROM Users g", Users.class).getResultList();
    }

    @Override
    public void delete(int id) {
        entityManager.remove(id);
    }
    /*@Override
    public void delete(Wallet walletByNumber) {
        entityManager.remove(walletByNumber);
    }*/
}
