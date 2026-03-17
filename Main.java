package Darts;

import static Darts.Watki.odliczanie;
import static Darts.Watki.th;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StdDraw.setScale(-11,11);
        StdDraw.setTitle("Darts");
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(-11, 11);
        StdDraw.setCanvasSize(800, 800);
        Draw draw = new Draw();
        draw.setTitle("Matviy=black");
        draw.enableDoubleBuffering();
        draw.setXscale(-20, 20);
        draw.setYscale(-5, 5);
        draw.setCanvasSize(1800, 450);
        draw.square(0, 0, 4);
        int z = 0;
        int lr = Random(1, 5);
        double s = Randomd(0, 5);
        String text;
        double x=0;
        double y=0;
        double p=0;
        odliczanie.start();
        StdDraw.pause(3000);
        th.start();
        while (z<100) {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledRectangle(0,0.5,11,10.5);
            StdDraw.filledRectangle(-11,-11,0.5,1);
            StdDraw.filledRectangle(1.75,-11,9.25,1);
            StdDraw.setPenColor(StdDraw.BLACK);
            if (lr == 1) {
                text="Wiatr wieje w górę z prędkością " + String.format("%.2f", s * 10) + "km/h.";
                StdDraw.text(6.5, 10.5,text );
            }
            if (lr == 2) {
                text="Wiatr wieje w prawo z prędkością " + String.format("%.2f", s * 10) + "km/h.";
                StdDraw.text(6.5, 10.5,text);
            }
            if (lr == 3) {
                text="Wiatr wieje w dół z prędkością " +String.format("%.2f", s * 10) + "km/h.";
                StdDraw.text(6.5, 10.5,text);
            }
            if (lr == 4) {
                text="Wiatr wieje w lewo z prędkością "+ String.format("%.2f", s * 10) + "km/h." ;
                StdDraw.text(6.5, 10.5,text);
            }
            StdDraw.text(-9, 10.5, "Masz " + z + " punktów.");
            for (int a = 2; a < 11; a++) {
                StdDraw.setPenColor(175, 50, 50);
                StdDraw.circle(0, 0, a);
                StdDraw.setPenColor(0, 0, 0);
            }
            StdDraw.setPenColor(50, 175, 50);
            StdDraw.filledCircle(0, 0, 1);
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.picture(StdDraw.mouseX(), StdDraw.mouseY(), "Celownik.png", 1, 1);
            for (int f = 1; f < 10; f++) {
                StdDraw.text(-1 * (10 - (f - 0.5)), -0.2, "" + f);
                StdDraw.text(f + 0.5, -0.2, "" + (10 - f));
                StdDraw.text(0, f + 0.3, "" + (10 - f));
                StdDraw.text(0, -1 * (f + 0.7), "" + (10 - f));
            }
            StdDraw.text(0, -0.2, "" + 10);
            StdDraw.show();
            StdDraw.pause(30);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledRectangle(0,0.5,11,10.5);
             StdDraw.filledRectangle(-11,-11,0.5,1);
            StdDraw.filledRectangle(1.75,-11,9.25,1);
            StdDraw.setPenColor(StdDraw.BLACK);
            if (StdDraw.isMousePressed()) {
                double d = StdDraw.mouseX();
                double e = StdDraw.mouseY();
                for (int b = 0; b < 21; b++) {
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.filledRectangle(0,0.5,11,10.5);
                    StdDraw.filledRectangle(-11,-11,0.5,1);
                    StdDraw.filledRectangle(1.75,-11,9.25,1);
                    StdDraw.setPenColor(StdDraw.BLACK);
                    for (int c = 10; c > 1; c--) {
                        StdDraw.setPenColor(175, 50, 50);
                        StdDraw.circle(0, 0, c);
                        StdDraw.setPenColor(0, 0, 0);
                    }
                    StdDraw.setPenColor(50, 175, 50);
                    StdDraw.filledCircle(0, 0, 1);
                    StdDraw.setPenColor(0, 0, 0);
                    for (int f = 1; f < 10; f++) {

                        StdDraw.text(-1 * (10 - (f - 0.5)), -0.2, "" + f);
                        StdDraw.text(f + 0.5, -0.2, "" + (10 - f));
                        StdDraw.text(0, f + 0.3, "" + (10 - f));
                        StdDraw.text(0, -1 * (f + 0.7), "" + (10 - f));
                    }
                    if (lr == 1) {
                        StdDraw.text(-9, 10.5, "Masz " + z + " punktów.");
                        StdDraw.text(0, -0.2, "" + 10);
                        x=21.4+d - b ;
                        y=21.4+e - b +   (s*b*0.05);
                        StdDraw.picture(x,y , "dart.png", 1, 1);
                        StdDraw.show();
                        StdDraw.pause(25);
                    }
                    if (lr == 2) {
                        StdDraw.text(-9, 10.5, "Masz " + z + " punktów.");
                        StdDraw.text(0, -0.2, "" + 10);
                        x=21.4+d - b +(s*b*0.05);
                        y=21.4+e - b ;
                        StdDraw.picture(x,y , "dart.png", 1, 1);
                        StdDraw.show();
                        StdDraw.pause(25);
                    }
                    if (lr == 3) {
                        StdDraw.text(-9, 10.5, "Masz " + z + " punktów.");
                        StdDraw.text(0, -0.2, "" + 10);
                        x=21.4+d - b ;
                        y=21.4+e - b -(s*b*0.05);
                        StdDraw.picture(x,y , "dart.png", 1, 1);
                        StdDraw.show();
                        StdDraw.pause(25);
                    }
                    if (lr == 4) {
                        StdDraw.text(-9, 10.5, "Masz " + z + " punktów.");
                        StdDraw.text(0, -0.2, "" + 10);
                        x=21.4+d - b -(s*0.05*b);
                        y=21.4+e - b ;
                        StdDraw.picture(x,y , "dart.png", 1, 1);
                        StdDraw.show();
                        StdDraw.pause(25);
                    }
                }
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledRectangle(0,0.5,11,10.5);
                StdDraw.filledRectangle(-11,-11,0.5,1);
                StdDraw.filledRectangle(1.75,-11,9.25,1);
                StdDraw.setPenColor(StdDraw.BLACK);
                for (int c = 10; c > 1; c--) {
                    StdDraw.setPenColor(175, 50, 50);
                    StdDraw.circle(0, 0, c);
                    StdDraw.setPenColor(0, 0, 0);
                }
                StdDraw.setPenColor(50, 175, 50);
                StdDraw.filledCircle(0, 0, 1);
                StdDraw.setPenColor(0, 0, 0);

                for (int f = 1; f < 10; f++) {
                    StdDraw.text(-1 * (10 - (f - 0.5)), -0.2, "" + f);
                    StdDraw.text(f + 0.5, -0.2, "" + (10 - f));
                    StdDraw.text(0, f + 0.3, "" + (10 - f));
                    StdDraw.text(0, -1 * (f + 0.7), "" + (10 - f));
                }
                StdDraw.text(0, -0.2, "" + 10);
                if (lr == 1) {
                    x=d + 0.4;
                    y=e + 0.4 + s;
                    StdDraw.picture(x,y, "dart.png", 1, 1);
                }
                if (lr == 2) {
                    x=d + 0.4 + s;
                    y=e + 0.4;
                    StdDraw.picture(x,y, "dart.png", 1, 1);
                }
                if (lr == 3) {
                    x=d + 0.4;
                    y=e + 0.4 - s;
                    StdDraw.picture(x,y, "dart.png", 1, 1);
                }
                if (lr == 4) {
                    x=d + 0.4 - s;
                    y=e + 0.4;
                    StdDraw.picture(x,y,"dart.png", 1, 1);
                }
                p = Math.sqrt(x * x + y * y);
                if (0 < p && p < 1) {
                    StdDraw.text(0, 10.25, "Brawo, uzyskałeś 10 punktów.");
                    z = z + 10;
                }
                if (1 < p && p < 2) {
                    StdDraw.text(0, 10.25, "Brawo, uzyskałeś 9 punktów.");
                    z = z + 9;
                }
                if (2 < p && p < 3) {
                    StdDraw.text(0, 10.25, "Brawo, uzyskałeś 8 punktów.");
                    z = z + 8;
                }
                if (3 < p && p < 4) {
                    StdDraw.text(0, 10.25, "Uzyskałeś 7 punktów.");
                    z = z + 7;
                }
                if (4 < p && p < 5) {
                    StdDraw.text(0, 10.25, "Uzyskałeś 6 punktów.");
                    z = z + 6;
                }
                if (5 < p && p < 6) {
                    StdDraw.text(0, 10.25, "Uzyskałeś 5 punktów.");
                    z = z + 5;
                }
                if (6 < p && p < 7) {
                    StdDraw.text(0, 10.25, "Uzyskałeś 4 punktów.");
                    z = z + 4;
                }
                if (7 < p && p < 8) {
                    StdDraw.text(0, 10.25, "Uzyskałeś 3 punktów.");
                    z = z + 3;
                }
                if (8 < p && p < 9) {
                    StdDraw.text(0, 10.25, "Uzyskałeś 2 punktów.");
                    z = z + 2;
                }
                if (9 < p && p < 10) {
                    StdDraw.text(0, 10.25, "Uzyskałeś 1 punkt.");
                    z = z + 1;
                }
                if (10 < p) {
                    StdDraw.text(0, 10.25, "Nie uzyskałeś żadnego punktu :(");
                }
                StdDraw.text(-9, 10.5, "Masz " + z + " punktów.");

                StdDraw.show();
                StdDraw.pause(2000);
                lr = Random(1, 5);
                s = Randomd(0, 5);
            }
        }
        System.out.println("YOU WIN!");
        System.exit(0);
    }

    public static int Random(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static double Randomd(double min, double max) {
        double x = ((Math.random() * (max - min)) + min);
        return x;
    }
}