package Lesson14.by.rdcentre.javatr.dao.impl;

import Lesson14.by.rdcentre.javatr.bean.SportingGood;
import Lesson14.by.rdcentre.javatr.dao.SportingGoodDAO;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Denis on 10.04.2017.
 */
public class FileSportingGood implements SportingGoodDAO {
    public ArrayList<SportingGood> sg = new ArrayList<SportingGood>();
    {
        loadFromDisk();
    }
    public void loadFromDisk() {
        FileInputStream fr = null;
        ObjectInputStream os = null;
        File f = new File("d:\\sg.txt");
        if(f.exists()) {
            try {
                fr = new FileInputStream("d:\\sg.txt");
                os = new ObjectInputStream(fr);

                this.sg = (ArrayList) os.readObject();

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
            FileOutputStream fileOut = new FileOutputStream("d:\\sg.txt");
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);

            oos.writeObject(this.sg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void addGood(SportingGood sportingGood) {
        sg.add(sportingGood);
        saveOnDisk();
    }

    @Override
    public void markArchive(SportingGood sportingGood) {
        int i = sg.indexOf(sportingGood);
        if (i != -1) {
            sg.set(i, new SportingGood(sportingGood.getName(), sportingGood.getPrice(), sportingGood.isLeased(), true));
            saveOnDisk();
        }
    }

    @Override
    public ArrayList getSportingGood() {
        return sg;
    }

    @Override
    public void markLeased(SportingGood sportingGood) {
        int i = sg.indexOf(sportingGood);
        if (i != -1) {
            sg.set(i, new SportingGood(sportingGood.getName(), sportingGood.getPrice(), true, false));
            saveOnDisk();
        }
    }


}
