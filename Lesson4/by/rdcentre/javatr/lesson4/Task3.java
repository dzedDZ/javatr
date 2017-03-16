package by.rdcentre.javatr.lesson4;

/**
 * Created by Denis on 01.03.2017.
 */
public class Task3 {

    public static void main(String[] args) {
        final int n = 3;
        Student[] students = new Student[n];

        students[0] = new Student(1
                , "Иванов"
                , "Петрович"
                , "Виталий"
                , 2011
                , 11
                , 11
                , "малая арнаутская 15"
                , "322223"
                , "НичегоНеделания"
                , "подготовительный"
                , 4
                , 3
                , 4);
        students[0].refreshRatings();

        students[1] = new Student(2
                , "Петров"
                , "Витальевич"
                , "Виталий"
                , 1990
                , 2
                , 12
                , "большая арнаутская 15/2"
                , "432234"
                , "Умных вещей"
                , "первый"
                , 5
                , 0
                , 0);
        students[1].refreshRatings();

        students[2] = new Student(3
                , "Горбунов"
                , "Федор"
                , "Петрович"
                , 1967
                , 9
                , 7
                , "малая касательная 12"
                , "322000"
                , "Умных вещей"
                , "второй"
                , 5
                , 3
                , 2);
        students[2].refreshRatings();
        Group groupA = new Group(students, "Г_340143");
        groupA.refreshGroupItems();

        System.out.println("Группа:" + groupA.getName());
        System.out.println("\tколичество отличников:" + groupA.getCountOverachiever());
        System.out.println("\tколичество студентов имеющих оценки \"2\":" + groupA.getCountStudentWithMark2());
        System.out.println("\tсредний бал группы:" + groupA.getAvgGroupRating());

        System.out.println("Студенты:");
        for(int i = 0; i < students.length; i++ ){
            System.out.println(students[i].getLastName() + " " + students[i].getFirstName()+ ". Средний бал: " + students[i].getAvgRating());
        }

    }
}
