package com.solutions.OnlineShop.daos;

import com.solutions.OnlineShop.entity.User;
import com.solutions.OnlineShop.dao.UserDao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaoTestUser {

    @Autowired
    private UserDao userDao;

    private int id;

    @BeforeEach
    public void createUser() {
        User newUser = new User();
        newUser.setLogin("TestUser");
        newUser.setPassword("password");
        newUser.setAdminFlag(false);
        userDao.save(newUser);
        this.id=newUser.getUserId();
    }

    @Test
    public void testUser() {
        User testUser = readUser();
        updateUser(testUser);
    }


    public User readUser() {
        User readedUser = userDao.getAll().get(this.id);
        assertEquals("TestUser", readedUser.getUserLogin());

        return readedUser;
    }

    public void updateUser(User userUpd) {
        userUpd.setAdminFlag(true);
        userDao.update(userUpd);
        assertEquals(true, userUpd.getAdminFlag());
    }

    @AfterEach
    public void deleteUser() {
        User deletedDUser = userDao.getAll().get(this.id);
        userDao.delete(deletedDUser);
        assertEquals(0, userDao.getAll().size());
    }
}
