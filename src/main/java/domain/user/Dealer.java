package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * 게임 딜러를 의미하는 객체
 */
public class Dealer {
    private final List<Card> cards =  new ArrayList<>();

    public Dealer() {}
    
    
    public List<Card> getCards(){
    	return this.cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void printCard() {
    	System.out.print("딜러:");
    	for(Card card:cards) {
    		card.printCard();
    	}
    	System.out.println();
    }
   
}
