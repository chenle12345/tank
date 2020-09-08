package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: chenle
 * @Date: 2020/9/8 - 22:18
 * @Description: com.mashibing.tank
 * @version: 1.0
 */
public class T {

    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(800, 600);
        f.setResizable(false);
        f.setTitle("tank war");

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}
