package Lesson14.by.rdcentre.javatr.dao.impl;

import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.dao.UserDAO;

import java.util.ArrayList;

/**
 * Created by Denis on 10.04.2017.
 */
public class FileUser implements UserDAO {
    public ArrayList<User> sg = new ArrayList<User>();
    @Override
    public void signIn(String login, String password) {

    }

    @Override
    public void registration(String login, String password) {

    }

    @Override
    public ArrayList getUser() {
        return sg;
    }

    @Override
    public ArrayList getUser(User user) {
        return sg;
    }
}
