package com.mashibing.tank;

import java.io.IOException;
import java.util.Properties;

/**
 * @Auther: chenle
 * @Date: 2020/9/21 - 21:40
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class PropertyMgr {

    static Properties props = new Properties();

    static {
        try {
            props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private PropertyMgr() {
    }

    public static Object get(String key) {
        if (props == null) {
            return null;
        } else {
            return props.get(key);
        }
    }

    public static void main(String[] args) {
        System.out.println(PropertyMgr.get("initTankCount"));
    }

}
