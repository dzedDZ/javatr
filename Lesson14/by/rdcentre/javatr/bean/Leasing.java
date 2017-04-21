package Lesson14.by.rdcentre.javatr.bean;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Denis on 10.04.2017.
 */
public class Leasing implements java.io.Serializable{
    private User user;
    private SportingGood sportingGood;
    private GregorianCalendar startDate;
    private int leasingDays;
    private GregorianCalendar endDate;
    private double leasingSum;

    public Leasing(User _user, SportingGood _sportingGood, GregorianCalendar _startDate, int _leasingDays,
                   GregorianCalendar _endDate, double _leasingSum){
        setUser(_user);
        setSportingGood(_sportingGood);
        setStartDate(_startDate);
        setLeasingDays(_leasingDays);
        setEndDate(_endDate);
        setLeasingSum(_leasingSum);
    }

    public String toString(){
        return user.getName() + "|" + sportingGood.getName() + "|" + getStartDate().get(Calendar.YEAR) +
                "-" + getStartDate().get(Calendar.MONTH) + "-" + getStartDate().get(Calendar.DATE) + "|"
                + getLeasingDays() + "|" + getEndDate().get(Calendar.YEAR)  + "-" + getEndDate().get(Calendar.MONTH) +
                "-" + getEndDate().get(Calendar.DATE) + "|" + getLeasingSum();

    }

    public SportingGood getSportingGood() {
        return sportingGood;
    }

    public void setSportingGood(SportingGood sportingGood) {
        this.sportingGood = sportingGood;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public int getLeasingDays() {
        return leasingDays;
    }

    public void setLeasingDays(int leasingDays) {
        this.leasingDays = leasingDays;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate) {
        this.endDate = endDate;
    }

    public double getLeasingSum() {
        return leasingSum;
    }

    public void setLeasingSum(double leasingSum) {
        this.leasingSum = leasingSum;
    }
}
