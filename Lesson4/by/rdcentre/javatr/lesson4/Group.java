package by.rdcentre.javatr.lesson4;

/**
 * Created by Denis on 01.03.2017.
 */
public class Group {
    //protected int n = 0;
    private Student[] students;// = new Student[n];

    private String name;
    private float avgGroupRating = 0;
    private int countOverachiever = 0;
    private int countStudentWithMark2 = 0;


    public Group (Student[] _students, String _name){
        students = _students;
        setName(_name);
        setAvgGroupRating(0);
        setCountOverachiever(0);
        setCountStudentWithMark2(0);
    }

    public float getAvgGroupRating() {
        return avgGroupRating;
    }

    private void setAvgGroupRating(float avgGroupRating) {
        this.avgGroupRating = avgGroupRating;
    }

    public int getCountOverachiever() {
        return countOverachiever;
    }

    private void setCountOverachiever(int countOverachiever) {
        this.countOverachiever = countOverachiever;
    }

    public int getCountStudentWithMark2() {
        return countStudentWithMark2;
    }

    private void setCountStudentWithMark2(int countStudentWithMark2) {
        this.countStudentWithMark2 = countStudentWithMark2;
    }

    public void refreshGroupItems(){
        float x = 0; //avg

        int countStudent2 = 0;
        int countStudent5 = 0;
        int countStudent = students.length;

        for(int i = 0; i < students.length; i++){
            if (students[i].getAvgRating() > 0) { x = students[i].getAvgRating() + x;}
            else {countStudent = countStudent - 1;}

            if ((students[i].getRating1() < 3 && students[i].getRating1() > 0 )|| (students[i].getRating2() < 3  && students[i].getRating2() > 0) || (students[i].getRating3() < 3  && students[i].getRating3() > 0)){
                countStudent2 = countStudent2 + 1;
            }
            if (students[i].getAvgRating() == 5){
                countStudent5 = countStudent5 + 1;
            }
        }

        setCountOverachiever(countStudent5);
        setCountStudentWithMark2(countStudent2);
        if (x==0) {setAvgGroupRating(0);}
        else {
            setAvgGroupRating(x / countStudent);
        }

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
