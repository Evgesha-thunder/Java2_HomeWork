package homework1;

import java.util.*;

//Задание 2

public class NumberNotes {
    HashMap<String, List<String>> numbers = new LinkedHashMap<>();

void add(String name, String number) {
        List<String> numbersList = new LinkedList<>();
        if (numbers.get(name) == null) {
            numbersList.add(number);
        } else {
            numbersList = numbers.get(name);
            numbersList.add(number);
        }
        numbers.put(name, numbersList);

    }



    List<String> get(String name) {
        return numbers.get(name);
    }
}
