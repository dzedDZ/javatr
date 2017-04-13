package Lesson14.by.rdcentre.javatr.dao.impl;

import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.dao.SportingGoodDAO;

import java.util.ArrayList;

/**
 * Created by Denis on 10.04.2017.
 */
public class FileSportingGood implements SportingGoodDAO {
    public ArrayList<SportingGood> sg = new ArrayList<SportingGood>();

    @Override
    public void addGood(SportingGood sportingGood) {
        sg.add(sportingGood);
    }

    @Override
    public void delete(SportingGood sportingGood) {
        sg.remove(sportingGood);
    }

}
