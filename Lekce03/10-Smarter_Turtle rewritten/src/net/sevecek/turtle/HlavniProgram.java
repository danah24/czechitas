package net.sevecek.turtle;

import java.awt.*;
import java.util.logging.*;
import javafx.scene.shape.*;
import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    Turtle zofka;

    public void nakresliMezera() {
        zofka.turnRight(90.0);
        zofka.move(20);
        zofka.turnLeft(90.0);
    }

    public void nakresliD(Color docasnaBarva) {
        Color puvodniBarva;
        puvodniBarva = zofka.getPenColor();
        zofka.setPenColor(docasnaBarva);
        zofka.penDown();
        zofka.move(110);
        zofka.turnRight(90.0);
        for (int i = 0; i < 180; i++) {
            zofka.move(1);
            zofka.turnRight(1.0);
        }
        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(45);
        zofka.turnLeft(90.0);
        zofka.setPenColor(puvodniBarva);
    }

    public void nakresliA(Color docasnaBarva) {
        Color puvodniBarva;
        puvodniBarva = zofka.getPenColor();
        zofka.setPenColor(docasnaBarva);
        zofka.penDown();
        zofka.turnRight(20.0);
        zofka.move(130);
        zofka.turnRight(135.0);
        zofka.move(130);
        zofka.turnLeft(180.0);
        zofka.penUp();
        zofka.move(55);
        zofka.penDown();
        zofka.turnLeft(67.0);
        zofka.move(52);
        zofka.penUp();
        zofka.turnLeft(180.0);
        zofka.move(54);
        zofka.turnRight(67.0);
        zofka.move(55);
        zofka.turnLeft(155.0);
        zofka.setPenColor(puvodniBarva);
    }

    public void nakresliN(Color docasnaBarva) {
        Color puvodniBarva;
        puvodniBarva = zofka.getPenColor();
        zofka.setPenColor(docasnaBarva);
        zofka.penDown();
        zofka.move(115);
        zofka.turnRight(145.0);
        zofka.move(140);
        zofka.turnLeft(145.0);
        zofka.move(115);
        zofka.penUp();
        zofka.turnLeft(180.0);
        zofka.move(115);
        zofka.turnLeft(180.0);
        zofka.setPenColor(puvodniBarva);
    }

    public void nakresliI(Color docasnaBarva) {
        Color puvodniBarva;
        puvodniBarva = zofka.getPenColor();
        zofka.setPenColor(docasnaBarva);
        zofka.penDown();
        zofka.move(115);
        zofka.penUp();
        zofka.turnLeft(180.0);
        zofka.move(115);
        zofka.turnLeft(180.0);
        zofka.setPenColor(puvodniBarva);
    }

    public void nakresliE(Color docasnaBarva) {
        Color puvodniBarva;
        puvodniBarva = zofka.getPenColor();
        zofka.setPenColor(docasnaBarva);
        zofka.penDown();
        zofka.move(115);
        zofka.turnRight(90.0);
        zofka.move(50);
        zofka.turnRight(90.0);
        zofka.penUp();
        zofka.move(57.0);
        zofka.penDown();
        zofka.turnRight(90.0);
        zofka.move(50);
        zofka.turnLeft(90.0);
        zofka.penUp();
        zofka.move(57.0);
        zofka.penDown();
        zofka.turnLeft(90.0);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(90.0);
        zofka.setPenColor(puvodniBarva);
    }

    public void nakresliL(Color docasnaBarva) {
        Color puvodniBarva;
        puvodniBarva = zofka.getPenColor();
        zofka.setPenColor(docasnaBarva);
        zofka.penDown();
        zofka.move(115);
        zofka.turnRight(180.0);
        zofka.move(115);
        zofka.turnLeft(90.0);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(90.0);
        zofka.setPenColor(puvodniBarva);
    }

    public void nakresliSlunicko(Color docasnaBarva) {
        Color puvodniBarva;
        puvodniBarva = zofka.getPenColor();
        zofka.setPenColor(docasnaBarva);
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
        zofka.setPenColor(puvodniBarva);
    }

    public void nakresliKruh(int x, int y, int w, int z, Color docasnaBarva) {
        Color puvodniBarva;
        puvodniBarva = zofka.getPenColor();
        zofka.setPenColor(docasnaBarva);
        zofka.setLocation(x, y);
        zofka.penDown();

        zofka.turnLeft(180.0);
        for (int j = 0; j < w; j++) {
            zofka.move(3);
            zofka.turnRight(z);
        }
        zofka.turnLeft(180.0);
        zofka.penUp();
        zofka.setPenColor(puvodniBarva);
    }

    public void run() {
        Color barva1;
        Color barva2;
        Color barva3;
        Color barva4;
        Color barva5;
        Color barva6;
        Color barva7;

        barva1 = new Color(255, 50, 56);
        barva2 = new Color(41, 57, 147);
        barva3 = new Color(255, 109, 0);
        barva4 = new Color(214, 38, 185);
        barva5 = new Color(16, 153, 58);
        barva6 = new Color(137, 48, 255);
        barva7 = new Color(255, 239, 36);

        zofka = new Turtle();
        zofka.setPenWidth(6);
        zofka.setLocation(200, 200);

        //podpis
        nakresliD(barva1);
        nakresliMezera();
        nakresliA(barva4);
        nakresliMezera();
        nakresliN(barva5);
        nakresliMezera();
        nakresliI(barva2);
        nakresliMezera();
        nakresliE(barva3);
        nakresliMezera();
        nakresliL(barva7);
        nakresliMezera();
        nakresliA(barva6);

        //slunce
        zofka.setLocation(1000, 200);
        nakresliSlunicko(barva7);

        //snehulak
        nakresliKruh(330, 592, 180, 2, barva1);
        nakresliKruh(300, 446, 120, 3, barva6);
        nakresliKruh(278, 351, 72, 5, barva4);
        nakresliKruh(363, 437, 60, 6, barva3);
        nakresliKruh(180, 437, 60, 6, barva3);

        zofka.setLocation(500, 500);
    }
}
