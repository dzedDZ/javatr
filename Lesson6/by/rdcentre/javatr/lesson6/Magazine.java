package Lesson6.by.rdcentre.javatr.lesson6;

/**
 * Created by Denis on 16.03.2017.
 */
public class Magazine extends Edition {
    private int periodicityPerYear;
    private String magazineGenre;


    public Magazine(){}
    public Magazine(String _publishingName, String _title, int _year, int _month, int _day, int _periodPerYear, String _magazinGenre){
        super(_publishingName,_title,_year,_month,_day);
        setPeriodicityPerYear(_periodPerYear);
        setMagazineGenre(_magazinGenre);
    }

    public String getMagazineGenre() {
        return magazineGenre;
    }

    public void setMagazineGenre(String magazineGenre) {
        this.magazineGenre = magazineGenre;
    }

    public int getPeriodicityPerYear() {
        return periodicityPerYear;
    }

    public void setPeriodicityPerYear(int periodicityPerYear) {
        this.periodicityPerYear = periodicityPerYear;
    }
    @Override
    public String toString(){
        return
                "Magazine:" + '\n' + "Genre: " + getMagazineGenre()+ ", periodicity:" + getPeriodicityPerYear()
                        + super.toString();
    }
}
