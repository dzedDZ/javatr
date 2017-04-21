package Lesson14.by.rdcentre.javatr.dao.impl;

import Lesson14.by.rdcentre.javatr.bean.Leasing;
import Lesson14.by.rdcentre.javatr.dao.LeasingDAO;

import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by Denis on 11.04.2017.
 */
public class FileLeasingDAO implements LeasingDAO {
    public ArrayList<Leasing> l = new ArrayList<Leasing>();
    {
        loadFromDisk();
    }
    public void loadFromDisk() {
        FileInputStream fr = null;
        ObjectInputStream os = null;
        File f = new File("d:\\l.txt");
        if (f.exists()) {
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
        saveOnDisk();
    }

    @Override
    public void returnSportingGood(Leasing _leasing, GregorianCalendar _enddate) {
        int i = l.indexOf(_leasing);
        if (i != -1) {
            l.set(i, new Leasing(_leasing.getUser(), _leasing.getSportingGood(),
                    _leasing.getStartDate(), _leasing.getLeasingDays(), _enddate, _leasing.getLeasingSum()));
        }
    }

    @Override
    public ArrayList getLeasing() {
        return l;
    }
}
