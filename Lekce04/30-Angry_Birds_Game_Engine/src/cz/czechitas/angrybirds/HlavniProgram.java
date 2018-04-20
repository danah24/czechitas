package cz.czechitas.angrybirds;

import java.awt.event.*;
import cz.czechitas.angrybirds.api.*;

public class HlavniProgram {

    public void run() {
        AngryRed cervenyPtak;
        SoldierPig prase;

        Brain mozek = new KeyboardBrain();
        Brain praseciMozek = new KeyboardBrain(KeyEvent.VK_A, KeyEvent.VK_W, KeyEvent.VK_D, KeyEvent.VK_S);

        cervenyPtak = new AngryRed(2, 1);
        cervenyPtak.setBrain(mozek);

        prase = new SoldierPig(7, 7);
        prase.setBrain(praseciMozek);

        PostavBludiste();

    }
    public void PostavBludiste() {

        for (int i = 0; i < 10; i++) {
            new Wall(i, 0);
            new Wall(i, 10);
        }
        for (int j = 1; j < 10; j++) {
            new Wall(9, j);
            new Wall(0, j);
        }
        new Wall(1, 1);
        new Wall(1, 2);
        new Wall(1, 3);
        new Wall(1, 4);
        new Wall(2, 3);
        new Wall(3, 1);
        new Wall(3, 3);
        new Wall(3, 4);
        new Wall(5, 1);
        new Wall(6, 1);
        new Wall(6, 4);
        new Wall(8, 2);
    }
}
