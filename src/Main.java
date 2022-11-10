import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Oval> ovals = new ArrayList<Oval>();
        MyFrame frame = new MyFrame(ovals);
        while (true){
            frame.repaint();
        }
    }
}
