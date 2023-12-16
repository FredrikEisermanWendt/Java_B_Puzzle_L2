package com.Fredrik.demo.Puzzle;

import java.util.ArrayList;
import java.util.List;

public class CardGameTest {

    public static void main(String[] args) {

        DeckOfCards dc = new DeckOfCards();
        List<Player> playerList = new ArrayList<>();
        Player p = new Player("Kalle" , 1 );

//        test for drawCard();
        for (int i = 0; i < 53; i++){
            System.out.println(i + 1);
            p.drawCard();
        }




    }
}
