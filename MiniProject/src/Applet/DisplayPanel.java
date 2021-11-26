package Applet;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;


public class DisplayPanel extends JPanel {

    JFrame frame = new JFrame();
    int height, width;
    Color color;
    Transition transition;
    Shapes shapes;
    Timer timer;

    public DisplayPanel() {
        frame.setTitle("Transition Output");
        frame.setBackground(Color.white);
        frame.add(this);
        frame.setBounds(300, 300, 400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setdetails(Transition transition, int height, int width, Shapes shapes) {
        this.transition = transition;
        this.height = height;
        this.width = width;
        this.shapes = shapes;
        timer = new Timer();
        timer.schedule(new Taskscheduler(), 100, 1000);
    }

    public void setdetails(Transition transition, int height, int width, Color color) {
        this.transition = transition;
        this.height = height;
        this.width = width;
        this.color = color;
        timer = new Timer();
        timer.schedule(new Taskscheduler(), 100, 1000);
    }

    public void setDetails(Transition transition, Shapes shapes, Color color) {
        this.transition = transition;
        this.color = color;
        this.shapes = shapes;
        timer = new Timer();
        timer.schedule(new Taskscheduler(), 100, 1000);
    }

    @Override
    public void paint(Graphics graphics) {
        if (transition != null) {
            switch (transition) {
                case COLOR:
                    int r,
                     g,
                     b;
                    r = (int) (Math.floor(Math.random() * 256));
                    g = (int) (Math.floor(Math.random() * 256));
                    b = (int) (Math.floor(Math.random() * 256));
                    graphics.setColor(new Color(r, g, b));
                    drawGraphics(graphics);

                    
                    break;

                case SHAPE:

                    graphics.setColor(color);
                    shapes = Shapes.values()[new Random().nextInt(Shapes.values().length)];
                    drawGraphics(graphics);


                    break;

                case SIZE:
                    height = (int) (Math.floor(Math.random() * 325));
                    width = (int) (Math.floor(Math.random() * 325));
                    graphics.setColor(color);
                    drawGraphics(graphics);
                    break;

                default:
                    break;
            }
        }

    }

    private void drawGraphics(Graphics graphics) {
        if (shapes != null) {
            switch (shapes) {
                case Circle:
                    graphics.fillOval(50, 50, width, height);
                    break;
                case Triangle:
                    int x[] = {50 + width / 2, 50, 50 + width,};
                    int y[] = {50, 50 + height, 50 + height};
                    graphics.fillPolygon(x, y, 3);
                    break;
                case Rectangle:
                    graphics.fillRect(50, 50, width, height);
                    break;
                default:
                    break;
            }
        }
    }

    public void stop() {
        timer.cancel();
    }

    class Taskscheduler extends TimerTask {

        @Override
        public void run() {
            frame.repaint();
        }
    }
}
