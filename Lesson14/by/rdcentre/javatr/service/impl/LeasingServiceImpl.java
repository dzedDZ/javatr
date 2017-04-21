package Lesson14.by.rdcentre.javatr.service.impl;

import Lesson14.by.rdcentre.javatr.bean.Leasing;
import Lesson14.by.rdcentre.javatr.dao.factory.DAOFactory;
import Lesson14.by.rdcentre.javatr.dao.LeasingDAO;

import Lesson14.by.rdcentre.javatr.service.LeasingService ;

import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.service.SportingGoodService;
import Lesson14.by.rdcentre.javatr.service.UserService;
import Lesson14.by.rdcentre.javatr.service.factory.ServiceFactory;

import java.util.ArrayList;
import java.util.GregorianCalendar;


/**
 * Created by Denis on 13.04.2017.
 */
public class LeasingServiceImpl implements LeasingService{

    public String addLeasingObject(String sportingGoodName, String userName,int startDateYear, int startDateMonth,
                                   int startDateDay, int leasingDays, int endDateYear, int endDateMonth, int endDateDay,
                                   double leasingSum) {
        SportingGood sportingGood;
        User user;
        Leasing leas;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        String response = "";

        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        LeasingDAO leasingDAO = daoObjectFactory.getLeasingDAO();

        SportingGoodService sportingGoodService = serviceFactory.getSportingGoodService();
        sportingGood = sportingGoodService.getSportingGoodService(sportingGoodName);
        if (sportingGood == null) {
            response = "The SportingGood " + sportingGoodName + " not found ";
            return response;
        }
        UserService userService = serviceFactory.getUserService();
        user = userService.getUserService(userName);
        if (user == null){
            response = "The User " + userName + " not found.";
            return response;
        }
        leas = new Leasing(user,sportingGood,
                new GregorianCalendar(startDateYear,startDateMonth,startDateDay), leasingDays,
                new GregorianCalendar(endDateYear,endDateMonth,endDateDay), leasingSum);
        leasingDAO.hireOut(leas);
        sportingGoodService.markLeasedSportingGood(sportingGood);
        response = "The SportingGood " + sportingGoodName + " hired out by " + userName + " successfully";

        return response;
    }

    @Override
    public ArrayList showLeasingService() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        LeasingDAO leasingDAO = daoFactory.getLeasingDAO();
        return leasingDAO.getLeasing();

    }
    //test

}
