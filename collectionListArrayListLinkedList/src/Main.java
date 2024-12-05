import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] strings = {"red", "orange", "yellow", "green", "blue", "purple", "white", "black"};
        ArrayList<String> arrayList = new ArrayList<>(List.of(strings));
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(integers));
        System.out.println(searchingForElementInList(arrayList, "red"));
        System.out.println(swapsFirstAndLastElementsList(linkedList));
    }

    /*
    Создайте ArrayList, содержащий разные цвета, тип элемента этого динамического массива – String.
    Напишите метод для поиска элемента в списке, содержащем эти цвета.
    На вход метод принимает параметр поиска.
    Например, если список содержит «red», «blue», «green» и в аргументы метода передать «red»,
    то метод должен вернуть true, символизируя то, что этот цвет содержится в списке.
    */
    public static boolean searchingForElementInList(ArrayList<String> arrayList, String strSearch){

        return arrayList.contains(strSearch);
    }

    /*
    Создайте LinkedList, содержащий целые числа, т.е. Integer.
    Напишите метод, который меняет местами первый и последний элементы этого списка и возвращает этот список
    в новом виде. Т.е., если создали список [1, 2, 3, 4, 5], то в результате должны получить [5, 2, 3, 4, 1].
    */
    public static LinkedList<Integer> swapsFirstAndLastElementsList(LinkedList<Integer> linkedList){
        if (linkedList.isEmpty()) return new LinkedList<>();
        Integer tmp = linkedList.getFirst();
        linkedList.set(0, linkedList.getLast());
        linkedList.set(linkedList.size() - 1, tmp);
        return linkedList;
    }
}
