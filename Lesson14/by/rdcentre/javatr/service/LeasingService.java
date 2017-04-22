package Lesson14.by.rdcentre.javatr.service;

import Lesson14.by.rdcentre.javatr.bean.Leasing;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.bean.User;

import java.util.ArrayList;

/**
 * Created by Denis on 13.04.2017.
 */
public interface LeasingService {
    String addLeasingObject(String sportingGoodName, String userName, int startDateYear, int startDateMonth,
                            int startDateDay, int leasingDays, double leasingSum);
    String returnLeasingObject(String sportingGoodName, String userName, int endDateYear, int  endDateMonth,
                               int endDateDay);
    Leasing getLeasingObjectForReturnService(String sportingGoodName, String userName);
    ArrayList showLeasingService();
}
