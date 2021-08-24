package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Obstacle> list = new ArrayList<>();


    public void add(Obstacle obstacle) {

        if (obstacle == null)
            throw new IllegalArgumentException("obstacle == null");

        list.add(obstacle);
    }
    public void doIt(Team team) {

        System.out.println("\nПрохождение перпятствий командой \"" + team.getName() + "\":");

        for (Participant p : team) {

            for (Obstacle obstacle : list) {

                obstacle.doIt(p);

                // Выбыл с трассы
                if (!p.isOnDistance())
                {
                    System.out.println(p.getName()  + " выбыл(а) с трассы ");
                    break;
                }
            }
        }
    }


}
