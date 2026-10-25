import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EmployeeFeedback extends JFrame implements ActionListener {
    JTextField empName, empId;
    JTextArea feedback;
    JList<String> department;
    JRadioButton excellent, good, average;
    JCheckBox teamwork, communication, punctuality;
    JButton submitBtn, clearBtn;
    ButtonGroup ratingGroup;

    EmployeeFeedback() {
        setTitle("Employee Feedback Form");
        setSize(350, 520);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Name:"));
        add(empName = new JTextField(20));
        add(new JLabel("Employee ID:"));
        add(empId = new JTextField(20));
        add(new JLabel("Department:"));

        department = new JList<>(new String[] {"CSE", "IT", "ECE", "EEE", "HR"});
        department.setVisibleRowCount(3);
        add(new JScrollPane(department));

        excellent = new JRadioButton("Excellent");
        good = new JRadioButton("Good");
        average = new JRadioButton("Average");
        
        ratingGroup = new ButtonGroup();
        ratingGroup.add(excellent);
        ratingGroup.add(good);
        ratingGroup.add(average);

        add(excellent);
        add(good);
        add(average);

        add(teamwork = new JCheckBox("Teamwork"));
        add(communication = new JCheckBox("Communication"));
        add(punctuality = new JCheckBox("Punctuality"));

        add(new JLabel("Comments:"));
        add(new JScrollPane(feedback = new JTextArea(4, 20)));

        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");

        add(submitBtn);
        add(clearBtn);

        submitBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            String rating = excellent.isSelected() ? "Excellent" 
                          : good.isSelected() ? "Good" 
                          : average.isSelected() ? "Average" : "Not selected";

            JOptionPane.showMessageDialog(this, 
                "Name: " + empName.getText() + 
                "\nID: " + empId.getText() + 
                "\nDepartment: " + department.getSelectedValue() + 
                "\nRating: " + rating + 
                "\nTeamwork: " + teamwork.isSelected() + 
                "\nCommunication: " + communication.isSelected() + 
                "\nPunctuality: " + punctuality.isSelected() + 
                "\nComments: " + feedback.getText()
            );
        } else {
            empName.setText("");
            empId.setText("");
            feedback.setText("");
            department.clearSelection();
            ratingGroup.clearSelection();
            teamwork.setSelected(false);
            communication.setSelected(false);
            punctuality.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new EmployeeFeedback();
    }
}