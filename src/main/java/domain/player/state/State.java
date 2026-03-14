package domain.player.state;

import domain.deck.CardDeck;
import java.util.List;

public interface State {

    public State draw(CardDeck cardDeck);
    public boolean isFinished();
    public List<String> cards();

    public int profit(int dealerScore);

    public State stay();
}
