import java.awt.*;
import java.awt.event.*;

public class SimpleAWT implements ActionListener {
    Frame f;
    Button b;
    Label l;

    SimpleAWT() {
        f = new Frame("Simple AWT Example");
        b = new Button("Click Me");
        l = new Label("Waiting for button click...");

        f.setLayout(new FlowLayout());
        f.add(b);
        f.add(l);

        b.addActionListener(this);

        f.setSize(300, 150);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new SimpleAWT();
    }
}