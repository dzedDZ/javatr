package by.rdcentre.javatr.lesson4;

/**
 * Created by Denis on 01.03.2017.
 */
public class Task3 {

    public static void main(String[] args) {
        final int n = 3;
        Student[] students = new Student[n];

        students[0] = new Student(1
                , "������"
                , "��������"
                , "�������"
                , 2011
                , 11
                , 11
                , "����� ���������� 15"
                , "322223"
                , "���������������"
                , "����������������"
                , 4
                , 3
                , 4);
        students[0].refreshRatings();

        students[1] = new Student(2
                , "������"
                , "����������"
                , "�������"
                , 1990
                , 2
                , 12
                , "������� ���������� 15/2"
                , "432234"
                , "����� �����"
                , "������"
                , 5
                , 0
                , 0);
        students[1].refreshRatings();

        students[2] = new Student(3
                , "��������"
                , "�����"
                , "��������"
                , 1967
                , 9
                , 7
                , "����� ����������� 12"
                , "322000"
                , "����� �����"
                , "������"
                , 5
                , 3
                , 2);
        students[2].refreshRatings();
        Group groupA = new Group(students, "�_340143");
        groupA.refreshGroupItems();

        System.out.println("������:" + groupA.getName());
        System.out.println("\t���������� ����������:" + groupA.getCountOverachiever());
        System.out.println("\t���������� ��������� ������� ������ \"2\":" + groupA.getCountStudentWithMark2());
        System.out.println("\t������� ��� ������:" + groupA.getAvgGroupRating());

        System.out.println("��������:");
        for(int i = 0; i < students.length; i++ ){
            System.out.println(students[i].getLastName() + " " + students[i].getFirstName()+ ". ������� ���: " + students[i].getAvgRating());
        }

    }
}
