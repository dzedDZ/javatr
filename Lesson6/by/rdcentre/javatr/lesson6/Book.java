package Lesson6.by.rdcentre.javatr.lesson6;

/**
 * Created by Denis on 16.03.2017.
 */
public class Book extends Edition {
    private String author;

    public Book(){}
    public Book(String _publishingName, String _title, int _year, int _month, int _day, String _author){
        super(_publishingName,_title, _year, _month, _day);
        setAuthor(_author);
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString(){
        return
                "Book: " + '\n' + "Author: " + getAuthor() + super.toString();
    }
}
