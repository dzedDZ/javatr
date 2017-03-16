package by.rdcentre.javatr.lesson5;

import java.util.*;
import java.util.Calendar;

/**
 * Created by Denis on 09.03.2017.
 */
public class Record {
    private String firstName = "";
    private String lastName = "";
    private GregorianCalendar birthDay = new GregorianCalendar();
    private String phoneNumber = "";

    public Record() {
        setFirstName("");
        setLastName("");
        setBirthDay(null);
        setPhoneNumber("");
    }
    public Record(String _firstName, String _lastName, GregorianCalendar _birthDate, String _phoneNumber){
        setFirstName(_firstName);
        setLastName(_lastName);
        setBirthDay(_birthDate);
        setPhoneNumber(_phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GregorianCalendar getBirthDay() {
        return birthDay ;
    }

    public void setBirthDay(GregorianCalendar birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "first name=" + getFirstName() + ", last name=" + getLastName() + ", birth date=" +
                getBirthDay().get(java.util.Calendar.YEAR) + "-" + getBirthDay().get(java.util.Calendar.MONTH) +
                "-" + getBirthDay().get(Calendar.DATE) + ", phone number=" + getPhoneNumber() + ";";
    }
}
