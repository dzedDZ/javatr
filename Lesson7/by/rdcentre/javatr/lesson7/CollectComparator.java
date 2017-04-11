package Lesson7.by.rdcentre.javatr.lesson7;

import Lesson6.by.rdcentre.javatr.lesson6.*;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Denis on 20.03.2017.
 */
public class CollectComparator extends Collect{
    public static void main(String args[]) {

        Edition e1 = new Book("Детская книга",
                "Сборник стихов", 1989, 11, 01, "Марина Цветаева, Иосиф Бродский");
        CollectComparator col1 = new CollectComparator("избранное", e1);
        col1.addRecord("Вчера еще", "Марина Цветаева", 1936,1,1,"Москва","поэзия");
        col1.addRecord("Любовь", "Иосиф Бродский", 1933,1,1,"Москва","поэзия");
        col1.addRecord("А Под лаской плюшевого пледа", "Марина Цветаева1", 1929,1,1,"Москва","поэзия");
        //col1.collection.add(new Work("Вчера еще", "Марина Цветаева"));
        //col1.collection.add(new Work("Мы с тобой лишь два отголоска", "Марина Цветаева"));
        //col1.collection.add(new Work("Под лаской плюшевого пледа", "Марина Цветаева"));

        col1.showCollection();
        System.out.println("Сортировка по имени автора произведения в сборнике");
        col1.sortByAuthorName();
        col1.showCollection();
        System.out.println("Сортировка по названию произведения");
        col1.sortByTitle();
        col1.showCollection();
        System.out.println("Сортировка по году издания произведения");
        col1.sortByYearPublishing();
        col1.showCollection();

        Edition e2 = new Magazine("издательство ЭКСМО", "Новый журнал",
                1900, 10, 1, 4, "Поэзия");
        CollectComparator col2 = new CollectComparator("стихи о любви", e2);
        col2.addRecord("Кроме Любви", "Марина Цветаева");
        col2.addRecord("Письмо к женщине", "Сергей Есенин");
        col2.addRecord("Я любить тебя буду можно?", "Эдуард Асадов");

        col2.showCollection();

        //поиск в конкретном сборнике
        col1.searchRecord("Эдуард Асадов");
        col2.searchRecord("Эдуард Асадов");

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
