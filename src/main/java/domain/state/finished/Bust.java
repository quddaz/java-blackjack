package domain.state.finished;

import domain.card.HandCard;
import domain.state.FinishType;

public class Bust extends Finished {
    public Bust(HandCard handCard) {
        super(handCard);
    }

    @Override
    public FinishType type() {
        return FinishType.BUST;
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
