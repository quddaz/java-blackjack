package domain.player.state;

import domain.card.HandCard;

public class BlackJack extends Finished{
    public BlackJack(HandCard handCard) {
        super(handCard);
    }

    @Override
    public double earningRate() {
        return 1.5;
    }
}
