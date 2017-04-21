package Lesson14.by.rdcentre.javatr.service.impl;

import Lesson14.by.rdcentre.javatr.dao.SportingGoodDAO;
import Lesson14.by.rdcentre.javatr.dao.UserDAO;
import Lesson14.by.rdcentre.javatr.dao.factory.DAOFactory;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.service.SportingGoodService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by Denis on 13.04.2017.
 */
public class SportingGoodServiceImpl implements SportingGoodService{

    @Override
    public void addSportingGood(String name, Double price, boolean isArchive, boolean isLeased) {
        if (name.length()>0 && price>0) {
            SportingGood sg = new SportingGood(name,price,isLeased,isArchive);

        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        SportingGoodDAO sportingGoodDAO = daoObjectFactory.getSportingGoodDAO();
        sportingGoodDAO.addGood(sg);
        }
    }

    @Override
    public void archiveSportingGood(SportingGood sportingGood) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        SportingGoodDAO sportingGoodDAO = daoObjectFactory.getSportingGoodDAO();
        sportingGoodDAO.markArchive(sportingGood);
    }

    @Override
    public void markLeasedSportingGood(SportingGood sportingGood) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        SportingGoodDAO sportingGoodDAO = daoObjectFactory.getSportingGoodDAO();
        sportingGoodDAO.markLeased(sportingGood);
    }

    @Override
    public ArrayList showGoodService() {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        SportingGoodDAO sportingGoodDAO = daoObjectFactory.getSportingGoodDAO();
        return sportingGoodDAO.getSportingGood() ;
    }

    @Override
    public SportingGood getSportingGoodService(String sportingGoodName) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        SportingGoodDAO sportingGoodDAO = daoObjectFactory.getSportingGoodDAO();
        ArrayList sg = sportingGoodDAO.getSportingGood(); // get all SportingGoods

        Iterator<SportingGood> itr = sg.iterator();

        System.out.println("Looking for:'" + sportingGoodName );

        while (itr.hasNext()) {
            SportingGood sportingGood = itr.next();

            if (sportingGood.getName().equals(sportingGoodName)
                    && !(sportingGood.isLeased())
                    && !(sportingGood.isArchive())
                    ) {

                System.out.println(sportingGood.toString());
                return sportingGood;
            }
        }
        return null;
    }
}
