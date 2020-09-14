package java.com.mashibing.tank;

/**
 * @Auther: chenle
 * @Date: 2020/9/8 - 22:18
 * @Description: com.mashibing.tank
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        TankFrame frame = new TankFrame();

        while (true) {
            Thread.sleep(50);
            frame.repaint();
        }
    }


}
