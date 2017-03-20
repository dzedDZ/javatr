package Lesson6.by.rdcentre.javatr.lesson6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Denis on 16.03.2017.
 * задать форму сборника в main
 */
public class Collect {
    public static void main(String args[]) {
        Edition e1 = new Book("Детская книга",
                "Сборник стихов", 1989, 11, 01, "Марина Цветаева");
        Collect col1 = new Collect("избранное Марины Цветаевой", e1);
        col1.addRecord("Вчера еще", "Марина Цветаева");
        col1.addRecord("Мы с тобой лишь два отголоска", "Марина Цветаева");
        col1.addRecord("Под лаской плюшевого пледа", "Марина Цветаева");
        //col1.collection.add(new Work("Вчера еще", "Марина Цветаева"));
        //col1.collection.add(new Work("Мы с тобой лишь два отголоска", "Марина Цветаева"));
        //col1.collection.add(new Work("Под лаской плюшевого пледа", "Марина Цветаева"));

        col1.showCollection();

        Edition e2 = new Magazine("издательство ЭКСМО", "Новый журнал",
                1900, 10, 1, 4, "Поэзия");
        Collect col2 = new Collect("стихи о любви", e2);
        col2.addRecord("Кроме Любви", "Марина Цветаева");
        col2.addRecord("Письмо к женщине", "Сергей Есенин");
        col2.addRecord("Я любить тебя буду можно?", "Эдуард Асадов");
        //col2.collection.add(new Work("Кроме Любви", "Марина Цветаева"));
        //col2.collection.add(new Work("Письмо к женщине", "Сергей Есенин"));
        //col2.collection.add(new Work("Я любить тебя буду можно?", "Эдуард Асадов"));

        col2.showCollection();
        //поиск в конкретном сборнике
        col1.searchRecord("Эдуард Асадов");
        col2.searchRecord("Эдуард Асадов");

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
        System.out.println("Сборник: " + getCollectionTitle());
        System.out.print("Форма: ");
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

        System.out.println("Ищем:'" + _searchString + "' в сборнике:" + this.getCollectionTitle());
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

