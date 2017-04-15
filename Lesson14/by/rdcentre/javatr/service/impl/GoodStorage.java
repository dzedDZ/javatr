package Lesson14.by.rdcentre.javatr.service.impl;

import Lesson14.by.rdcentre.javatr.dao.SportingGoodDAO;
import Lesson14.by.rdcentre.javatr.dao.factory.DAOFactory;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.service.SportingGoodService;

/**
 * Created by Denis on 13.04.2017.
 */
public class GoodStorage implements SportingGoodService{
    @Override
    public void addSportingGood(SportingGood sportingGood) {

        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        SportingGoodDAO sportingGoodDAO = daoObjectFactory.getSportingGoodDAO();
        sportingGoodDAO.addGood(sportingGood);

    }
}
