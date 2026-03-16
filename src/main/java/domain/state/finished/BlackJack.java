package domain.state.finished;

import domain.card.HandCard;
import domain.state.FinishType;

public class BlackJack extends Finished {
    public BlackJack(HandCard handCard) {
        super(handCard);
    }

    @Override
    public FinishType type() {
        return FinishType.BLACKJACK;
    }

    @Override
    public boolean isBlackJack() {
        return true;
    }

    @Override
    public boolean isBust() {
        return false;
    }

}
