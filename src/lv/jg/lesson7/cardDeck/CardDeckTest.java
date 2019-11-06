package lv.jg.lesson7.cardDeck;

import org.w3c.dom.ls.LSOutput;
import javax.crypto.spec.PSource;


public class CardDeckTest {
    public static void main(String[] args) {

        CardDeck deck = new CardDeck();
        CardDeckUtils.print(deck);
        deck.shuffle();
        CardDeckUtils.print(deck);

    }
}
