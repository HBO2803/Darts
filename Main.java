package StdDraw;

public class Main {
    public static void main(String[] args) {
        Draw StdDraw2=new Draw();
        System.out.println("XD");
        StdDraw2.setTitle("Darts");
        StdDraw2.enableDoubleBuffering();
        StdDraw2.setCanvasSize(800, 800);
        StdDraw2.setScale(-11, 11);
        int z = 0;
        while (true) {
            StdDraw2.clear();
            if(StdDraw2.isMousePressed()){

                StdDraw.ellipse(0,0,5,9);
            }
            StdDraw2.text(-9, 10.5, "Masz " + z + " punktów.");
            for (int a = 2; a < 11; a++) {
                StdDraw2.setPenColor(175,50,50);
                StdDraw2.circle(0, 0, a);
                StdDraw2.setPenColor(0,0,0);
            }
            StdDraw2.setPenColor(50, 175, 50);
            StdDraw2.filledCircle(0, 0, 1);
            StdDraw2.setPenColor(0, 0, 0);
            StdDraw2.picture(StdDraw2.mouseX(), StdDraw2.mouseY(), "Celownik.png", 1, 1);
            for (int f = 1; f < 10; f++) {
                StdDraw2.text(-1 * (10 - (f - 0.5)), -0.2, "" + f);
                StdDraw2.text(f+0.5,-0.2,""+(10-f));
                StdDraw2.text(0,f+0.3,""+(10-f));
                StdDraw2.text(0,-1*(f+0.7),""+(10-f));
            }
            StdDraw2.text(0, -0.2, "" + 10);
            StdDraw2.show();
            StdDraw2.pause(30);
            if (StdDraw2.isMousePressed()) {
                double d = StdDraw2.mouseX();
                double e = StdDraw2.mouseY();
                double p = Math.sqrt(d * d + e * e);
                for (int b = 19; b > -1; b--) {
                    StdDraw2.clear();
                    for (int c = 10; c > 1; c--) {
                        StdDraw2.setPenColor(175,50,50);
                        StdDraw2.circle(0, 0, c);
                        StdDraw2.setPenColor(0,0,0);
                    }
                    StdDraw2.setPenColor(50, 175, 50);
                    StdDraw2.filledCircle(0, 0, 1);
                    StdDraw2.setPenColor(0, 0, 0);
                    for (int f = 1; f < 10; f++) {
                        StdDraw2.text(-1 * (10 - (f - 0.5)), -0.2, "" + f);
                        StdDraw2.text(f+0.5,-0.2,""+(10-f));
                        StdDraw2.text(0,f+0.3,""+(10-f));
                        StdDraw2.text(0,-1*(f+0.7),""+(10-f));
                    }
                    StdDraw2.text(-9, 10.5, "Masz " + z + " punktów.");
                    StdDraw2.text(0, -0.2, "" + 10);
                    StdDraw2.picture(d + b + 0.4, e + b + 0.4, "dart.png", 1, 1);
                    StdDraw2.show();
                    StdDraw2.pause(25);
                }
                StdDraw2.clear();
                for (int c = 10; c > 1; c--) {
                    StdDraw2.setPenColor(175,50,50);
                    StdDraw2.circle(0, 0, c);
                    StdDraw2.setPenColor(0,0,0);
                }
                StdDraw2.setPenColor(50, 175, 50);
                StdDraw2.filledCircle(0, 0, 1);
                StdDraw2.setPenColor(0, 0, 0);

                for (int f = 1; f < 10; f++) {
                    StdDraw2.text(-1 * (10 - (f - 0.5)), -0.2, "" + f);
                    StdDraw2.text(f+0.5,-0.2,""+(10-f));
                    StdDraw2.text(0,f+0.3,""+(10-f));
                    StdDraw2.text(0,-1*(f+0.7),""+(10-f));
                }
                    StdDraw2.text(0, -0.2, "" + 10);
                StdDraw2.picture(d+0.4, e+0.4, "dart.png", 1, 1);
                    if (0 < p && p < 1) {
                        StdDraw2.text(0, 10.25, "Brawo, uzyskałeś 10 punktów.");
                        z = z + 10;
                    }
                    if (1 < p && p < 2) {
                        StdDraw2.text(0, 10.25, "Brawo, uzyskałeś 9 punktów.");
                        z = z + 9;
                    }
                    if (2 < p && p < 3) {
                        StdDraw2.text(0, 10.25, "Brawo, uzyskałeś 8 punktów.");
                        z = z + 8;
                    }
                    if (3 < p && p < 4) {
                        StdDraw2.text(0, 10.25, "Uzyskałeś 7 punktów.");
                        z = z + 7;
                    }
                    if (4 < p && p < 5) {
                        StdDraw2.text(0, 10.25, "Uzyskałeś 6 punktów.");
                        z = z + 6;
                    }
                    if (5 < p && p < 6) {
                        StdDraw2.text(0, 10.25, "Uzyskałeś 5 punktów.");
                        z = z + 5;
                    }
                    if (6 < p && p < 7) {
                        StdDraw2.text(0, 10.25, "Uzyskałeś 4 punktów.");
                        z = z + 4;
                    }
                    if (7 < p && p < 8) {
                        StdDraw2.text(0, 10.25, "Uzyskałeś 3 punktów.");
                        z = z + 3;
                    }
                    if (8 < p && p < 9) {
                        StdDraw2.text(0, 10.25, "Uzyskałeś 2 punktów.");
                        z = z + 2;
                    }
                    if (9 < p && p < 10) {
                        StdDraw2.text(0, 10.25, "Uzyskałeś 1 punkt.");
                        z = z + 1;
                    }
                    if (10 < p) {
                        StdDraw2.text(0, 10.25, "Nie uzyskałeś żadnego punktu :(");
                    }
                    StdDraw2.text(-9, 10.5, "Masz " + z + " punktów.");
                    StdDraw2.show();
                    StdDraw2.pause(1500);
                }
            }
        }
    }
