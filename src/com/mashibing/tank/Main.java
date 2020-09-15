package com.mashibing.tank;

/**
 * @Auther: chenle
 * @Date: 2020/9/8 - 22:18
 * @Description: com.mashibing.tank
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();

        // 初始化敌方坦克
        for (int i = 0; i < 5; i++) {
            tf.tanks.add(new Tank(50 + i * 80, 200, Dir.DOWN, tf));
        }
        while (true) {
            Thread.sleep(50);
            tf.repaint();
        }
    }


}
