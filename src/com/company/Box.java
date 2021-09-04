package com.company;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    //Конструкторы
    public Box (ArrayList<T> fruits) {
        this.fruits = fruits;

    }
    public Box () {}

    public void pourOver(Box<T> another) {
        another.fruits = this.fruits;
        this.fruits = null;
    }

    //Метод для определения количества фруктов в корзине
    public int getSize() {
        return fruits.size();
    }
    //Геттер
    public ArrayList<T> getFruits() {
        return fruits;
    }
    //Метод добавления фрукта в корзину
    public void addFruit(T item)
    {
        fruits.add(item);
    }
    //Метод для определения веса корзины
    public float getWeight(){
        return fruits.size()* fruits.get(0).getWeight();
    }
    //Метод сравнения веса корзин
    public boolean compare(Box<?> another) {
       return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

}
