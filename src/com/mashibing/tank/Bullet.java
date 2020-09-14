package com.mashibing.tank;

import java.awt.*;

/**
 * @Auther: chenle
 * @Date: 2020/9/10 - 22:35
 * @Description: com.mashibing.tank
 * @version: 1.0
 */
public class Bullet {

    private static final int SPEED = 2;
    private static int WIDTH = 30, HEIGHT = 30;

    private int x, y;
    private Dir dir;

    private boolean live = true;
    private TankFrame tf = null;

    public Bullet(int x, int y, Dir dir, TankFrame tankFrame) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tankFrame;
    }


    public void paint(Graphics g) {

        if (!live) {
            tf.bullets.remove(this);
        }

        switch (dir) {
            case LEFT:
                g.drawImage(ResourceMgr.bulletL, x, y, null);
                break;
            case UP:
                g.drawImage(ResourceMgr.bulletU, x, y, null);
                break;
            case RIGHT:
                g.drawImage(ResourceMgr.bulletR, x, y, null);
                break;
            case DOWN:
                g.drawImage(ResourceMgr.bulletD, x, y, null);
                break;
        }

        move();

    }

    private void move() {

        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }

        if (x < 0 || y < 0 || x > TankFrame.GAME_WIDTH || y > TankFrame.GAME_HEIGHT) {
            live = false;
        }

    }
}
