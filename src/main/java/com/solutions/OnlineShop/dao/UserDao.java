package com.solutions.OnlineShop.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.solutions.OnlineShop.entity.User;

// здесь методы должны называться "низким уровнем"
public class UserDao implements Dao<User> {
    @PersistenceContext
    private EntityManager entityManager;

    // Конструктор
    public UserDao() {
    }

    private List<User> users = new ArrayList<>();



    @Override
    public Optional<User> get(int id_user) {
        return Optional.ofNullable(users.get((int) id_user));
    }


    @Override
    public List<User> getAll() {
        Query query = entityManager.createQuery("SELECT e FROM Users e");
        return query.getResultList();
    }

    @Override
    public void save(User user) {
        //users.add(user);
        entityManager.merge(user);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}

