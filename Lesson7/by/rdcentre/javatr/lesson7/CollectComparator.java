package Lesson7.by.rdcentre.javatr.lesson7;

import Lesson6.by.rdcentre.javatr.lesson6.*;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Denis on 20.03.2017.
 */
public class CollectComparator extends Collect{
    public static void main(String args[]) {

        Edition e1 = new Book("������� �����",
                "������� ������", 1989, 11, 01, "������ ��������, ����� ��������");
        CollectComparator col1 = new CollectComparator("���������", e1);
        col1.addRecord("����� ���", "������ ��������", 1936,1,1,"������","������");
        col1.addRecord("������", "����� ��������", 1933,1,1,"������","������");
        col1.addRecord("� ��� ������ ��������� �����", "������ ��������1", 1929,1,1,"������","������");
        //col1.collection.add(new Work("����� ���", "������ ��������"));
        //col1.collection.add(new Work("�� � ����� ���� ��� ���������", "������ ��������"));
        //col1.collection.add(new Work("��� ������ ��������� �����", "������ ��������"));

        col1.showCollection();
        System.out.println("���������� �� ����� ������ ������������ � ��������");
        col1.sortByAuthorName();
        col1.showCollection();
        System.out.println("���������� �� �������� ������������");
        col1.sortByTitle();
        col1.showCollection();
        System.out.println("���������� �� ���� ������� ������������");
        col1.sortByYearPublishing();
        col1.showCollection();

        Edition e2 = new Magazine("������������ �����", "����� ������",
                1900, 10, 1, 4, "������");
        CollectComparator col2 = new CollectComparator("����� � �����", e2);
        col2.addRecord("����� �����", "������ ��������");
        col2.addRecord("������ � �������", "������ ������");
        col2.addRecord("� ������ ���� ���� �����?", "������ ������");

        col2.showCollection();

        //����� � ���������� ��������
        col1.searchRecord("������ ������");
        col2.searchRecord("������ ������");

    }

    public CollectComparator(String _collectionTitle, Edition _edition) {
        super(_collectionTitle, _edition);

    }
    /*Comparator for sorting the list by Author Name*/
    public static Comparator<Work> AuthorNameComparator = new Comparator<Work>() {

        public int compare(Work s1, Work s2) {
            String AuthorName1 = s1.getAuthorName().toUpperCase();
            String AuthorName2 = s2.getAuthorName().toUpperCase();

            //ascending order
            return AuthorName1.compareTo(AuthorName2);

            //descending order
            //return AuthorName2.compareTo(AuthorName1);
        }};

    /*Comparator for sorting the list by roll no*/
    public static Comparator<Work> TitleComparator = new Comparator<Work>() {

        public int compare(Work r1, Work r2) {

            String Title1 = r1.getTitle().toUpperCase();
            String Title2 = r2.getTitle().toUpperCase();


	   /*For ascending order*/
            //return LastName1-LastName2;// for int
            return Title1.compareTo(Title2);
	   /*For descending order*/
            //return Title2.compareTo(Title1);
        }};
    public  static Comparator<Work> YearPublishing = new Comparator<Work>() {
        @Override
        public int compare(Work o1, Work o2) {
            int Year1 = o1.getFirstTimePublishingDate().get(java.util.Calendar.YEAR);
            int Year2 = o2.getFirstTimePublishingDate().get(java.util.Calendar.YEAR);
            return (Year1 - Year2);
        }
    };

    public void sortByAuthorName(){
            Collections.sort(getCollection_()  , CollectComparator.AuthorNameComparator);
    }
    public void sortByTitle(){
        Collections.sort(getCollection_(), CollectComparator.TitleComparator);
    }
    public void sortByYearPublishing(){
        Collections.sort(getCollection_(), CollectComparator.YearPublishing);
    }

}
