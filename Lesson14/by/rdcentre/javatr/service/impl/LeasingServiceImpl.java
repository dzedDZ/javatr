package Lesson14.by.rdcentre.javatr.service.impl;

import Lesson14.by.rdcentre.javatr.dao.factory.DAOFactory;
import Lesson14.by.rdcentre.javatr.dao.LeasingDAO;

import Lesson14.by.rdcentre.javatr.service.LeasingService ;

import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;

import java.util.GregorianCalendar;


/**
 * Created by Denis on 13.04.2017.
 */
public class LeasingServiceImpl implements LeasingService{

    public void addLeasingObject(SportingGood good, User user) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        LeasingDAO leasingDAO = daoObjectFactory.getLeasingDAO();

        //leasingDAO.add(user, good, 133, ); ;

    }
    //test

}
