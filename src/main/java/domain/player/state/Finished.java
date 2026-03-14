package domain.player.state;

import domain.card.HandCard;
import domain.deck.CardDeck;
import exception.BlackjackException;
import exception.ExceptionMessage;
import java.util.List;

public class Finished implements State {

    protected final HandCard handCard;

    public Finished(HandCard handCard) {
        this.handCard = handCard;
    }
    @Override
    public State draw(CardDeck cardDeck) {
        throw new BlackjackException(ExceptionMessage.BLACKJACK_FINISH_ERROR);
    }
    @Override
    public boolean isFinished() {
        return true;
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

    public double earningRate() {
        return 0;
    }
}
