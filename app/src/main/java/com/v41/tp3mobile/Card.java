package com.v41.tp3mobile;

/**
 * Created by Kevin on 2018-04-24.
 */

public class Card {

    private Integer defense;
    private Integer attack;
    private String imgPath;

    public Card(int attack, int defense, String imgPath) {
        this.attack = attack;
        this.defense = defense;
        this.imgPath = imgPath;
    }
}
