import java.awt.*;
import javax.swing.*;

public class blayout1 extends JFrame {

    blayout1() {
        JButton b1 = new JButton("First");
        JButton b2 = new JButton("Second");
        JButton b3 = new JButton("Third");
        JButton b4 = new JButton("Fourth");

        setLayout(new BorderLayout());

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        blayout1 b = new blayout1();
    }
}

 
