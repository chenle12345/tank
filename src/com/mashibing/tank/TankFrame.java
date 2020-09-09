package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: chenle
 * @Date: 2020/9/9 - 22:11
 * @Description: com.mashibing.tank
 * @version: 1.0
 */
public class TankFrame extends Frame {

    public TankFrame() {
        setVisible(true);
        setSize(800, 600);
        setResizable(false);
        setTitle("tank war");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(200, 200, 50, 50);
        System.out.println("paint");
    }
}
