import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Array;
import java.util.ArrayList;

public class MyFrame extends JFrame implements MouseListener {
    ArrayList<Oval> ovals;
    MyFrame(ArrayList<Oval> ovals) {
        this.setSize(640, 480);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.ovals = ovals;
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        for (Oval oval : ovals){
            oval.paint(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");
        Oval oval = new Oval(e.getX(), e.getY());
        ovals.add(oval);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited");
    }
}

