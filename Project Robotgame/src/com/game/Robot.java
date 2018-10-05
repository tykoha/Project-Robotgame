package com.game;

public abstract class Robot implements IfMovement {

    private int coordX, coordY;
    private int speed;

    public Robot() {
        setSpeed(1);
    }

    public Robot(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        setSpeed(1);
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void doRun() {




    }
}
