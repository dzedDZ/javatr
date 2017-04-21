package Lesson14.by.rdcentre.javatr.service;

import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.bean.User;

import java.util.ArrayList;

/**
 * Created by Denis on 13.04.2017.
 */
public interface LeasingService {
    String addLeasingObject(String sportingGoodName, String userName, int startDateYear, int startDateMonth,
                            int startDateDay, int leasingDays, int endDateYear, int endDateMonth, int endDateDay,
                            double leasingSum);
    ArrayList showLeasingService();
}
