package Darts;

public class Watki {
    public static void main(String[] args) {
        odliczanie.start();
        th.start();
    }


        static Thread th = new Thread() {
            public void run() {
                int sekundy=60;
                    while (sekundy > 0) {
                        sekundy--;
                        for(int i=1;i<201;i++) {
                            StdDraw.text(-9, -10.5, "Time left:" + sekundy);
                            StdDraw.pause(5);
                        }
                        StdDraw.setPenColor(StdDraw.WHITE);
                        StdDraw.filledRectangle(-9,-11,1.5,1);
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.show();
                    }
                        System.out.println("YOU LOSE!");
                        System.exit(0);
                }
        };
    static Thread odliczanie = new Thread() {
        public void run() {
            Draw cos = new Draw();
            cos.setCanvasSize(800,800);
            for(int i=3;i>0;i--) {
                cos.text(0.5, 0.5, "Gra się rozpocznie za:"+i);
                cos.pause(1000);
                cos.clear();
            }
        }
    };

}
