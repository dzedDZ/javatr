package Lesson14.by.rdcentre.javatr.dao.impl;

import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.dao.LeasingDAO;

import java.util.GregorianCalendar;

/**
 * Created by Denis on 11.04.2017.
 */
public class FileLeasingDAO implements LeasingDAO {
    @Override
    public void add(User _user, SportingGood _good, int _leasingPeriod,
                    GregorianCalendar startdate, GregorianCalendar enddate, double leasingsum) {

    }
}
