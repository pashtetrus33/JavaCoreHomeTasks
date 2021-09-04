package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        BoxWithObjects<Integer> iBoxWithNumbers = new BoxWithObjects<>(1, 2, 3, 4, 5);
        BoxWithObjects<String> iBoxWithStrings = new BoxWithObjects<>("Hello", "my", "World", "!!!");
        System.out.println(iBoxWithNumbers);
        System.out.println(iBoxWithStrings);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс первого элемента который надо пересатвить:");
        int index1 = scanner.nextInt();
        System.out.println("Введите индекс второго элемента который надо пересатвить:");
        int index2 = scanner.nextInt();

        iBoxWithNumbers.changeTwoElements(index1,index2);
        System.out.println(iBoxWithNumbers);
        iBoxWithStrings.changeTwoElements(index1,index2);
        System.out.println(iBoxWithStrings);
        scanner.close();
    }
}
class BoxWithObjects<T> {
    private T[] objs;

    public BoxWithObjects(T... objs) {
        this.objs = objs;
    }

    public void changeTwoElements(int i, int j) {
        if (i < objs.length && j < objs.length)
        {
        T temp =  objs[i];
        objs[i] = objs[j];
        objs[j]= temp;
        } else System.out.println("Выход за пределы массива обьектов, длина массива - " + objs.length);

    }
    public String toString() {
        String array = "";
        for (int i=0; i< objs.length; i++)
        {
            array +=(" " +objs[i]);
        }
        return array;
    }

}






