package Lesson7.by.rdcentre.javatr.lesson7;

import Lesson6.by.rdcentre.javatr.lesson6.*;

/**
 * Created by Denis on 20.03.2017.
 */
public class CollectionComparator extends Collection{
    public static void main(String args[]) {
        Edition e1 = new Book("Детская книга",
                "Сборник стихов", 1989, 11, 01, "Марина Цветаева");
        Collection col1 = new Collection("избранное Марины Цветаевой", e1);
        col1.collection.add(new Work("Вчера еще", "Марина Цветаева"));
        col1.collection.add(new Work("Мы с тобой лишь два отголоска", "Марина Цветаева"));
        col1.collection.add(new Work("Под лаской плюшевого пледа", "Марина Цветаева"));

        col1.showCollection();

        Edition e2 = new Magazine("издательство ЭКСМО", "Новый журнал",
                1900, 10, 1, 4, "Поэзия");
        Collection col2 = new Collection("стихи о любви", e2);
        col2.collection.add(new Work("Кроме Любви", "Марина Цветаева"));
        col2.collection.add(new Work("Письмо к женщине", "Сергей Есенин"));
        col2.collection.add(new Work("Я любить тебя буду можно?", "Эдуард Асадов"));

        col2.showCollection();
        //поиск в конкретном сборнике
        col1.searchRecord("Эдуард Асадов");
        col2.searchRecord("Эдуард Асадов");

    }

    public CollectionComparator(String _collectionTitle, Edition _edition) {
        super(_collectionTitle, _edition);
    }
}
