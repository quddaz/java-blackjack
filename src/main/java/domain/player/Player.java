package domain.player;

import domain.card.HandCard;
import domain.deck.CardDeck;
import domain.state.Started;
import domain.state.State;
import java.util.List;

public abstract class Player {

    protected State state;

    protected Player() {
        this.state = new Started(new HandCard());
    }

    public void deal(CardDeck cardDeck) {
        state = state.draw(cardDeck);
    }

    public int score() {
        return state.score();
    }

    public List<String> cards() {
        return state.cards();
    }

    public List<String> getInitialCards() {
        return state.getOpenCards(getOpenCardCount());
    }

    public void stay() {
        state = state.stay();
    }

    public boolean isBlackJack() {
        return state.isBlackJack();
    }

    public boolean isFinished() {
        return !state.isFinished();
    }

    public boolean isBust() {
        return state.isBust();
    }

    protected abstract int getOpenCardCount();

    public abstract String getName();

}

