package domain.state.finished;

import domain.card.HandCard;

public class Stay extends Finished {
    public Stay(HandCard handCard) {
        super(handCard);
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
