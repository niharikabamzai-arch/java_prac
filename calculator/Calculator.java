import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener {

    TextField t1, t2, result;
    Button add, sub, mul, div;

    Calculator() {

        setTitle("My Calculator");
        setSize(400, 300);
        setLayout(new FlowLayout());

        t1 = new TextField(10);
        t2 = new TextField(10);
        result = new TextField(10);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        setBackground(Color.LIGHT_GRAY);

        result.setBackground(Color.YELLOW);

        add.setBackground(Color.GREEN);
        sub.setBackground(Color.ORANGE);
        mul.setBackground(Color.CYAN);
        div.setBackground(Color.PINK);

        add(t1);
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if (e.getSource() == add) {
            result.setText("" + (a + b));
        }
        else if (e.getSource() == sub) {
            result.setText("" + (a - b));
        }
        else if (e.getSource() == mul) {
            result.setText("" + (a * b));
        }
        else if (e.getSource() == div) {
            result.setText("" + (a / b));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}