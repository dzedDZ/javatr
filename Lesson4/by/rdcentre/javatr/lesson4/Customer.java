package by.rdcentre.javatr.lesson4;

/**
 * Created by Denis on 16.03.2017.
 */

public class Customer {
    private int id;
    private String lastName;
    private String patronymicName;
    private String firstName;
    private String address;
    private String creditCardNumber;
    private String accountNumber;

    public Customer() {
        this.setId(0);
        this.setLastName("");
        this.setPatronymicName("");
        this.setFirstName("");
        this.setAddress("");
        this.setCreditCardNumber("");
        this.setAccountNumber("");
    }

    public Customer(int _id, String _lastName, String _patronymicName, String _firstName, String _address, String _creditCardNumber, String _accountNumber) {
        this.setId(_id);
        this.setLastName(_lastName);
        this.setPatronymicName(_patronymicName);
        this.setFirstName(_firstName);
        this.setAddress(_address);
        this.setCreditCardNumber(_creditCardNumber);
        this.setAccountNumber(_accountNumber);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return this.patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String showCustomer() {
        return String.format("ID: %d\t first name: %s\t middle name: %s\t last name: %s\t address: %s\t credit card number: %s\t account number: %s\t", new Object[]{Integer.valueOf(this.getId()), this.getFirstName(), this.getPatronymicName(), this.getLastName(), this.getAddress(), this.getCreditCardNumber(), this.getAccountNumber()});
    }

    public boolean checkAddress() {
        boolean result = false;
        if(this.getAddress().length() > 10) {
            result = true;
        }

        return result;
    }
}