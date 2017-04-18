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

    public void loadFromDisk() {
        FileInputStream fr = null;
        ObjectInputStream os = null;
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
    }

    @Override
    public void delete(SportingGood sportingGood) {
        sg.remove(sportingGood);
    }

}
