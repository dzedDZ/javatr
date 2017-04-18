package Lesson14.by.rdcentre.javatr.dao.impl;

import Lesson14.by.rdcentre.javatr.bean.Leasing;
import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.dao.LeasingDAO;

import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by Denis on 11.04.2017.
 */
public class FileLeasingDAO implements LeasingDAO {
    public ArrayList<Leasing> l = new ArrayList<Leasing>();

    public void loadFromDisk() {
        FileInputStream fr = null;
        ObjectInputStream os = null;
        try {
            fr = new FileInputStream("d:\\l.txt");
            os = new ObjectInputStream(fr);

            this.l = (ArrayList) os.readObject();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveOnDisk()  {

        try{
            FileOutputStream fileOut = new FileOutputStream("d:\\l.txt");
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);

            oos.writeObject(this.l);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void add(Leasing _leasingng) {
        l.add( _leasingng);
    }
public boolean isExist(Leasing _leasing){
        if(l.contains(_leasing)) {return true;}
        else {return false;}

}
    @Override
    public void hireOut(Leasing _leasingng) {
        l.add( _leasingng);
    }

    @Override
    public void returnSportingGood(Leasing _leasing) {

    }
}
