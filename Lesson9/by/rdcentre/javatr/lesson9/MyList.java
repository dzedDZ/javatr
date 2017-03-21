package Lesson9.by.rdcentre.javatr.lesson9;

public class MyList<E> {

    private MyLinkedList head;       // указатель на первый элемент
    private MyLinkedList tail;       // указатель последний элемент

    void addFirst(E data)           //добавить вначале
    {
        MyLinkedList a = new MyLinkedList();  //создаём новый элемент
        a.data = data;              //инициализируем данные.
        // указатель на следующий элемент автоматически инициализируется как null
        if(head == null)            //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = a;               //т.е. список теперь состоит из одного элемента
            tail = a;
        }
        else {
            a.next = head;          //иначе новый элемент теперь ссылается на "бывший" первый
            head = a;               //а указатель на первый элемент теперь ссылается на новый элемент
        }
    }

    void addRandom(E afterData, E newData){

        MyLinkedList afterElement = new MyLinkedList();
        MyLinkedList newElement = new MyLinkedList();

        afterElement.data = afterData;
        newElement.data = newData;

        if(head == null)        //если список пуст - addFirst
            addFirst(newData);
        else {
            if (head.data.equals(afterData)) {    //если первый элемент - тот, что нам нужен
                newElement.next = head.next; //вставляем элемент после первого
                head.next = newElement;
            }
            else {
                // ищем первое вхождение и добавляем после него. Другие вхождения не реализованы
                MyLinkedList t = head;
                while (t.next != null) {    //пока следующий элемент существует
                    if (t.next.data.equals(afterData)) {  //проверяем следующий элемент
                        newElement.next = t.next.next;
                        t.next.next = newElement;
                        return;
                    }
                    t = t.next;                //иначе ищем дальше
                }
            }
        }
    }



    void addLast(E data) {          //добавление в конец списка
        MyLinkedList a = new MyLinkedList();  //создаём новый элемент
        a.data = data;
        if (tail == null)           //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = a;               //т.е. список теперь состоит из одного элемента
            tail = a;
        } else {
            tail.next = a;          //иначе "старый" последний элемент теперь ссылается на новый
            tail = a;               //а в указатель на последний элемент записываем адрес нового элемента
        }
    }

    void printMyList()                //печать списка
    {
        MyLinkedList t = head;       //получаем ссылку на первый элемент
        while (t != null)           //пока элемент существуе
        {
            System.out.print(t.data + " "); //печатаем его данные
            t = t.next;                     //и переключаемся на следующий
        }
    }

    void searchMyList(E data){
        if(head == null)        //если список пуст -
            return;             //ничего не делаем
        if (head.data.equals(data)) {    //если первый элемент - тот, что нам нужен
            System.out.print(head.data + " ");//и выходим
        }
        MyLinkedList t = head;       //иначе начинаем искать
        while (t.next != null) {    //пока следующий элемент существует
            if (t.next.data.equals(data)) {  //проверяем следующий элемент
                System.out.print(t.next.data);
            }
            t = t.next;                //иначе ищем дальше
        }
    }

    void delElement(E data)          //удаление элемента
    {
        if(head == null)        //если список пуст -
            return;             //ничего не делаем

        if (head == tail) {     //если список состоит из одного элемента
            head = null;        //очищаем указатели начала и конца
            tail = null;
            return;             //и выходим
        }

        if (head.data.equals(data)) {    //если первый элемент - тот, что нам нужен
            head = head.next;       //переключаем указатель начала на второй элемент
            return;                 //и выходим
        }

        MyLinkedList t = head;       //иначе начинаем искать
        while (t.next != null) {    //пока следующий элемент существует
            if (t.next.data.equals(data)) {  //проверяем следующий элемент
                if(tail == t.next)      //если он последний
                {
                    tail = t;           //то переключаем указатель на последний элемент на текущий
                }
                t.next = t.next.next;   //найденный элемент выкидываем
                return;                 //и выходим
            }
            t = t.next;                //иначе ищем дальше
        }
    }
}
