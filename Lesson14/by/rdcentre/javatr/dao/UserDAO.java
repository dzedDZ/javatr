package Lesson14.by.rdcentre.javatr.dao;

import Lesson14.by.rdcentre.javatr.bean.User;

import java.util.ArrayList;

/**
 * Created by Denis on 10.04.2017.
 */
public interface UserDAO {
    void signIn(String login, String password);
    void registration(String login, String password);

    ArrayList getUser();
    ArrayList getUser(User user);
}
