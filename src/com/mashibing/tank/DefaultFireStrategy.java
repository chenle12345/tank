package com.mashibing.tank;

/**
 * @Auther: chenle
 * @Date: 2020/10/21 - 20:33
 * @Description: com.mashibing.tank
 * @version: 1.0
 */
public class DefaultFireStrategy implements FireStrategy {
    @Override
    public void fire(Tank t) {
        int bX = t.x + Tank.WIDTH/2 - Bullet.WIDTH/2;
        int bY = t.y + Tank.HEIGHT/2 - Bullet.HEIGHT/2;

        new Bullet(bX, bY, t.dir, t.group, t.gm);

        if(t.group == Group.GOOD) new Thread(()->new Audio("audio/tank_fire.wav").play()).start();
    }
}
