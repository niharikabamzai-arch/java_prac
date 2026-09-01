import java.awt.*;
import javax.swing.*;

public class glayout1 extends JFrame {

    glayout1() {
        JButton b1 = new JButton("First");
        JButton b2 = new JButton("Second");
        JButton b3 = new JButton("Third");
        JButton b4 = new JButton("Fourth");

        setLayout(new GridLayout(2, 2));

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        glayout1 g = new glayout1();
    }
}