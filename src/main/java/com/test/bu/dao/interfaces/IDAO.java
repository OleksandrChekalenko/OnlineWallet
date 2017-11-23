package com.test.bu.dao.interfaces;

/**
 * Created by Cagy on 11/23/2017.
 */
public interface IDAO<T> {

    void save(T entity);

    void delete(T entity);

    T update(T entity);
}
/*public interface IDAO<T> {

    void save(T entity);

    T getById(int id);

    Collection<T> getAll();

    void update(T entity);

    void delete(T entity);
}
*/