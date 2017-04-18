package Lesson14.by.rdcentre.javatr.service.factory;


import Lesson14.by.rdcentre.javatr.service.LeasingService;
import Lesson14.by.rdcentre.javatr.service.SportingGoodService;
import Lesson14.by.rdcentre.javatr.service.UserService;
import Lesson14.by.rdcentre.javatr.service.impl.LeasingServiceImpl;
import Lesson14.by.rdcentre.javatr.service.impl.SportingGoodServiceImpl;
import Lesson14.by.rdcentre.javatr.service.impl.UserServiceImpl;


/**
 * Created by Denis on 18.04.2017.
 */
public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final SportingGoodService sportingGoodService = new SportingGoodServiceImpl();
    private final LeasingService leasingService = new LeasingServiceImpl();
    private final UserService userService = new UserServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public SportingGoodService getSportingGoodService(){
        return sportingGoodService;
    }

    public LeasingService getLeasingService(){
        return leasingService;
    }

    public UserService getUserService(){
        return userService;
    }
}
