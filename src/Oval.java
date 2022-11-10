import java.awt.*;

public class Oval {
    private double x;
    private double y;

    public Oval(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void paint(Graphics g){
        g.drawOval((int)(x - 5), (int)(y - 5), 10, 10);
    }
}
