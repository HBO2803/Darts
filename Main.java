package StdDraw;

public class Main {
    public static void main(String[] args) {
        System.out.println("XD");
        StdDraw.setTitle("Darts");
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setScale(-11, 11);
        int z = 0;
        while (true) {
            StdDraw.clear();
            StdDraw.text(-9, 10.5, "Masz " + z + " punktów.", 0, 0);
            for (int a = 2; a < 11; a++) {
                StdDraw.setPenColor(175,50,50);
                StdDraw.circle(0, 0, a);
                StdDraw.setPenColor(0,0,0);
            }
            StdDraw.setPenColor(50, 175, 50);
            StdDraw.filledCircle(0, 0, 1);
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.picture(StdDraw.mouseX(), StdDraw.mouseY(), "Celownik.png", 1, 1);
            for (int f = 1; f < 10; f++) {
                StdDraw.text(-1 * (10 - (f - 0.5)), -0.2, "" + f, 0, 0);
                StdDraw.text(f+0.5,-0.2,""+(10-f),0,0);
                StdDraw.text(0,f+0.3,""+(10-f),0,0);
                StdDraw.text(0,-1*(f+0.7),""+(10-f),0,0);
            }
            StdDraw.text(0, -0.2, "" + 10, 0, 0);
            StdDraw.show();
            StdDraw.pause(30);
            if (StdDraw.isMousePressed()) {
                double d = StdDraw.mouseX();
                double e = StdDraw.mouseY();
                double p = Math.sqrt(d * d + e * e);
                for (int b = 19; b > -1; b--) {
                    StdDraw.clear();
                    for (int c = 10; c > 1; c--) {
                        StdDraw.setPenColor(175,50,50);
                        StdDraw.circle(0, 0, c);
                        StdDraw.setPenColor(0,0,0);
                    }
                    StdDraw.setPenColor(50, 175, 50);
                    StdDraw.filledCircle(0, 0, 1);
                    StdDraw.setPenColor(0, 0, 0);
                    for (int f = 1; f < 10; f++) {
                        StdDraw.text(-1 * (10 - (f - 0.5)), -0.2, "" + f, 0, 0);
                        StdDraw.text(f+0.5,-0.2,""+(10-f),0,0);
                        StdDraw.text(0,f+0.3,""+(10-f),0,0);
                        StdDraw.text(0,-1*(f+0.7),""+(10-f),0,0);
                    }
                    StdDraw.text(-9, 10.5, "Masz " + z + " punktów.", 0, 0);
                    StdDraw.text(0, -0.2, "" + 10, 0, 0);
                    StdDraw.picture(d + b + 0.4, e + b + 0.4, "dart.png", 1, 1);
                    StdDraw.show();
                    StdDraw.pause(25);
                }
                StdDraw.clear();
                for (int c = 10; c > 1; c--) {
                    StdDraw.setPenColor(175,50,50);
                    StdDraw.circle(0, 0, c);
                    StdDraw.setPenColor(0,0,0);
                }
                StdDraw.setPenColor(50, 175, 50);
                StdDraw.filledCircle(0, 0, 1);
                StdDraw.setPenColor(0, 0, 0);

                for (int f = 1; f < 10; f++) {
                    StdDraw.text(-1 * (10 - (f - 0.5)), -0.2, "" + f, 0, 0);
                    StdDraw.text(f+0.5,-0.2,""+(10-f),0,0);
                    StdDraw.text(0,f+0.3,""+(10-f),0,0);
                    StdDraw.text(0,-1*(f+0.7),""+(10-f),0,0);
                }
                    StdDraw.text(0, -0.2, "" + 10, 0, 0);
                StdDraw.picture(d+0.4, e+0.4, "dart.png", 1, 1);
                    if (0 < p && p < 1) {
                        StdDraw.text(0, 10.25, "Brawo, uzyskałeś 10 punktów.", 0, 0);
                        z = z + 10;
                    }
                    if (1 < p && p < 2) {
                        StdDraw.text(0, 10.25, "Brawo, uzyskałeś 9 punktów.", 0, 0);
                        z = z + 9;
                    }
                    if (2 < p && p < 3) {
                        StdDraw.text(0, 10.25, "Brawo, uzyskałeś 8 punktów.", 0, 0);
                        z = z + 8;
                    }
                    if (3 < p && p < 4) {
                        StdDraw.text(0, 10.25, "Uzyskałeś 7 punktów.", 0, 0);
                        z = z + 7;
                    }
                    if (4 < p && p < 5) {
                        StdDraw.text(0, 10.25, "Uzyskałeś 6 punktów.", 0, 0);
                        z = z + 6;
                    }
                    if (5 < p && p < 6) {
                        StdDraw.text(0, 10.25, "Uzyskałeś 5 punktów.", 0, 0);
                        z = z + 5;
                    }
                    if (6 < p && p < 7) {
                        StdDraw.text(0, 10.25, "Uzyskałeś 4 punktów.", 0, 0);
                        z = z + 4;
                    }
                    if (7 < p && p < 8) {
                        StdDraw.text(0, 10.25, "Uzyskałeś 3 punktów.", 0, 0);
                        z = z + 3;
                        System.out.println(z);
                    }
                    if (8 < p && p < 9) {
                        StdDraw.text(0, 10.25, "Uzyskałeś 2 punktów.", 0, 0);
                        z = z + 2;
                        System.out.println(z);
                    }
                    if (9 < p && p < 10) {
                        StdDraw.text(0, 10.25, "Uzyskałeś 1 punkt.", 0, 0);
                        z = z + 1;
                    }
                    if (10 < p) {
                        StdDraw.text(0, 10.25, "Nie uzyskałeś żadnego punktu :(", 0, 0);
                    }
                    StdDraw.text(-9, 10.5, "Masz " + z + " punktów.", 0, 0);
                    StdDraw.show();
                    StdDraw.pause(1500);
                }
            }
        }
    }
