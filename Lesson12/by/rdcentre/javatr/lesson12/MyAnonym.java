package Lesson12.by.rdcentre.javatr.lesson12;

/**
 * Created by Denis on 07.04.2017.
 */
public class MyAnonym {
    public static void main(String[] args){
        TypeRequest unique = new TypeRequest(){// анонимный класс #1
                public void addNewType() {
// новая реализация метода
                    System.out.println(
                            "добавлен вопрос со пустым ответом");
                }
            };// конец объявления анонимного класса
        unique.addNewType();

            new TypeRequest(98732) {// анонимный класс #2
                private String name = "Plug&Play";
                public void addNewType() {
                // новая реализация метода #2
                    System.out.println("добавлен " + getName());
                }
                String getName() {
                    return name;
                }
            }.addNewType();

            TypeRequest standard = new TypeRequest(335);
            standard.addNewType();
        }
    }

