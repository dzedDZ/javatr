package Lesson12.by.rdcentre.javatr.lesson12;

/**
 * Created by Denis on 07.04.2017.
 */
public class MyOuter {
    public static void main(String[] args){
        MyOuter outer = new MyOuter();
        outer.callMethod();

        MyInner inner = outer.new MyInner();
        inner.innerMethod();

    }
    int x;
    MyInner inner;
    MyOuter(){
        x = 10;
        inner = new MyInner();
    }
    class MyInner{
        final static int x = 11;
        int xInner;
        MyInner(){
            xInner = 9;
        }
        public void innerMethod(){
            System.out.println("variable X in innner class " + xInner);
        }
    }
    public void callMethod(){
        System.out.println("X: in outer class = " + x);
        System.out.println("X: in inner class [final static] " + MyInner.x);

    }
}
