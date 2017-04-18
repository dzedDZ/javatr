package Lesson14.by.rdcentre.javatr.dao;

import Lesson14.by.rdcentre.javatr.bean.User;

import java.util.ArrayList;

/**
 * Created by Denis on 10.04.2017.
 */
public interface UserDAO {
    //void signIn(User _user);
    void registration(User _user);
    boolean isExist(User _user);
    ArrayList getUser();
    ArrayList<User> getUser(User user);
}
