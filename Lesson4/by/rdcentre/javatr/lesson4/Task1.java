package by.rdcentre.javatr.lesson4;

/**
 * Created by Denis on 24.02.2017.
 */
public class Task1 {

     public static void main(String[] args){
        final int n = 3;
        Student[] students = new Student[n];
        Customer[] customers = new Customer[n];

        students[0] = new Student(1
                , "������"
                ,"��������"
                ,"�������"
                ,2011
                ,11
                ,11
                , "����� ���������� 15"
                , "322223"
                ,"���������������"
                ,"����������������"
                , 0
                ,0
                ,0);
        students[1] = new Student(2
                , "������"
                ,"����������"
                ,"�������"
                ,1990
                ,2
                ,12
                , "������� ���������� 15/2"
                , "432234"
                ,"����� �����"
                ,"������"
                , 0
                ,0
                ,0);
        students[2] = new Student(3
                , "��������"
                ,"�����"
                ,"��������"
                ,1967
                ,9
                ,7
                , "����� ����������� 12"
                , "322000"
                ,"����� �����"
                ,"������"
                , 0
                ,0
                ,0);
        customers[0] = new Customer(1
                , "���������"
                , "����������"
                , "����"
                , "����� �����������, 456/1"
                , "5678876556788765"
                , "98790483729234214"
        );
         customers[1] = new Customer(2
                 , "���������"
                 , ""
                 , "�����"
                 , "�������� �����������, 234-23"
                 , "0987789009877890"
                 , "41242349874"
         );
         customers[2] = new Customer(3
                 , "���������"
                 , "�����������"
                 , "�����"
                 , "�������� �������, 34"
                 , "1234432112344321"
                 , "324234234234"
         );
         System.out.println("��������:");
         for (int i=0; i < students.length; i++){
             if (students[i].getLastName().equals("������") && students[i].checkAddress()){
                 System.out.println(students[i].showStudent());
             }
         }
         System.out.println("���������:");
         for (int i=0; i < customers.length; i++){
             if (customers[i].getFirstName().equals("�����") && customers[i].checkAddress()){
                 System.out.println(customers[i].showCustomer());
             }
         }

//          Student studentA;
//          studentA = new Student(1, "������","��������","�������",2011,11,11, "����� ���������� 15", "322223","���������������","����������������" );
//          System.out.println(students[0].showStudent());

    }
}
