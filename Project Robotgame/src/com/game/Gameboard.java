package com.game;

public class Gameboard {

    final int GAME_SIZE = 30;

    String[][] gameboard = new String[GAME_SIZE][GAME_SIZE];

    String defaultTile = " |";
    String cheetahTile = "C|";
    String zebraTile = "Z|";

    public void gameboard() {

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard.length; j++) {
                gameboard[i][j] = defaultTile;
            }
        }
    }

    public void spawnRobot(){

        ZebraRobot z = new ZebraRobot();

        CheetahRobot c = new CheetahRobot();

        gameboard[c.getCoordX()][c.getCoordY()] = cheetahTile;

        gameboard[z.getCoordX()][z.getCoordY()] = zebraTile;


    }


    public void printBoard() {

        System.out.println();
        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard.length; j++) {
                System.out.printf("%s", gameboard[i][j]);
            }
            System.out.println();
        }
    }


}