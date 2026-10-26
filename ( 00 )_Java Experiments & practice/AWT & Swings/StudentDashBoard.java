import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class StudentDashBoard_Page implements ActionListener{
    JFrame f = new JFrame("Student Details");
    JButton submit;
    JLabel Lname,Lmarks;
    JTextField name,marks;
    StudentDashBoard_Page(){
        Lname = new JLabel("Enter Your Name : ");
        Lmarks = new JLabel("Enter Your Marks : ");

        name = new JTextField(10);
        marks = new JTextField(10);

        submit = new JButton("Submit");

        f.setLayout(new FlowLayout());
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        submit.addActionListener(this);

        f.add(Lname);
        f.add(name);

        f.add(Lmarks);
        f.add(marks);

        f.add(new JLabel(" "));
        f.add(submit);
    }

    public void actionPerformed(ActionEvent e){
        String Sname=name.getText();
        int Smarks=Integer.parseInt(marks.getText());
        if(Smarks>=45)
            JOptionPane.showMessageDialog(f,"You Have Passed");
        else
            JOptionPane.showMessageDialog(f,"You Have Falied");
    }
}
public class StudentDashBoard{
    public static void main(String[] args) {
        new StudentDashBoard_Page();
    }
}

