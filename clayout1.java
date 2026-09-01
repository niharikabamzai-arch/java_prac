import java.awt.*;
import javax.swing.*;

public class clayout1 extends JFrame {

    clayout1() {
        JButton b1 = new JButton("First");
        JButton b2 = new JButton("Second");
        JButton b3 = new JButton("Third");
        JButton b4 = new JButton("Fourth");

        setLayout(new CardLayout());

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        clayout1 c = new clayout1();
    }
}
