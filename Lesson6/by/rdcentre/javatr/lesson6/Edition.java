package Lesson6.by.rdcentre.javatr.lesson6;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Denis on 16.03.2017.
 */
public class Edition {// аналогично, куда же пропали методы класса Object
    private GregorianCalendar publishingDate;
    private String publisherName;
    private String title;

    public Edition(){}
    public Edition(String _publishingName, String _title, int _year, int _month, int _day){
        setTitle(_title);
        setPublisherName(_publishingName);
        setPublishingDate(new GregorianCalendar(_year,_month,_day));
    }


    public GregorianCalendar getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(GregorianCalendar publishingDate) {
        this.publishingDate = publishingDate;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return " title=" + getTitle() + ", publisherName=" + getPublisherName() + ", publishing date=" +
                getPublishingDate().get(java.util.Calendar.YEAR) + "-" +
                getPublishingDate().get(java.util.Calendar.MONTH) +
                "-" + getPublishingDate().get(Calendar.DATE) + ";";
    }
}
