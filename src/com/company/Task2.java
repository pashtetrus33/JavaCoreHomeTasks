package com.company;

import javax.crypto.NullCipher;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Apple> appleList = new ArrayList<Apple>();

        System.out.println("Введите количество яблок в коробке: ");
        int countApples = scanner.nextInt();
        for (int i=0; i<countApples; i++) {
            appleList.add(new Apple(1));
        }
        // Создаем коробку с яблоками
        Box<Apple> boxOfApples1 = new Box<>(appleList);

        ArrayList<Orange> orangeList = new ArrayList<Orange>();
        System.out.println("Введите количество апельсинов в коробке: ");
        int countOranges = scanner.nextInt();
        for (int i=0; i<countOranges; i++) {
            orangeList.add(new Orange(1.5f));
        }
        //Создаем коробку с апельсинами
        Box<Orange> boxOfOranges1 = new Box<>(orangeList);
        System.out.println("Количество яблок в коробке1: " + boxOfApples1.getSize());
        System.out.println("Количество апельсинов в коробке1: " + boxOfOranges1.getSize());
        //Добавляем яблоко в корзину
        System.out.println();
        boxOfApples1.addFruit(new Apple(1));
        //Добавляем апельсин в корзину
        boxOfOranges1.addFruit(new Orange(1.5f));
        System.out.println("Количество яблок в коробке1: " + boxOfApples1.getSize());
        System.out.println("Количество апельсинов в коробке1: " + boxOfOranges1.getSize());

        System.out.println("Вес коробки1 с яблоками: " + boxOfApples1.getWeight() );
        System.out.println("Вес коробки1 с апельсинами: " + boxOfOranges1.getWeight() );

        if (boxOfApples1.compare(boxOfOranges1)) {
           System.out.println("Вес коробок одинаковый");
        } else {
            System.out.println("Вес коробок отличается");
        }
        Box<Apple> boxOfApples2 = new Box<>();
        Box<Orange> boxOfOranges2 = new Box<>();
        boxOfApples1.pourOver(boxOfApples2);
        boxOfOranges1.pourOver(boxOfOranges2);
        try {
            System.out.println("Количество яблок в коробке2: " + boxOfApples2.getSize());
            System.out.println("Количество апельсинов в коробке2: " + boxOfOranges2.getSize());
            System.out.println("Количество яблок в коробке1: " + boxOfApples1.getSize());
            System.out.println("Количество апельсинов в коробке1: " + boxOfOranges1.getSize());
        } catch (NullPointerException e) {
            System.out.println("Коробка пустая");
        }

        }
}
