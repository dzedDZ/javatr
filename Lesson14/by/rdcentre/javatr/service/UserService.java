package Lesson14.by.rdcentre.javatr.service;

import java.util.ArrayList;

/**
 * Created by Denis on 13.04.2017.
 */
public interface UserService {
    //void SignIn(String name, String address, String phoneNumber);
    void Registration(String name, String address, String phoneNumber);
    ArrayList showUser();
}
