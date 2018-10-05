package com.game;

public class Gameboard {

    final int GAME_SIZE = 30;

    String[][] gameboard = new String[GAME_SIZE][GAME_SIZE];

    String defaultTile = " |";
    String cheetahTile = "C|";
    String zebraTile = "Z|";

    public int getGAME_SIZE(){
        return GAME_SIZE - 1;
    }

    public void gameboard() {

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard.length; j++) {
                gameboard[i][j] = defaultTile;
            }
        }
    }

    public void spawnRobot(Robot z, Robot c){


            gameboard[z.getCoordX()][z.getCoordY()] = defaultTile;
            z.doRun();
            gameboard[z.getCoordX()][z.getCoordY()] = zebraTile;

            gameboard[c.getCoordX()][c.getCoordY()] = defaultTile;
            c.doRun();
            gameboard[c.getCoordX()][c.getCoordY()] = cheetahTile;


    }



    public void printBoard() {


        for (int i = 0; i < gameboard.length; i++) {
            System.out.print("|");
            for (int j = 0; j < gameboard.length; j++) {
                System.out.printf("%s", gameboard[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


}
