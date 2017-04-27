package Lesson6.by.rdcentre.javatr.lesson6;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Denis on 16.03.2017.
 */
public class Work {// куда пропали методы equals и hashCode, объекты вашего же класса данные содержат, следовательно, не могут обойтись без этих методов
    private String title;
    private String authorName;
    private GregorianCalendar firstTimePublishingDate;
    private String firstTimePlacePublishing;
    private String genre;

    public Work(){}
    public Work(String _title, String _authorName, int _year, int _month, int _day, String _firstTimePlacePublishing, String _genre){
        setAuthorName(_authorName);
        setTitle(_title);
        setFirstTimePublishingDate(new GregorianCalendar(_year, _month, _day));
        setFirstTimePlacePublishing(_firstTimePlacePublishing);
        setGenre(_genre);
    }
    public Work(String _title, String _authorName){
        setTitle(_title);
        setAuthorName(_authorName);

        setFirstTimePublishingDate(new GregorianCalendar(0, 0,0));
        setFirstTimePlacePublishing("");
        setGenre("");

    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String _title) {
        title = _title;
    }

    public GregorianCalendar getFirstTimePublishingDate() {
        return firstTimePublishingDate;
    }

    public void setFirstTimePublishingDate(GregorianCalendar firstTimePublishingDate) {
        this.firstTimePublishingDate = firstTimePublishingDate;
    }

    public String getFirstTimePlacePublishing() {
        return firstTimePlacePublishing;
    }

    public void setFirstTimePlacePublishing(String firstTimePlacePublishing) {
        this.firstTimePlacePublishing = firstTimePlacePublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return " title=" + getTitle() + ", author=" + getAuthorName() + ", first time publishing date=" +
                getFirstTimePublishingDate().get(java.util.Calendar.YEAR) + "-" +
                getFirstTimePublishingDate().get(java.util.Calendar.MONTH) +
                "-" + getFirstTimePublishingDate().get(Calendar.DATE) + ", first time publishing place=" +
                getFirstTimePlacePublishing() + ", genre=" + getGenre() + ";";
    }
}

