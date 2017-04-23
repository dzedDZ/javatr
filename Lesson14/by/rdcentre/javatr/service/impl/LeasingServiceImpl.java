package Lesson14.by.rdcentre.javatr.service.impl;

import Lesson14.by.rdcentre.javatr.bean.Leasing;
import Lesson14.by.rdcentre.javatr.dao.SportingGoodDAO;
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
import java.util.Iterator;


/**
 * Created by Denis on 13.04.2017.
 */
public class LeasingServiceImpl implements LeasingService{

    public String addLeasingObject(String sportingGoodName, String userName,int startDateYear, int startDateMonth,
                                   int startDateDay, int leasingDays, double leasingSum) {
        SportingGood sportingGood;
        User user;
        Leasing leas;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        String response = "";

        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        LeasingDAO leasingDAO = daoObjectFactory.getLeasingDAO();

        SportingGoodService sportingGoodService = serviceFactory.getSportingGoodService();
        sportingGood = sportingGoodService.getSportingGoodService(sportingGoodName); // found a good
        if (sportingGood == null) {
            response = "The SportingGood " + sportingGoodName + " not found ";
            return response;
        }

        sportingGoodService.markLeasedSportingGood(sportingGood);

        UserService userService = serviceFactory.getUserService();
        user = userService.getUserService(userName);
        if (user == null){
            response = "The User " + userName + " not found.";
            return response;
        }
        leas = new Leasing(user,sportingGood,
                new GregorianCalendar(startDateYear,startDateMonth,startDateDay), leasingDays,
                new GregorianCalendar(2999,12,30), leasingSum);
        leasingDAO.hireOut(leas);

        response = "The SportingGood " + sportingGoodName + " hired out by " + userName + " successfully";

        return response;
    }

    @Override
    public String returnLeasingObject(String sportingGoodName, String userName, int endDateYear, int endDateMonth, int endDateDay) {
        SportingGood sportingGood;

        Leasing leas;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        String response = "";

        SportingGoodService sportingGoodService = serviceFactory.getSportingGoodService();
        sportingGood = sportingGoodService.getSportingGoodService(sportingGoodName);

        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        LeasingDAO leasingDAO = daoObjectFactory.getLeasingDAO();

        leas = getLeasingObjectForReturnService(sportingGoodName, userName);
        if (leas == null) {
            response = "The leasing object: " + sportingGoodName + " user: " + userName + " not found.";
            return response;
        }
        leasingDAO.returnSportingGood(leas, new GregorianCalendar(endDateYear,endDateMonth,endDateDay)) ;
        sportingGoodService.markAvailableSportingGood(sportingGood);

        response = "The SportingGood " + sportingGoodName + " returned by " + userName + " successfully";

        return response;
    }

    @Override
    public Leasing getLeasingObjectForReturnService(String sportingGoodName, String userName) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        LeasingDAO leasingDAO = daoObjectFactory.getLeasingDAO();
        ArrayList l = leasingDAO.getLeasing(); // get all Leases

        Iterator<Leasing> itr = l.iterator();

   //     System.out.println("Looking for:" + sportingGoodName + " user: " + userName);

        while (itr.hasNext()) {
            Leasing leasing = itr.next();

     //       System.out.println("SportingGood: " + leasing.getSportingGood().toString());
            if (leasing.getSportingGood().getName().equals(sportingGoodName)
                    && (leasing.getUser().getName().equals(userName))
                    && (leasing.getSportingGood().isLeased())
                    && !(leasing.getSportingGood().isArchive())
                    ) {

 //               System.out.println(leasing.toString());
                return leasing;
            }
        }
        return null;
    }


    @Override
    public ArrayList showLeasingService() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        LeasingDAO leasingDAO = daoFactory.getLeasingDAO();
        return leasingDAO.getLeasing();

    }
    //test

}
