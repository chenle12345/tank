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

        int initTankCount = Integer.parseInt((String)PropertyMgr.get("initTankCount"));

        // 初始化敌方坦克
        for (int i = 0; i < initTankCount; i++) {
            tf.tanks.add(new Tank(50 + i * 80, 200, Dir.DOWN, Group.BAD, tf));
        }
        while (true) {
            Thread.sleep(50);
            tf.repaint();
        }
    }


}
