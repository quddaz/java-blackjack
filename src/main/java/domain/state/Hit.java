package domain.state;

import domain.card.HandCard;
import domain.deck.CardDeck;
import domain.state.finished.Bust;
import domain.state.finished.Stay;
import java.util.List;

public class Hit implements State {

    private final HandCard handCard;

    public Hit(HandCard handCard) {
        this.handCard = handCard;
    }

    @Override
    public State draw(CardDeck cardDeck) {
        handCard.addCard(cardDeck.deal());
        if (handCard.isBust()) {
            return new Bust(handCard);
        }
        return this;
    }

    @Override
    public Stay stay() {
        return new Stay(handCard);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean isBlackJack() {
        return false;
    }

    @Override
    public boolean isBust() {
        return false;
    }

    @Override
    public int score() {
        return handCard.score();
    }

    @Override
    public List<String> cards() {
        return handCard.cards();
    }

    @Override
    public List<String> getOpenCards(int count) {
        return handCard.getOpenCards(count);
    }

}
