package com.company;

public class TreadMill extends Obstacle {
    private int length;

    public TreadMill(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(length);
    }
}
