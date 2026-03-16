package domain.state.finished;

import domain.card.HandCard;
import domain.state.FinishType;

public class Stay extends Finished {
    public Stay(HandCard handCard) {
        super(handCard);
    }

    @Override
    public FinishType type() {
        return FinishType.STAY;
    }

    @Override
    public boolean isBlackJack() {
        return false;
    }

    @Override
    public boolean isBust() {
        return false;
    }
}
