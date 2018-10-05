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

        double angle;

        angle = rnd.nextInt(4)*(Math.PI/2); //Randomize trajectory angle
        
        //Using polar coordinates:

        if ((getCoordX() + getSpeed()*(int)Math.round(Math.cos(angle)) >= 0) && (getCoordX() + getSpeed()*Math.round(Math.cos(angle)) <= 29)) {
            setCoordX(getCoordX() + getSpeed()*(int)Math.round(Math.cos(angle)));
        }

        angle = rnd.nextInt(4)*(Math.PI/2);

        if ((getCoordY() + getSpeed()*(int)Math.round(Math.sin(angle)) >= 0) && (getCoordY() + getSpeed()*Math.round(Math.sin(angle)) <= 29)) {
            setCoordY(getCoordY() + getSpeed()*(int)Math.round(Math.sin(angle)));
            }



    }
}
