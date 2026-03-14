package domain.player.state;

import domain.card.HandCard;

public class Running extends Started {


    public Running(HandCard handCard) {
        super(handCard);
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }

}
