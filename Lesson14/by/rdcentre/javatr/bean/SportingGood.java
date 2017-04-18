package Lesson14.by.rdcentre.javatr.bean;

/**
 * Created by Denis on 10.04.2017.
 */
public class SportingGood {
    private String name;
    private double price;
    private boolean isLeased;
    private boolean isArchive;

    public SportingGood(String _name, double _price, boolean _isLeased, boolean _isArchive){
        setName(_name);
        setLeased(_isLeased);
        setPrice(_price);
        setArchive(_isArchive);
    }
    public String toString() {
        return getName() + "\t" + getPrice() + "\t" + isLeased() + "\t" + isArchive();
    }
    public boolean isLeased() {
        return isLeased;
    }

    public void setLeased(boolean leased) {
        isLeased = leased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isArchive() {
        return isArchive;
    }

    public void setArchive(boolean archive) {
        isArchive = archive;
    }
}
