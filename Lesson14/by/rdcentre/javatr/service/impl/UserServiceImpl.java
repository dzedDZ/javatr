package Lesson14.by.rdcentre.javatr.service.impl;

import Lesson14.by.rdcentre.javatr.dao.UserDAO;
import Lesson14.by.rdcentre.javatr.dao.factory.DAOFactory;
import Lesson14.by.rdcentre.javatr.service.UserService;
import Lesson14.by.rdcentre.javatr.bean.User;

import java.util.ArrayList;

/**
 * Created by Denis on 13.04.2017.
 */
public class UserServiceImpl implements UserService{


    @Override
    public void Registration(String name, String address, String phoneNumber) {
        // check params
        if (name.length()>0 && address.length()>0 && phoneNumber.length()>0) {
            //implements logic
            User u_ = new User(name, address, phoneNumber);

            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();

            if (!userDAO.getUser().contains(u_)) {
                userDAO.registration(u_);
            }
            ;
        }
    }
    public ArrayList showUser(){
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();

        return userDAO.getUser();
    }
}
