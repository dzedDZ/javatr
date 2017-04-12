package by.rdcentre.javatr.lesson5;

import com.sun.prism.impl.Disposer;

import java.util.*;
import java.util.Calendar;


/**
 * Created by Denis on 09.03.2017.
 * Ñîçäàòü êëàññ “Çàïèñíàÿ êíèæêà”. Ïðåäóñìîòðåòü âîçìîæíîñòü ðàáîòû
 ñ ïðîèçâîëüíûì ÷èñëîì çàïèñåé, ïîéñêà çàïèñè ïî êàêîìó-áûëî
 ïðèçíàêó (íàïðèìåð, ïî ôàìèëèè, äàòå ðîæäåíèÿ èëè íîìåðó òåëåôîíà),
 äîáàâëåíèÿ è óäàëåíèÿ çàïèñåé, cîðòèðîâêè ïî ðàçíûì ïîëÿì.
 */
public class Notepad {
    public static void main(String args[]) {// и методом main не следует нагрузать рабочие классы
    Notepad notepad = new Notepad();

    notepad.addRecord("Ëóêüÿí", "Åãîðîâ", 1995,11,30,"+12345678");
    notepad.addRecord("Óëüÿíà", "Åãîðîâà", 1985,10,3,"+123454444678");
    notepad.addRecord("Ïåòð", "Èâàíîâè÷",1975,1,31,"+123429044678");

        System.out.println("Sorted 'as is' ");
        notepad.showNotepad();

        notepad.sortByFirstName();
        System.out.println("Sorted by first Name");
        notepad.showNotepad();
        System.out.println("Searching for ...");
        notepad.searchRecord("Óëüÿíà");
        notepad.searchRecord("Åãîðîâà");
        notepad.searchRecord("3");
    }

    public Notepad() {}

    ArrayList<Record> notepad = new ArrayList<Record>();

    public void addRecord(String _firstName, String _lastName, int _year, int _month, int _day, String _phoneNumber){

        GregorianCalendar _birthDate = new GregorianCalendar();
        _birthDate.set(_year,_month,_day);
        notepad.add(new Record(_firstName,_lastName,_birthDate,_phoneNumber));
    }

    public void deleteRecord(String _firstName, String _lastName, Date _birthDate, String _phoneNumber){
        Iterator<Record> itr = notepad.iterator();

        while (itr.hasNext())
        {
            Record record = itr.next();
            if (record.getFirstName().equals(_firstName)
                    && record.getLastName().equals(_lastName)
                    && record.getBirthDay().equals(_birthDate)
                    && record.getPhoneNumber().equals(_phoneNumber))
                {
                    itr.remove();
                }
        }
    }

    public void searchRecord(String _searchString) {
        Integer day;
        Integer month;
        Integer year;

        Iterator<Record> itr = notepad.iterator();
        System.out.println(_searchString);
        while (itr.hasNext()) {
            Record record = itr.next();
            day = record.getBirthDay().get(Calendar.DATE);
            month = record.getBirthDay().get(Calendar.MONTH);
            year = record.getBirthDay().get(Calendar.YEAR);
            if (record.getFirstName().equals(_searchString)
                    || record.getLastName().equals(_searchString)
                    || year.toString().equals(_searchString)
                    || month.toString().equals(_searchString)
                    || day.toString().equals(_searchString)
                    || record.getPhoneNumber().equals(_searchString)) {
                System.out.println(record.toString());
            }
        }
    }

    /*Comparator for sorting the list by Student Name*/
    public static Comparator<Record> FirstNameComparator = new Comparator<Record>() {

        public int compare(Record s1, Record s2) {
            String FirstName1 = s1.getFirstName().toUpperCase();
            String FirstName2 = s2.getFirstName().toUpperCase();

            //ascending order
            return FirstName1.compareTo(FirstName2);

            //descending order
            //return FirstName2.compareTo(FirstName1);
        }};

    /*Comparator for sorting the list by roll no*/
    public static Comparator<Record> LastNameComparator = new Comparator<Record>() {

        public int compare(Record r1, Record r2) {

            String LastName1 = r1.getLastName();
            String LastName2 = r2.getLastName();


	   /*For ascending order*/
            //return LastName1-LastName2;// for int
                return LastName1.compareTo(LastName2);
	   /*For descending order*/
            //return LastName2.compareTo(LastName1);
        }};

    public void sortByFirstName(){
        Collections.sort(notepad, Notepad.FirstNameComparator);
    }

    public void showNotepad(){
        for (Record str : notepad ) {
            System.out.println(str);
        }
    }
}
