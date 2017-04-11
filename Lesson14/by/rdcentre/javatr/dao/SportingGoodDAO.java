package Lesson14.by.rdcentre.javatr.dao;

import Lesson11.by.rdcentre.javatr.lesson11.Good;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;

/**
 * Created by Denis on 10.04.2017.
 */
public interface SportingGoodDAO {
    void addGood(SportingGood sportingGood);
    void delete(SportingGood sportingGood);
}
