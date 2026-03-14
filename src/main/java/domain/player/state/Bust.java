package domain.player.state;

import domain.card.HandCard;

public class Bust extends Finished{
    public Bust(HandCard handCard) {
        super(handCard);
    }

    @Override
    public double earningRate() {
        return -1.0;
    }
}
