package com.javase.network.client;

import java.io.Serializable;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class UserDemo implements Serializable {
    private static final long serialVersionUID = -9107261979248011079L;
    private String username;
    private String password;

    public UserDemo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserDemo() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDemo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
