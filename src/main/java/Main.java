import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("Барсик",3.0), new Cat("Мурзик",1.3), new Cat("Пушок",10.2),new Cat("Катзилла",0.4)));
        List cats1 = new ArrayList<>(List.of(new Cat("Барсик",3.0), new Cat("Мурзик",1.3), new Cat("Пушок",10.2),new Cat("Катзилла",0.4)));

        Iterator <Cat> catIterator = cats.iterator();
        System.out.println("Исходный список");
        while (catIterator.hasNext()) {
            System.out.println(catIterator.next().toString());
        }
        System.out.println();
        System.out.println("Список котов, отсортированный по весу");
        Collections.sort(cats1);

        Iterator<Cat> catIterator1 = cats1.iterator();
        while (catIterator1.hasNext()) {
            System.out.println(catIterator1.next().toString());
        }
        }
    }

