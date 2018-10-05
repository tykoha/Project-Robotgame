package com.game;

import java.util.Random;

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

        Random rnd = new Random();

        int rndNum;

            rndNum = rnd.nextInt(3) - 1;

            if ((getCoordX() + (rndNum * getSpeed()) >= 0) && (getCoordX() + (rndNum * getSpeed()) <= 29)) {
                setCoordX(getCoordX() + (rndNum * getSpeed()));
            }

            rndNum = rnd.nextInt(3) - 1;

            if ((getCoordY() + (rndNum * getSpeed()) >= 0) && (getCoordY() + (rndNum * getSpeed()) <= 29)) {
                setCoordY(getCoordY() + (rndNum * getSpeed()));
            }



    }
}
