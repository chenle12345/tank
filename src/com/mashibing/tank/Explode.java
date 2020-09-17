package com.mashibing.tank;

import java.awt.*;

/**
 * @Auther: chenle
 * @Date: 2020/9/10 - 22:35
 * @Description: com.mashibing.tank
 * @version: 1.0
 */
public class Explode {

    public static int WIDTH = ResourceMgr.explodes[0].getWidth();
    public static int HEIGHT = ResourceMgr.explodes[0].getHeight();

    private int x, y;

//    private boolean living = true;
    private TankFrame tf = null;

    private int step = 0;

    public Explode(int x, int y, TankFrame tankFrame) {
        this.x = x;
        this.y = y;
        this.tf = tankFrame;

        new Thread(()->new Audio("audio/explode.wav").play()).start();
    }


    public void paint(Graphics g) {
        g.drawImage(ResourceMgr.explodes[step++], x, y, null);

        if (step >= ResourceMgr.explodes.length) {
            tf.explodes.remove(this);
        }

    }

}
