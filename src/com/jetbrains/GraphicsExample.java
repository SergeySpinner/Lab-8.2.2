package com.jetbrains;
import java.awt.*;

import javax.swing.JFrame;
public class GraphicsExample extends JFrame {
    LeftCanvas lcanvas = new LeftCanvas();
    RightCanvas rcanvas = new RightCanvas();
    public static void main(String[] args) {
        GraphicsExample win = new GraphicsExample();
    }
    public GraphicsExample() {
        super("GraphicsExample");
        addComponents();
        pack();
        setVisible(true);
        setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void addComponents() {
        setLayout(new GridLayout(1,2));
        add(lcanvas);
        add(rcanvas);
    }
    public void paint(Graphics g) {
        lcanvas.repaint();
        rcanvas.repaint();
    }
}


class LeftCanvas extends Canvas {
    public LeftCanvas() {
        super();
    }
    public void paint (Graphics g) {
        g.setColor(Color.red);
        g.fillOval(10,10,50,50);
    }
}
class RightCanvas extends Canvas {
    public RightCanvas() {
        super();
    }
    public void paint (Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(10,10,50,50);
    }
}
