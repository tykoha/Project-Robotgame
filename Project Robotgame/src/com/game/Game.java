package com.game;

import java.util.ArrayList;

public class Game {

    public void gameloop() {

        Gameboard game = new Gameboard();
        game.gameboard();

        ZebraRobot zebra = new ZebraRobot();
        CheetahRobot cheetah = new CheetahRobot();

        ArrayList<Robot> zebras = new ArrayList<>();
        ArrayList<Robot> cheetahs = new ArrayList<>();

        zebras.add(zebra);
        cheetahs.add(cheetah);



        while(!zebras.isEmpty()){

            game.spawnRobot(zebras.get(0),cheetahs.get(0));

            game.printBoard();


            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {

            }

        }


    }

}
