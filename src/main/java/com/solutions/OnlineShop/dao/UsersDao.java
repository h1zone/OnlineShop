package com.solutions.OnlineShop.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.solutions.OnlineShop.entity.Users;

public class UsersDao implements Dao<Users> {

    private List<Users> users = new ArrayList<>();

    public UsersDao() {
        users.add(new Users(1,"User1", "pass1",false));
        users.add(new Users(1,"User2", "pass2",false));
    }



    @Override
    public Optional<Users> get(int id_user) {
        return Optional.ofNullable(users.get((int) id_user));
    }

    @Override
    public List<Users> getAll() {
        return users;
    }

    @Override
    public void save(Users user) {
        users.add(user);
    }

    @Override
    public void update(Users user, String[] params) {
        user.setLogin(Objects.requireNonNull(
                params[0], "Login cannot be null"));
        user.setPassword(Objects.requireNonNull(
                params[1], "Password cannot be null"));

        users.add(user);
    }

    @Override
    public void delete(Users user) {
        users.remove(user);
    }
}

