package Lesson14.by.rdcentre.javatr.impl;

import Lesson14.by.rdcentre.javatr.dao.LeasingDAO;
import Lesson14.by.rdcentre.javatr.dao.SportingGoodDAO;
import Lesson14.by.rdcentre.javatr.dao.UserDAO;

/**
 * Created by Denis on 12.04.2017.
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final LeasingDAO fileLeasingDAO = new FileLeasingDAO();
    private final SportingGoodDAO fileSportingGood = new FileSportingGood();
    private final UserDAO fileUser = new FileUser();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }

    public LeasingDAO getLeasingDAO(){
        return fileLeasingDAO;
    }

    public SportingGoodDAO getSportingGoodDAO(){
        return fileSportingGood;
    }

    public UserDAO getUserDAO() {
        return fileUser;
    }
}
