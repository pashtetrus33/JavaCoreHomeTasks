package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Team implements Iterable <Participant>  {
    private String name;
    private List<Participant> participants = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }


    public void add(Participant participant) {

        if (participant == null)
            throw new IllegalArgumentException("competitor == null");

        participants.add(participant);
    }
    public String getName () {
        return name;
    }
    public void getResults() {

        System.out.println("\nКоманда \"" + name +  "\" результаты: ");

        for (Participant participant : participants) {
            participant.getResult();
           }
        for (Participant participant : participants)
        if (participant.isOnDistance())
            System.out.println("\nПобедитель: " + participant.getName());


    }
    public void getInfo() {

        System.out.println("\nКоманда \"" + name + "\": ");

        for (Participant participant : participants) {
            participant.info();
        }

    }

    @Override
    public Iterator<Participant> iterator() {
        return participants.iterator();
    }
}

