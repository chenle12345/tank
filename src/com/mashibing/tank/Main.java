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



        new Thread(()->new Audio("audio/war1.wav").loop()).start();

        while(true) {
            Thread.sleep(25);
            tf.repaint();
        }

    }


}
