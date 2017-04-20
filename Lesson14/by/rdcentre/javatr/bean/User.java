package Lesson14.by.rdcentre.javatr.bean;

/**
 * Created by Denis on 10.04.2017.
 */
public class User implements java.io.Serializable{
    private String name;
    private String address;
    private String phoneNumber;

    public User(String _name, String _address, String _phoneNumber){
        setAddress(_address);
        setName(_name);
        setPhoneNUmber(_phoneNumber);
    }
    public String toString(){
        return getName() + " | " + getPhoneNUmber() + " | " + getAddress();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNUmber() {
        return phoneNumber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNumber = phoneNUmber;
    }
}
