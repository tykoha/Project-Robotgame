package com.game;

public class CheetahRobot extends Robot {

    public CheetahRobot() {
        super(29, 29);
        Hunger hungerState = Hunger.HUNGRY;
        setSpeed(2);
    }

    public CheetahRobot(int coordX, int coordY) {
        super(coordX, coordY);
        Hunger hungerState = Hunger.HUNGRY;
        setSpeed(2);
    }


    @Override
    public void doRun(){




    }
}
