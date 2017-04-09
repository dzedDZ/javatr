package Lesson12.by.rdcentre.javatr.lesson12;

/**
 * Created by Denis on 07.04.2017.
 */
public class MyNested {
    public static void main(String[] args){
        MyNested out11 = new MyNested();

        MyNested.Nested1.method();
        out11.setX(5);
        System.out.println("out11 x=" + out11.x);
        MyNested.Nested1.method();
    }


    private int x;

    public void setX(int x) {
        this.x = x;
    }

    static class Nested1 {
            public static void method() {
                MyNested out = new MyNested();
                out.setX(3);
                System.out.println("out.x=" + out.x);
            }
        }
}
