package com.company;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Мечта");
        team.add(new Human("Иван", 300,3));
        team.add(new Robot("R2D2",800,6));
        team.add(new Cat("Муся",10, 2));
        team.add(new Human("Сергей",500,5));


        Course c = new Course();
        c.add(new TreadMill(400));
        c.add(new Wall(6));

        team.getInfo();
        c.doIt(team);

        team.getResults();


    }
}
