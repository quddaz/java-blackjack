package domain.state.finished;

import domain.card.HandCard;

public class BlackJack extends Finished {
    public BlackJack(HandCard handCard) {
        super(handCard);
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
