package net.sevecek.turtle;

import java.awt.*;
import jdk.nashorn.internal.ir.*;
import net.sevecek.turtle.engine.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Turtle zofka;
        //triangl
        zofka = new Turtle();
        for (int i = 0; i < 3; i++) {
            zofka.move(50);
            zofka.turnRight(120.0);
        }

        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        // osmihran
        for (int j = 0; j < 8; j++) {
            zofka.move(50);
            zofka.turnRight(45.0);
        }

        zofka.penUp();
        zofka.turnRight(225.0);
        zofka.move(350);
        zofka.turnRight(45.0);
        zofka.move(300);
        zofka.turnLeft(90.0);

        //podpis
        zofka.penDown();
        zofka.move(110);
        zofka.turnLeft(90.0);
        for (int k = 0; k < 180; k++) {
            zofka.move(1);
            zofka.turnLeft(1.0);
        }

        zofka.penUp();
        zofka.turnLeft(115.0);
        zofka.move(130);
        zofka.turnLeft(135.0);
        zofka.penDown();
        zofka.move(130);
        zofka.turnRight(135.0);
        zofka.move(130);
        zofka.turnLeft(180.0);
        zofka.penUp();
        zofka.move(55);
        zofka.penDown();
        zofka.turnLeft(65.0);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(150.0);
        zofka.move(100);
        zofka.turnLeft(120.0);
        zofka.penDown();
        zofka.move(115);
        zofka.turnRight(145.0);
        zofka.move(140);
        zofka.turnLeft(145.0);
        zofka.move(115);
        zofka.penUp();
        zofka.turnRight(95.0);
        zofka.move(20);
        zofka.penDown();
        zofka.turnRight(85.0);
        zofka.move(115);
        zofka.penUp();
        zofka.turnLeft(85.0);
        zofka.move(20);
        zofka.penDown();
        zofka.turnLeft(95.0);
        zofka.move(115);
        zofka.turnRight(90.0);
        zofka.move(50);
        zofka.turnRight(90.0);
        zofka.penUp();
        zofka.move(56.75);
        zofka.penDown();
        zofka.turnRight(90.0);
        zofka.move(50);
        zofka.turnLeft(90.0);
        zofka.penUp();
        zofka.move(56.75);
        zofka.penDown();
        zofka.turnLeft(90.0);
        zofka.move(50);
        zofka.penUp();
        zofka.move(20);
        zofka.penDown();
        zofka.turnLeft(90.0);
        zofka.move(115);
        zofka.turnRight(180.0);
        zofka.move(115);
        zofka.turnLeft(90.0);
        zofka.move(50);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(68.0);
        zofka.penDown();
        zofka.move(130);
        zofka.turnRight(135.0);
        zofka.move(130);
        zofka.turnLeft(180.0);
        zofka.penUp();
        zofka.move(55);
        zofka.penDown();
        zofka.turnLeft(65.0);
        zofka.move(50);
        zofka.penUp();

        zofka.turnRight(180.0);
        zofka.move(400);

        //slunicko
        zofka.penDown();

        for (int k = 0; k < 24; k++) {
            for (int l = 0; l < 15; l++) {
                zofka.move(1);
                zofka.turnLeft(1.0);
            }
            zofka.turnRight(90.0);
            zofka.move(50);
            zofka.turnLeft(180.0);
            zofka.move(50);
            zofka.turnRight(90.0);
        }
        zofka.penUp();
    }
}
