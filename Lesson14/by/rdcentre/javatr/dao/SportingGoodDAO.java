package Lesson14.by.rdcentre.javatr.dao;

import Lesson14.by.rdcentre.javatr.bean.SportingGood;

import java.util.ArrayList;

/**
 * Created by Denis on 10.04.2017.
 */
public interface SportingGoodDAO {
    void addGood(SportingGood sportingGood);
    void markArchive(SportingGood sportingGood);
    ArrayList getSportingGood();

}
