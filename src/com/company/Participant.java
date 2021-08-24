package com.company;

public interface Participant {
    String getName();
    boolean isOnDistance();
    void run(int distance);
    void jump(int height);
    void info();
    void getResult();
}
