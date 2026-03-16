package domain.state.finished;

import domain.card.HandCard;

public class Bust extends Finished {
    public Bust(HandCard handCard) {
        super(handCard);
    }

    @Override
    public boolean isBlackJack() {
        return false;
    }

    @Override
    public boolean isBust() {
        return true;
    }
}
