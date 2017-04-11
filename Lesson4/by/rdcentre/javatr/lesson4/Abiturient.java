package by.rdcentre.javatr.lesson4;

/**
 * Created by Denis on 02.03.2017.
 */
public class Abiturient {
    final int n = 4; // exams count;// переменные всегда нужно называть по смыслу int examCount
    private String firstName;
    private String lastName;
    /* 4 exams */
    private int markExam1 = 0; //mark
    private int markExam2 = 0;
    private int markExam3 = 0;
    private int markExam4 = 0;
    private float avgRating;


    public Abiturient(){
        setFirstName("");
        setLastName("");
    }
    public Abiturient(String _lastName, String _firstName){
        setLastName(_lastName);
        setFirstName(_firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String _firstName) {
        firstName = _firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String _lastName) {
        lastName = _lastName;
    }

    public int getMarkExam1() {
        return markExam1;
    }

    public void setMarkExam1(int markExam1) {
        this.markExam1 = markExam1;
    }

    public int getMarkExam2() {
        return markExam2;
    }

    public void setMarkExam2(int markExam2) {
        this.markExam2 = markExam2;
    }

    public int getMarkExam3() {
        return markExam3;
    }

    public void setMarkExam3(int markExam3) {
        this.markExam3 = markExam3;
    }

    public int getMarkExam4() {
        return markExam4;
    }

    public void setMarkExam4(int markExam4) {
        this.markExam4 = markExam4;
    }
    public String showAbiturient() {
        return String.format("first name: %s\t last name: %s\t",
                getFirstName(), getLastName());
    }
    public void refreshRatings() {
        int x = 4;
        float sum = 0;
        float y;

        if (getMarkExam1() < 0 || getMarkExam1() > 5) {x = x - 1;}
        else {sum = sum + getMarkExam1();}
        if (getMarkExam2() < 0 || getMarkExam2() > 5) { x = x - 1; }
        else {sum = sum + getMarkExam2();}
        if (getMarkExam3() < 0 || getMarkExam3() > 5) { x = x - 1; }
        else {sum = sum + getMarkExam3();}
        if (getMarkExam4() < 0 || getMarkExam4() > 5) { x = x - 1; }
        else {sum = sum + getMarkExam4();}

        if ( x == 0) {
            setAvgRating(0);
            return;
        }
        else {
            y = (sum / x);
            setAvgRating(y);
        }
    }

    public float getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(float avgRating) {
        this.avgRating = avgRating;
    }

    /**
     * Created by Denis on 27.02.2017.
     */
    public static class Customer {// а зачем этот класс объеклен как вложенный?


            private int id;
            private String lastName;
            private String patronymicName;
            private String firstName;
            private String address;
            private String creditCardNumber;
            private String accountNumber;


            public Customer(){
                setId(0);
                setLastName("");
                setPatronymicName("");
                setFirstName("");
                setAddress("");
                setCreditCardNumber("");
                setAccountNumber("");
            }

            public Customer(int _id, String _lastName, String _patronymicName,
                           String _firstName, String _address,
                           String _creditCardNumber, String _accountNumber){
                setId(_id);
                setLastName(_lastName);
                setPatronymicName(_patronymicName);
                setFirstName(_firstName);
                setAddress(_address);
                setCreditCardNumber(_creditCardNumber);
                setAccountNumber(_accountNumber);
            }

            /**
             * @return the id
             */
            public int getId() {
                return id;
            }

            /**
             * @param id the id to set
             */
            public void setId(int id) {
                this.id = id;
            }

            /**
             * @return the lastName
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * @param lastName the lastName to set
             */
            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            /**
             * @return the patronymicName
             */
            public String getPatronymicName() {
                return patronymicName;
            }

            /**
             * @param patronymicName the patronymicName to set
             */
            public void setPatronymicName(String patronymicName) {
                this.patronymicName = patronymicName;
            }

            /**
             * @return the firstName
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * @param firstName the firstName to set
             */
            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            /**
             * @return the address
             */
            public String getAddress() {
                return address;
            }

            /**
             * @param address the address to set
             */
            public void setAddress(String address) {
                this.address = address;
            }


        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getCreditCardNumber() {
            return creditCardNumber;
        }

        public void setCreditCardNumber(String creditCardNumber) {
            this.creditCardNumber = creditCardNumber;
        }

        public String showCustomer() {
            return String.format("ID: %d\t first name: %s\t middle name: %s\t last name: %s\t address: %s\t credit card number: %s\t account number: %s\t",
                    getId(), getFirstName(), getPatronymicName(), getLastName(), getAddress(), getCreditCardNumber(), getAccountNumber() );
        }

        public boolean checkAddress(){
               boolean result = false;
               if(this.getAddress().length() > 10) {
                   result = true;
            }
               return  result;
        }
    }
}
