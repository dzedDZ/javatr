package Lesson14.by.rdcentre.javatr.dao.impl;

import Lesson14.by.rdcentre.javatr.bean.User;
import Lesson14.by.rdcentre.javatr.dao.UserDAO;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Denis on 10.04.2017.
 */
public class FileUser implements UserDAO, Serializable {
    public ArrayList<User> u = new ArrayList<User>();

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

        try{
            FileOutputStream fileOut = new FileOutputStream("d:\\u.txt");
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);

            oos.writeObject(this.u);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void registration(User _user) {
        if (!isExist(_user)){
            u.add(_user);
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
