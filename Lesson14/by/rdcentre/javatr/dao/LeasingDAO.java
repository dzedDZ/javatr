package Lesson14.by.rdcentre.javatr.dao;

import Lesson14.by.rdcentre.javatr.bean.Leasing;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.bean.User;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by Denis on 11.04.2017.
 */
public interface LeasingDAO {
    void hireOut(Leasing _leasing);
    void returnSportingGood(Leasing _leasing, GregorianCalendar _enddate);
    ArrayList getLeasing();
}
