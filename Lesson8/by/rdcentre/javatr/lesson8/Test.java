package Lesson8.by.rdcentre.javatr.lesson8;

/**
 * Created by Denis on 22.03.2017.
 */
public class Test {
    public static void main(String[] args){
        MySet ms = new MySet();
        ms.addElement(10000);
        ms.addElement(1.0);
        ms.addElement("dynamo");
        ms.addElement("Spring will come soon");
        ms.addElement(1111);
      //  ms.showMySet();
       ms.addElement(5);
        ms.addElement(5);
        ms.showMySet();

    }
}
