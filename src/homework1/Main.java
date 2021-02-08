package homework1;

import java.util.*;

public class Main {
    //1 Задание
    public static void main(String[] args) {
        String[] words = {"sorry", "horror", "sorry", "horror", "misery", "misery", "misery", "sorry", "color", "garbage", "lory", "locon", "savage", "beauty", "god", "robot", "terror", "sorry", "mask", "sweety", "fats", "sorry", "sorry"};

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int val = map.getOrDefault(words[i], 0);
            map.put(words[i], val + 1);

        }
        System.out.println(map);
        Set<String> set = new HashSet<>();
        for (int j = 0; j < words.length; j++) {
            set.add(words[j]);
        }

        System.out.println(set);






    }
}








