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
                , "Иванов"
                ,"Петрович"
                ,"Виталий"
                ,2011
                ,11
                ,11
                , "малая арнаутская 15"
                , "322223"
                ,"НичегоНеделания"
                ,"подготовительный"
                , 0
                ,0
                ,0);
        students[1] = new Student(2
                , "Петров"
                ,"Витальевич"
                ,"Виталий"
                ,1990
                ,2
                ,12
                , "большая арнаутская 15/2"
                , "432234"
                ,"Умных вещей"
                ,"первый"
                , 0
                ,0
                ,0);
        students[2] = new Student(3
                , "Горбунов"
                ,"Федор"
                ,"Петрович"
                ,1967
                ,9
                ,7
                , "малая касательная 12"
                , "322000"
                ,"Умных вещей"
                ,"второй"
                , 0
                ,0
                ,0);
        customers[0] = new Customer(1
                , "Васильева"
                , "Николаевна"
                , "Нина"
                , "улица Основателей, 456/1"
                , "5678876556788765"
                , "98790483729234214"
        );
         customers[1] = new Customer(2
                 , "Николаева"
                 , ""
                 , "Ольга"
                 , "проспект Космонавтов, 234-23"
                 , "0987789009877890"
                 , "41242349874"
         );
         customers[2] = new Customer(3
                 , "Грибалева"
                 , "Викентьевна"
                 , "Ольга"
                 , "проспект Пушкина, 34"
                 , "1234432112344321"
                 , "324234234234"
         );
         System.out.println("Студенты:");
         for (int i=0; i < students.length; i++){
             if (students[i].getLastName().equals("Петров") && students[i].checkAddress()){
                 System.out.println(students[i].showStudent());
             }
         }
         System.out.println("Заказчики:");
         for (int i=0; i < customers.length; i++){
             if (customers[i].getFirstName().equals("Ольга") && customers[i].checkAddress()){
                 System.out.println(customers[i].showCustomer());
             }
         }

//          Student studentA;
//          studentA = new Student(1, "Иванов","Петрович","Виталий",2011,11,11, "малая арнаутская 15", "322223","НичегоНеделания","подготовительный" );
//          System.out.println(students[0].showStudent());

    }
}
