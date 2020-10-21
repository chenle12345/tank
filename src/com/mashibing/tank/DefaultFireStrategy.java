package com.mashibing.tank;

/**
 * @Auther: chenle
 * @Date: 2020/10/21 - 20:33
 * @Description: com.mashibing.tank
 * @version: 1.0
 */
public class DefaultFireStrategy implements FireStrategy {
    @Override
    public void fire(Tank tank) {
        int bX = tank.x + Tank.WIDTH / 2 - Bullet.WIDTH / 2;
        int bY = tank.y + Tank.HEIGHT / 2 - Bullet.HEIGHT / 2;
        new Bullet(bX, bY, tank.dir, tank.group, tank.tf);

        if (tank.group == Group.GOOD) {
            new Thread(()->new Audio("audio/tank"));
        }
    }
}
