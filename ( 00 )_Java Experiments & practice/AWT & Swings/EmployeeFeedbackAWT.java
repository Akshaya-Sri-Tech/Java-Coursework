import java.awt.*;
import java.awt.event.*;

class EmployeeFeedbackAWT extends Frame implements ActionListener {
    TextField empName, empId;
    TextArea feedback;
    List department;
    Checkbox excellent, good, average;
    Checkbox teamwork, communication, punctuality;
    Button submitBtn, clearBtn;
    CheckboxGroup ratingGroup;

    EmployeeFeedbackAWT() {
        setTitle("Employee Feedback Form");
        setSize(350, 520);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(new Label("Name:"));
        add(empName = new TextField(20));
        add(new Label("Employee ID:"));
        add(empId = new TextField(20));
        add(new Label("Department:"));

        department = new List(3);
        for (String d : new String[] {"CSE", "IT", "ECE", "EEE", "HR"})
            department.add(d);
        add(department);

        ratingGroup = new CheckboxGroup();
        excellent = new Checkbox("Excellent", ratingGroup, false);
        good = new Checkbox("Good", ratingGroup, false);
        average = new Checkbox("Average", ratingGroup, false);

        add(excellent);
        add(good);
        add(average);

        add(teamwork = new Checkbox("Teamwork"));
        add(communication = new Checkbox("Communication"));
        add(punctuality = new Checkbox("Punctuality"));

        add(new Label("Comments:"));
        add(feedback = new TextArea(4, 20));

        submitBtn = new Button("Submit");
        clearBtn = new Button("Clear");

        add(submitBtn);
        add(clearBtn);

        submitBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setVisible(true);
    }

    void showMessage(String msg) {
        final Dialog d = new Dialog(this, "Feedback", true);
        d.setLayout(new FlowLayout());
        TextArea ta = new TextArea(msg, 9, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta.setEditable(false);
        Button ok = new Button("OK");
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                d.dispose();
            }
        });
        d.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                d.dispose();
            }
        });
        d.add(ta);
        d.add(ok);
        d.setSize(320, 260);
        d.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            String rating = excellent.getState() ? "Excellent" 
                          : good.getState() ? "Good" 
                          : average.getState() ? "Average" : "Not selected";

            showMessage( 
                "Name: " + empName.getText() + 
                "\nID: " + empId.getText() + 
                "\nDepartment: " + department.getSelectedItem() + 
                "\nRating: " + rating + 
                "\nTeamwork: " + teamwork.getState() + 
                "\nCommunication: " + communication.getState() + 
                "\nPunctuality: " + punctuality.getState() + 
                "\nComments: " + feedback.getText()
            );
        } else {
            empName.setText("");
            empId.setText("");
            feedback.setText("");
            if (department.getSelectedIndex() != -1)
                department.deselect(department.getSelectedIndex());
            ratingGroup.setSelectedCheckbox(null);
            teamwork.setState(false);
            communication.setState(false);
            punctuality.setState(false);
        }
    }

    public static void main(String[] args) {
        new EmployeeFeedbackAWT();
    }
}