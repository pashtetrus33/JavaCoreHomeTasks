package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class H4Task2 {

    public static void main (String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Баканов", "89609998877");
        phoneBook.add("Иванов", "89208787111");
        phoneBook.add("Петров", "89609888877");
        phoneBook.add("Сидоров", "89609558877");
        phoneBook.add("Сидоров", "343463");
        phoneBook.add("Сидоров", "7776665");
        System.out.println(phoneBook);
        System.out.println(phoneBook.get("Сидоров"));
    }
}

class PhoneBook {
    private HashMap<String,ArrayList<String>> phoneBook = new HashMap<>();
    public PhoneBook (){
    }

    public void add(String surname, String phoneNumber) {
        ArrayList<String> phonesSurname = phoneBook.getOrDefault(surname, new ArrayList<>());
        phonesSurname.add(phoneNumber);
        phoneBook.put(surname, phonesSurname);
    }

    public ArrayList<String> get(String a) {
        return phoneBook.get(a);
    }

    @Override
    public String toString() {
        return "PhoneBook {" +
                "phoneBook= " + phoneBook +
                '}';
    }
}
