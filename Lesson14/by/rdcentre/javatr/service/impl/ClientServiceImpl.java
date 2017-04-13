package Lesson14.by.rdcentre.javatr.service.impl;

import Lesson14.by.rdcentre.javatr.dao.UserDAO;
import Lesson14.by.rdcentre.javatr.dao.impl.DAOFactory;
import Lesson14.by.rdcentre.javatr.service.User;

/**
 * Created by Denis on 13.04.2017.
 */
public class ClientServiceImpl implements User{
    @Override
    public void SignIn(String login, String password) {
        // check params

        // implements login in

        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        userDAO.signIn(login, password);

    }

    @Override
    public void Registration(String login, String password) {
        // check params

        //implements logic

        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        userDAO.registration(login, password);
    }
}
