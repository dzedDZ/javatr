package Lesson14.by.rdcentre.javatr.dao;

import Lesson14.by.rdcentre.javatr.bean.User;

/**
 * Created by Denis on 10.04.2017.
 */
public interface UserDAO {
    void signIn(String login, String password);
    void registration(User user);
}
