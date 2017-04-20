package Lesson14.by.rdcentre.javatr.service.impl;

import Lesson14.by.rdcentre.javatr.dao.SportingGoodDAO;
import Lesson14.by.rdcentre.javatr.dao.factory.DAOFactory;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.service.SportingGoodService;

import java.util.ArrayList;

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

    }

    @Override
    public ArrayList showGoodService() {
        return null;
    }
}
