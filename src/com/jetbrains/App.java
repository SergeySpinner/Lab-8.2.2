package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class App extends JFrame implements KeyListener {
    private JCheckBox checkBox1;
    private JPanel panel1;
    DotCanvas temp_canvas = new DotCanvas();
    int i = 0;
    Point p = new Point(250,250);

    App()
    {
        setSize(575,575);
        setVisible(true);
        addKeyListener(this);
        add(temp_canvas);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && p.x - 10 < 500) {
            p.x += 10;
            temp_canvas.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT && p.x - 10 > 0 ) {
            p.x -= 10;
            temp_canvas.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP && p.y - 10 > 0) {
            p.y -= 10;
            temp_canvas.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && p.y + 10 < 500) {
            p.y += 10;
            temp_canvas.repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    class Point extends JComponent{
        private int x;
        private int y;
        Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

    }
    class DotCanvas extends Canvas{
        DotCanvas()
        {
            super();
        }
        public void paint(Graphics gg)
        {
            gg.setColor(Color.black);
            gg.fillOval(p.x,p.y,50,50);
        }
    }
}

