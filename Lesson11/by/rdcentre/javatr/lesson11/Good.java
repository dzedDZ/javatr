package Lesson11.by.rdcentre.javatr.lesson11;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Denis on 29.03.2017.
 */
public class Good implements java.io.Serializable{
    private String name;
    private String emc;
    private String category;
    private GregorianCalendar releaseDate;
    private String note;

    public Good(String _name, int _yearRelease, int _monthRelease,
                int _dateRelease, String _emc, String _category, String _note){
        setName(_name);
        setEmc(_emc);
        setReleaseDate(new GregorianCalendar(_yearRelease, _monthRelease, _dateRelease) );
        setCategory(_category);
        setNote(_note);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " " + getName() + "\t" + getCategory() + "\t" +
                getEmc() + "\t" +  getReleaseDate().get(java.util.Calendar.YEAR) + "-" + getReleaseDate().get(Calendar.MONTH) +
                "-" + getReleaseDate().get(Calendar.DATE) + "\t" + getNote() + ";";
    }

    public String getEmc() {
        return emc;
    }

    public void setEmc(String emc) {
        this.emc = emc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public GregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(GregorianCalendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
