package domain.state;

import domain.deck.CardDeck;
import java.util.List;

public interface State {
    State draw(CardDeck cardDeck);

    State stay();

    boolean isFinished();

    boolean isBlackJack();

    boolean isBust();

    int score();

    List<String> cards();

    List<String> getOpenCards(int count);
}
