package Lesson9.by.rdcentre.javatr.lesson9;

/**
 * Created by Denis on 21.03.2017.
 */
public class Test {
    public static void main(String args[]){
        MyList ml = new MyList();
        ml.addRandom(2, 169);
        ml.addLast(1.0);
        ml.addLast(2);
        ml.addLast("brrr");
        ml.addFirst(6);
        ml.addFirst(2);

        ml.printMyList();
        System.out.println();
        System.out.println("Удаление 1.0");

        ml.delElement(1.0);

        ml.printMyList();
        System.out.println();
        ml.addLast(1.0);
        ml.printMyList();
        System.out.println();

        System.out.println("Поиск 1.0");

        ml.searchMyList(1.0);
        System.out.println();

        System.out.println("Добавить после 2, 34");
        ml.addRandom(2, 34);
        ml.printMyList();
        System.out.println();

    }
}
