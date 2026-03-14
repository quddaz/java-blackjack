package domain.player.state;

import domain.card.HandCard;
import domain.deck.CardDeck;

public class Hit extends Running{
    public Hit(HandCard handCard) {
        super(handCard);
    }

    @Override
    public State draw(CardDeck cardDeck) {
        handCard.addCard(cardDeck.deal());
        if(handCard.isBust()) return new Bust(handCard);
        return this;
    }

}
