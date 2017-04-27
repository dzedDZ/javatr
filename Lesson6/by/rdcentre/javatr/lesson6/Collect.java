package Lesson6.by.rdcentre.javatr.lesson6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Denis on 16.03.2017.
 * çàäàòü ôîðìó ñáîðíèêà â main
 */
public class Collect {// в одном классе собраны методы и поля класса-сущности - КоллекцияИзданий, и методы, который должны работать с этой коллекцией
    // и уже не определишь, корректно определены методы по классам или нет.
    public static void main(String args[]) {
        Edition e1 = new Book("Äåòñêàÿ êíèãà",
                "Ñáîðíèê ñòèõîâ", 1989, 11, 01, "Ìàðèíà Öâåòàåâà");
        Collect col1 = new Collect("èçáðàííîå Ìàðèíû Öâåòàåâîé", e1);
        col1.addRecord("Â÷åðà åùå", "Ìàðèíà Öâåòàåâà");
        col1.addRecord("Ìû ñ òîáîé ëèøü äâà îòãîëîñêà", "Ìàðèíà Öâåòàåâà");
        col1.addRecord("Ïîä ëàñêîé ïëþøåâîãî ïëåäà", "Ìàðèíà Öâåòàåâà");
        //col1.collection.add(new Work("Â÷åðà åùå", "Ìàðèíà Öâåòàåâà"));
        //col1.collection.add(new Work("Ìû ñ òîáîé ëèøü äâà îòãîëîñêà", "Ìàðèíà Öâåòàåâà"));
        //col1.collection.add(new Work("Ïîä ëàñêîé ïëþøåâîãî ïëåäà", "Ìàðèíà Öâåòàåâà"));

        col1.showCollection();

        Edition e2 = new Magazine("èçäàòåëüñòâî ÝÊÑÌÎ", "Íîâûé æóðíàë",
                1900, 10, 1, 4, "Ïîýçèÿ");
        Collect col2 = new Collect("ñòèõè î ëþáâè", e2);
        col2.addRecord("Êðîìå Ëþáâè", "Ìàðèíà Öâåòàåâà");
        col2.addRecord("Ïèñüìî ê æåíùèíå", "Ñåðãåé Åñåíèí");
        col2.addRecord("ß ëþáèòü òåáÿ áóäó ìîæíî?", "Ýäóàðä Àñàäîâ");
        //col2.collection.add(new Work("Êðîìå Ëþáâè", "Ìàðèíà Öâåòàåâà"));
        //col2.collection.add(new Work("Ïèñüìî ê æåíùèíå", "Ñåðãåé Åñåíèí"));
        //col2.collection.add(new Work("ß ëþáèòü òåáÿ áóäó ìîæíî?", "Ýäóàðä Àñàäîâ"));

        col2.showCollection();
        //ïîèñê â êîíêðåòíîì ñáîðíèêå
        col1.searchRecord("Ýäóàðä Àñàäîâ");
        col2.searchRecord("Ýäóàðä Àñàäîâ");

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
        System.out.println("Ñáîðíèê: " + getCollectionTitle());
        System.out.print("Ôîðìà: ");
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

        System.out.println("Èùåì:'" + _searchString + "' â ñáîðíèêå:" + this.getCollectionTitle());
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

