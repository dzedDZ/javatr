package Lesson11.by.rdcentre.javatr.lesson11;
import Lesson6.by.rdcentre.javatr.lesson6.*;

import java.io.*;
import java.util.*;

/**
 * Created by Denis on 28.03.2017.
 */
public class Warehouse {
    public static void main(String[] args){
        String name;
        String emc;
        String category;
        int releaseDateDay;
        int releaseDateMonth;
        int releaseDateYear;
        String note;
        int choiceOfSorting;

        Warehouse wh = new Warehouse();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Exit; 2-Add; 3-Search; 4-Show goods");

        wh.loadFromDisk();

        while( 1==1 ) {
            while (!sc.hasNextInt()) {
                sc.next();
               // System.out.println("1-Exit; 2-Add; 3-Search; 4-Show goods");
            }
            choice = sc.nextInt();
            if (choice == 1) {
                wh.saveOnDisk();
                return;
            }
            if (choice == 2) {
                System.out.println(" Good addition: ");
                name = readSFromConsole("name");
                emc = readSFromConsole("equipment manufacturer code");
                category = readSFromConsole("category of Good");
                releaseDateYear = readNFromConsole("Release Date: Year");
                releaseDateMonth = readNFromConsole("Release Date: Month");
                releaseDateDay = readNFromConsole("Release Date: Day");
                note = readSFromConsole("Good's note");
                wh.addRecord(name,releaseDateYear,releaseDateMonth, releaseDateDay,emc,category,note);

            }
            if (choice == 3) {
                wh.searchRecord(readSFromConsole("search string"));
            }
            if (choice == 4 ){
                choiceOfSorting = readNFromConsole("Select choice of ordering: 1 - by Name; 2 - by EMC; 3 - by Category; ");
                if (choiceOfSorting == 1) {wh.sortByName();}
                else if (choiceOfSorting == 2) {wh.sortByEmc();}
                else if (choiceOfSorting == 3) {wh.sortByCategory();}
                wh.showWareHouse();
            }
            System.out.println("1-Exit; 2-Add; 3-Search; 4-Show goods");
        }
    }

    public ArrayList<Good> wh = new ArrayList<Good>();


    public void showWareHouse() {
        System.out.println("WareHouse : " );
        System.out.println("***********");
        for (Good str : wh) {
            System.out.println(str);
        }
        System.out.println("***********");
    }

    public void loadFromDisk() {
        FileInputStream fr = null;
        ObjectInputStream os = null;
        try {
            fr = new FileInputStream("d:\\wh.txt");
            os = new ObjectInputStream(fr);

            this.wh = (ArrayList) os.readObject();

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
                FileOutputStream fileOut = new FileOutputStream("d:\\wh.txt");
                ObjectOutputStream oos = new ObjectOutputStream (fileOut);

                oos.writeObject(this.wh);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    public void clearWareHouse () {
        this.wh.clear();
    }
    public void addRecord(String _name, int _yearRelease, int _monthRelease,
                          int _dateRelease, String _emc, String _category, String _note){
        this.wh.add(new Good(_name, _yearRelease, _monthRelease, _dateRelease,   _emc, _category, _note));
    }

    public void searchRecord(String _searchString) {
        Integer day;
        Integer month;
        Integer year;

        Iterator<Good> itr = this.wh.iterator();

        System.out.println("Looking for:'" + _searchString );
        while (itr.hasNext()) {
            Good good = itr.next();
            day = good.getReleaseDate().get(Calendar.DATE);
            month = good.getReleaseDate().get(Calendar.MONTH);
            year = good.getReleaseDate().get(Calendar.YEAR);
            if (good.getName().equals(_searchString)
                    || good.getCategory().equals(_searchString)
                    || year.toString().equals(_searchString)
                    || month.toString().equals(_searchString)
                    || day.toString().equals(_searchString)
                    || good.getEmc ().equals(_searchString)
                    || good.getNote().equals(_searchString)) {
                System.out.println(good.toString());
            }
        }
    }

    /*Comparator for sorting the list by Author Name*/
    public static Comparator<Good> NameComparator = new Comparator<Good>() {

        public int compare(Good s1, Good s2) {
            String Name1 = s1.getName().toUpperCase();
            String Name2 = s2.getName().toUpperCase();

            //ascending order
            return Name1.compareTo(Name2);

            //descending order
            //return Name2.compareTo(Name1);
        }};

    /*Comparator for sorting the list by roll no*/
    public static Comparator<Good> EMCComparator = new Comparator<Good>() {

        public int compare(Good r1, Good r2) {

            String emc1 = r1.getEmc().toUpperCase();
            String emc2 = r2.getEmc().toUpperCase();


	   /*For ascending order*/
            //return LastName1-LastName2;// for int
            return emc1.compareTo(emc2);
	   /*For descending order*/
            //return emc2.compareTo(emc1);
        }};
    public  static Comparator<Good> CategoryComparator = new Comparator<Good>() {

        public int compare(Good o1, Good o2) {
            String cat1 = o1.getCategory().toUpperCase();
            String cat2 = o2.getCategory().toUpperCase();

            return cat1.compareTo(cat2) ;
        }
    };

    public void sortByName(){
        Collections.sort(wh  , NameComparator);
    }
    public void sortByEmc(){
        Collections.sort(wh, EMCComparator);
    }
    public void sortByCategory(){
        Collections.sort(wh, CategoryComparator);
    }



    public static int readNFromConsole(String VarName){
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + VarName + ": ");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.print("Enter " + VarName + ": ");
        }
        x = sc.nextInt();
        return x;
    }

    public static String readSFromConsole(String varName) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + varName + ": ");
        while(!sc.hasNextLine() ){
            sc.next();
            System.out.print("Enter " + varName + ": ");
        }
        s = sc.nextLine();
        return s;
    }

}
