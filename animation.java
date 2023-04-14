package com.programs;

import java.awt.*;
@SuppressWarnings("Unchecked")
class MyFrame extends Frame implements Runnable{
    int x, y, transitionx, transitiony;

    MyFrame() {
        x = 100;
        y = 100;
        transitionx = transitiony = 1;
        Thread th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillOval(x, y, 50, 50);
    }

    public void run() {

          while (true) {
              x += transitionx;
              y += transitiony;

              if (x < 0 || x > 750) transitionx = transitionx * -1;
              if (y < 28 || y > 550) transitiony = transitiony * -1;
              repaint();
              try {
                  Thread.sleep(5);
              } catch (Exception e) {
              }
          }
    }
}
public class animation {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(800, 600);
        mf.setVisible(true);
    }
}