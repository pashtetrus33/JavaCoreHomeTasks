package com.company;

public class Human implements Participant{

    private String name;
    private boolean onDistance;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно преодолел беговую дорожку");
        } else {
            System.out.println(name + " не справился с беговой дорожкой");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул стену");
        } else {
            System.out.println(name + " не справился с прыжком");
            onDistance = false;
        }
    }

    @Override
    public void info() {
        System.out.println("Человек " + name);
    }
    @Override
    public void getResult() {
        System.out.println("Человек " + name + " : " + (isOnDistance() ? "прошел препятствия" : "сошел с дистанции"));
    }
    }



