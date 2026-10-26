import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTExample extends Frame implements ActionListener{
    Button b;
    Label l;

    AWTExample(){
    //    f = new JFrame("Sample");
        b = new Button("Click me");
        l = new Label("Hello AWT");
        add(b); add(l);
        b.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(350,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        l.setText("Button clicked");
    }
    public static void main(String[] args) {
        AWTExample awtExample = new AWTExample();
    }
}