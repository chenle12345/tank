package com.mashibing.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: chenle
 * @Date: 2020/9/9 - 22:11
 * @Description: com.mashibing.tank
 * @version: 1.0
 */
public class TankFrame extends Frame {

    int x = 200;
    int y = 200;

    public TankFrame() {
        setVisible(true);
        setSize(800, 600);
        setResizable(false);
        setTitle("tank war");

        this.addKeyListener(new MyKeyListener());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);
//        x += 10;
//        y += 10;
        System.out.println("paint");
    }

    class MyKeyListener extends KeyAdapter {

        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
//            System.out.println("key pressed");
//            x += 200;
//            repaint();

            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
            }

            if (bL == true) {
                x -= 20;
            }
            if (bU == true) {
                y -= 20;
            }
            if (bR == true) {
                x += 20;
            }
            if (bD == true) {
                y += 20;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
            }
        }
    }
}

