package com.mashibing.tank.cor;

import com.mashibing.tank.GameObject;

/**
 * @Auther: chenle
 * @Date: 2020/11/3 - 22:35
 * @Description: com.mashibing.tank.cor
 * @version: 1.0
 */
public interface Collider {

     boolean collide(GameObject o1, GameObject o2);

}
