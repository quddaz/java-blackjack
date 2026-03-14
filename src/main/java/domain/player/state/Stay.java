package domain.player.state;

import domain.card.HandCard;

public class Stay extends Finished{
    public Stay(HandCard handCard) {
        super(handCard);
    }

    @Override
    public double earningRate() {
        //TODO
        return 0.0;
    }
}
