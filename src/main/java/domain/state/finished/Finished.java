package domain.state.finished;

import domain.card.HandCard;
import domain.deck.CardDeck;
import domain.state.State;
import exception.BlackjackException;
import exception.ExceptionMessage;
import java.util.List;

public abstract class Finished implements State {

    protected final HandCard handCard;

    public Finished(HandCard handCard) {
        this.handCard = handCard;
    }

    @Override
    public State draw(CardDeck cardDeck) {
        throw new BlackjackException(ExceptionMessage.BLACKJACK_FINISH_ERROR);
    }

    @Override
    public State stay() {
        throw new BlackjackException(ExceptionMessage.BLACKJACK_FINISH_ERROR);
    }

    @Override
    public boolean isFinished() {
        return true;
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
