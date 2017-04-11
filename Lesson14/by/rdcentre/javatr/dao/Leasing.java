package Lesson14.by.rdcentre.javatr.dao;

import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.bean.User;

import java.util.GregorianCalendar;

/**
 * Created by Denis on 11.04.2017.
 */
public interface Leasing {
    void add(User _user, SportingGood _good, int _leasingPeriod,
             GregorianCalendar startdate, GregorianCalendar enddate, double leasingsum);
}
