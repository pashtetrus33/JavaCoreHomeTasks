package com.company;
import java.util.Arrays;

public class HomeTask2 {

    private static final int ARRAY_SIZE =4;

    public static void myArray (String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != ARRAY_SIZE)
            throw new MyArraySizeException("Невернй размер двумерного массива (Неверное число строк)!");

        for (String[] col : arr) {
            if (col.length != ARRAY_SIZE)
                throw new MyArraySizeException("Невернй размер двумерного массива (Неверное число элементов в одной из строк)!");
        }

        int sum =0;

        for (int i=0; i< arr.length; i++) {
            for (int j=0; j< arr[0].length; j++){
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i,j);
                }
            }


        }

        System.out.println("Cумма всех элементов двумерного массива равна: " + sum);

    }
    public static void main(String[] args) {
    String[][] array = new String[][]
            {
            {"8", "2", "6", "8"},
            {"7", "2", "6", "3"},
            {"5", "0", "4", "8"},
            {"9", "2", "1","3"}
            };

        System.out.println("Наш двумернй массив: " + Arrays.deepToString(array));
        try {
        myArray(array);
        } catch (MyArraySizeException e1) {
            e1.printStackTrace();
        } catch (MyArrayDataException e2) {
            System.out.println(" В ячейке двумерного массива находится не число! В позиции i = " + e2.getX()+"; j = " + e2.getY() + ".");
        }
    }

}
