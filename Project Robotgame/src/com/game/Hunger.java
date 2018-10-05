package com.game;

public enum Hunger {

    HUNGRY(true),
    FULL(false);

    final boolean hungerState;

    private Hunger(boolean hungerState) {
        this.hungerState = hungerState;
    }


}
