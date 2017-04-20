package Lesson14.by.rdcentre.javatr.dao.impl;

import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.dao.UserDAO;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Denis on 10.04.2017.
 */
public class FileUser implements UserDAO {
    public ArrayList<User> u = new ArrayList<User>();
    {
        loadFromDisk();
    }


    public void loadFromDisk() {
        FileInputStream fr = null;
        ObjectInputStream os = null;
        try {
            fr = new FileInputStream("d:\\u.txt");
            os = new ObjectInputStream(fr);

            this.u = (ArrayList) os.readObject();

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
        FileOutputStream fileOut = null;
        ObjectOutputStream oos = null;

        try{
            fileOut = new FileOutputStream("d:\\u.txt");
            oos = new ObjectOutputStream (fileOut);

            oos.writeObject(this.u);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("111");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                fileOut.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void registration(User _user) {
        if (!isExist(_user)){
            u.add(_user);
            saveOnDisk();
        }
    }

    @Override
    public boolean isExist(User _user) {
        if(u.contains(_user) ) {return true;}
        else         {return false;}
    }

    @Override
    public ArrayList getUser() {
        return u;
    }

    @Override
    public ArrayList<User> getUser(User user) {
        //   int i;
        //   i = u.indexOf(user);
        //   if (i != -1){
        //       return (User) u.get(i);
        //   }
        return u;
    }

}
