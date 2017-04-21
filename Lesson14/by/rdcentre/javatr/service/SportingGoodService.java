package Lesson14.by.rdcentre.javatr.service;

import Lesson14.by.rdcentre.javatr.bean.SportingGood;

import java.util.ArrayList;

/**
 * Created by Denis on 13.04.2017.
 */
public interface SportingGoodService
{
    void addSportingGood(String name, Double price, boolean isArchive, boolean isLeased);
    void archiveSportingGood(SportingGood sportingGood);
    void markLeasedSportingGood(SportingGood sportingGood);
    ArrayList showGoodService();
    SportingGood getSportingGoodService(String sportingGoodName);
}
