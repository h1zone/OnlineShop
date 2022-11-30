package com.solutions.OnlineShop.entity;

import javax.persistence.*; // без этого аннтоации не работают
import javax.validation.constraints.NotNull; // в чем разница с import com.sun.istack.NotNull; ?


@Entity
@Table(name = "users")

public class User {

    @Id
    // Сиквенция из базы для генерации ид_юзера
    @SequenceGenerator(name="id_user_seq", sequenceName = "did_user_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id_user;

    private String login;
    private String password;
    private Boolean is_admin;


    public User() {
    }

    // Конструкторы для dao
    public User(int id, String login, String password, boolean is_admin) {
    }

    public int getUserId() {
        return this.id_user;
    }

    public String getUserLogin() {
        return this.login;
    }

    public Boolean getAdminFlag() {
        return this.is_admin;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdminFlag(Boolean is_admin) {
        this.is_admin = is_admin;
    }

}
