package net.sevecek;

import java.security.cert.*;
import net.sevecek.angrybirds.engine.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        AngryBird cervenyPtak;
        AngryBird bilyPtak;

        cervenyPtak = new AngryBird(BirdType.RED);
        cervenyPtak.move();
        cervenyPtak.turnLeft();
        cervenyPtak.move();
        cervenyPtak.turnRight();
        cervenyPtak.move();
        bilyPtak = new AngryBird(BirdType.MATILDA);
        bilyPtak.turnLeft();
        bilyPtak.move();
        bilyPtak.turnLeft();
        bilyPtak.move();
        bilyPtak.turnRight();
        bilyPtak.move();
    }

}
