package by.rdcentre.javatr.lesson4;

import java.util.Date;

public class Student {

	private int id;
	private String lastName;
	private String patronymicName;
	private String firstName;
	private Date birthDay;
	private String address;
	private String phone;
	private String faculty;
	private String course;
	private int rating1;
	private int rating2;
	private int rating3;
	private float avgRating;


	public Student(){
		setId(0);
		setLastName("");
		setPatronymicName("");
		setFirstName("");
		setBirthDay(0+1900,01,01);
		setAddress("");
		setPhone("");
		setFaculty("");
		setCourse("");
		setRating1(0);
		setRating2(0);
		setRating3(0);
	}
	
	public Student(int _id, String _lastName, String _patronymicName,
				   String _firstName, int _birthYear, int _birthMonth, int _birthDay, String _address,
			String _phone, String _faculty, String _course, int _mark1, int _mark2, int _mark3){
		setId(_id);
		setLastName(_lastName);
		setPatronymicName(_patronymicName);
		setFirstName(_firstName);
		setBirthDay(_birthYear, _birthMonth, _birthDay);
		setAddress(_address);
		setPhone(_phone);
		setFaculty(_faculty);
		setCourse(_course);
		setRating1(_mark1);
		setRating2(_mark2);
		setRating3(_mark3);
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
	 * @return the birthDay
	 */
	public Date getBirthDay() {
		return birthDay;
	}

	/**
	 * @param
	 */
	public void setBirthDay(int _birthYear, int _birthMonth, int _birthDay) {
		this.birthDay = new Date(_birthYear-1900, _birthMonth-1, _birthDay);
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

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the faculty
	 */
	public String getFaculty() {
		return faculty;
	}

	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

    public boolean checkAddress(){
        boolean result = false;
        if(this.getAddress().length() > 10) {
            result = true;
        }
        return  result;
    }

	public void setCourse(String course) {
		this.course = course;
	}
	
	public String showStudent() {
		return String.format("ID: %d\t first name: %s\t middle name: %s\t last name: %s\t birthday: %tF\t address: %s\t phone: %s\t from faculty: %s\t, course: %s\t",
				getId(), getFirstName(), getPatronymicName(), getLastName(), getBirthDay(), getAddress(), getPhone(), getFaculty(), getCourse() );
	}

	public int getRating1() {
		return rating1;
	}

	public void setRating1(int rating1) {
		this.rating1 = rating1;
	}

	public int getRating2() {
		return rating2;
	}

	public void setRating2(int rating2) {
		this.rating2 = rating2;
	}

	public int getRating3() {
		return rating3;
	}

	public void setRating3(int rating3) {
		this.rating3 = rating3;
	}

	public float getAvgRating() {
		return avgRating;
	}

	public void refreshRatings(){
    	int x = 3;
    	float sum = 0;
    	float y;

    	if (getRating1() <= 0 || getRating1() > 5) {x = x - 1;}
    	else {sum = sum + getRating1();}
    	if (getRating2() <= 0 || getRating2() > 5) { x = x - 1; }
    	else {sum = sum + getRating2();}
    	if (getRating3() <= 0 || getRating3() > 5) { x = x - 1; }
    	else {sum = sum + getRating3();}

    	if ( x == 0) {return;}
    	else {
    		y = (sum / x);
    		setAvgRating(y);
    	}

	}

	protected void setAvgRating(float _avgRating) {// к атрибутам надо подходить очень осторожно
		// получается, что студенту запретили вызывать метод, устанавливающий напрямую среднюю оценку
		// но вот подклассы при таком атрибуте может обойти метод refresh и установить то значение, которое захотят
		this.avgRating = _avgRating;
	}
}
