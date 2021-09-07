package com.company;

import java.util.*;

public class Hw4Task1 {
        public static void main(String[] args)
        {
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("world", "dog", "house", "car", "horse"
            ,"table", "windows","dog","car","chair", "water","world", "sky", "book", "computer"));

            System.out.println("\nБез повторов: ");
            Set<String> unique = new HashSet<>(arrayList);
            System.out.println(unique);

            Map<String, Integer> wordsCount = new HashMap<>();
            System.out.println("\nИнформация: ");
            for (String s : arrayList) {
                wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
            }
            System.out.println(wordsCount);

        }

}


