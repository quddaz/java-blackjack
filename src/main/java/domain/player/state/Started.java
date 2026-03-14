package domain.player.state;

import domain.card.HandCard;
import domain.deck.CardDeck;
import java.util.List;

public class Started implements State{
    protected final HandCard handCard;

    public Started(HandCard handCard) {
        this.handCard = handCard;
    }

    @Override
    public State draw(CardDeck cardDeck) {
        handCard.addCard(cardDeck.deal());
        if(handCard.isBlackJack()) return new BlackJack(handCard);
        return new Hit(handCard);
    }

    @Override
    public boolean isFinished(){
        return false;
    }


    @Override
    public List<String> cards() {
        return handCard.cards();
    }

    @Override
    public int profit(int dealerScore) {
        return 0;
    }

    @Override
    public State stay() {
        return new Stay(handCard);
    }
}
