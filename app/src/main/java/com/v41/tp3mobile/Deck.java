package com.v41.tp3mobile;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Kevin on 2018-04-24.
 */

public class Deck {
    private final Integer NB_MAX_CARDS = 20;

    private LinkedList<Card> cards;


    public Deck(LinkedList<Card> cards) {
        this.cards = cards;
    }

    public LinkedList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        if(cards.size() < NB_MAX_CARDS) {
            cards.add(card);
        }
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public Card pickRandomCard() {
        Random rand = new Random();
        return cards.get(rand.nextInt(NB_MAX_CARDS));
    }
}
