package by.rdcentre.javatr.lesson4;

/**
 * Created by Denis on 02.03.2017.
 * Имеется список абитуриентов (класс Abiturient) и список оценок, полученных ими на
 вступительных экзаменах. Напечатать список поступивших, если число мест меньше
 числа абитуриентов
 */
public class Task4 {
    public static void main(String[] args){
        int n = 3; // count of university places
        Abiturient[] abiturient = new Abiturient[5]; // there are 5 abiturients

        abiturient[0] = new Abiturient("Петрович", "Иван");
        abiturient[0].setMarkExam1(4);
        abiturient[0].setMarkExam2(5);
        abiturient[0].setMarkExam3(2);
        abiturient[0].setMarkExam4(3);
        abiturient[0].refreshRatings();

        abiturient[1] = new Abiturient("Василевич", "Юлия");
        abiturient[1].setMarkExam1(5);
        abiturient[1].setMarkExam2(5);
        abiturient[1].setMarkExam3(3);
        abiturient[1].setMarkExam4(3);
        abiturient[1].refreshRatings();

        abiturient[2] = new Abiturient("Гамеза", "Сергей");
        abiturient[2].setMarkExam1(4);
        abiturient[2].setMarkExam2(5);
        abiturient[2].setMarkExam3(5);
        abiturient[2].setMarkExam4(5);
        abiturient[2].refreshRatings();

        abiturient[3] = new Abiturient("Сидорович", "Юнона");
        abiturient[3].setMarkExam1(4);
        abiturient[3].setMarkExam2(3);
        abiturient[3].setMarkExam3(3);
        abiturient[3].setMarkExam4(3);
        abiturient[3].refreshRatings();

        abiturient[4] = new Abiturient("Остапенко", "Вадим");
        abiturient[4].setMarkExam1(4);
        abiturient[4].setMarkExam2(3);
        abiturient[4].setMarkExam3(4);
        abiturient[4].setMarkExam4(4);
        abiturient[4].refreshRatings();

        sortArray(abiturient);
        System.out.println("Список поступивших абитуриентов:");
        for(int i = 0; i < n; i++) {
            System.out.println(abiturient[i].showAbiturient() + "средняя оценка:" + abiturient[i].getAvgRating());
        }
    }
    public static void sortArray(Abiturient[] mas) {
        int maxValueIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            maxValueIndex = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j].getAvgRating() > mas[maxValueIndex].getAvgRating()) {
                    maxValueIndex = j;
                }
            }
            Abiturient temp = mas[i];
            mas[i] = mas[maxValueIndex];
            mas[maxValueIndex] = temp;
        }
    }
}

