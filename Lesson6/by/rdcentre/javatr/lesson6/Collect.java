package Lesson6.by.rdcentre.javatr.lesson6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Denis on 16.03.2017.
 * ������ ����� �������� � main
 */
public class Collect {
    public static void main(String args[]) {
        Edition e1 = new Book("������� �����",
                "������� ������", 1989, 11, 01, "������ ��������");
        Collect col1 = new Collect("��������� ������ ���������", e1);
        col1.addRecord("����� ���", "������ ��������");
        col1.addRecord("�� � ����� ���� ��� ���������", "������ ��������");
        col1.addRecord("��� ������ ��������� �����", "������ ��������");
        //col1.collection.add(new Work("����� ���", "������ ��������"));
        //col1.collection.add(new Work("�� � ����� ���� ��� ���������", "������ ��������"));
        //col1.collection.add(new Work("��� ������ ��������� �����", "������ ��������"));

        col1.showCollection();

        Edition e2 = new Magazine("������������ �����", "����� ������",
                1900, 10, 1, 4, "������");
        Collect col2 = new Collect("����� � �����", e2);
        col2.addRecord("����� �����", "������ ��������");
        col2.addRecord("������ � �������", "������ ������");
        col2.addRecord("� ������ ���� ���� �����?", "������ ������");
        //col2.collection.add(new Work("����� �����", "������ ��������"));
        //col2.collection.add(new Work("������ � �������", "������ ������"));
        //col2.collection.add(new Work("� ������ ���� ���� �����?", "������ ������"));

        col2.showCollection();
        //����� � ���������� ��������
        col1.searchRecord("������ ������");
        col2.searchRecord("������ ������");

    }

    private String collectionTitle;
    private Edition form;

    List<Work> collection = new ArrayList<Work>();

    public Collect(String _collectionTitle, Edition _edition) {
        setCollectionTitle(_collectionTitle);
        setForm(_edition);
    }

    public ArrayList<Work> getCollection_() { return (ArrayList) collection;}

    public String getCollectionTitle() {
        return collectionTitle;
    }

    public void setCollectionTitle(String collectionTitle) {
        this.collectionTitle = collectionTitle;
    }

    public Edition getForm() {
        return form;
    }

    public void setForm(Edition form) {
        this.form = form;
    }

    public void showCollection() {
        System.out.println("�������: " + getCollectionTitle());
        System.out.print("�����: ");
        System.out.println(getForm().toString());

        for (Work str : collection) {
            System.out.println(str);
        }
        System.out.println();
    }

    public void addRecord(String _title, String _authorName, int _year, int _month, int _day, String _firstTimePlacePublishing, String _genre){
        collection.add(new Work(_title, _authorName,_year,_month, _day, _firstTimePlacePublishing, _genre));
    }
    public void addRecord(String _title, String _authorName){
        collection.add(new Work(_title,_authorName));
    }

    public void searchRecord(String _searchString) {
        Integer day;
        Integer month;
        Integer year;

        Iterator<Work> itr = this.collection.iterator();

        System.out.println("����:'" + _searchString + "' � ��������:" + this.getCollectionTitle());
        while (itr.hasNext()) {
            Work work = itr.next();
            day = work.getFirstTimePublishingDate().get(Calendar.DATE);
            month = work.getFirstTimePublishingDate().get(Calendar.MONTH);
            year = work.getFirstTimePublishingDate().get(Calendar.YEAR);
            if (work.getFirstTimePlacePublishing().equals(_searchString)
                    || work.getGenre().equals(_searchString)
                    || year.toString().equals(_searchString)
                    || month.toString().equals(_searchString)
                    || day.toString().equals(_searchString)
                    || work.getAuthorName().equals(_searchString)
                    || work.getTitle().equals(_searchString)) {
                System.out.println(work.toString());
            }
        }
    }
}

