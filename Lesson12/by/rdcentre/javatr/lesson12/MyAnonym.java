package Lesson12.by.rdcentre.javatr.lesson12;

/**
 * Created by Denis on 07.04.2017.
 */
public class MyAnonym {
    public static void main(String[] args){
        TypeRequest unique = new TypeRequest(){// ��������� ����� #1
                public void addNewType() {
// ����� ���������� ������
                    System.out.println(
                            "�������� ������ �� ������ �������");
                }
            };// ����� ���������� ���������� ������
        unique.addNewType();

            new TypeRequest(98732) {// ��������� ����� #2
                private String name = "Plug&Play";
                public void addNewType() {
                // ����� ���������� ������ #2
                    System.out.println("�������� " + getName());
                }
                String getName() {
                    return name;
                }
            }.addNewType();

            TypeRequest standard = new TypeRequest(335);
            standard.addNewType();
        }
    }

