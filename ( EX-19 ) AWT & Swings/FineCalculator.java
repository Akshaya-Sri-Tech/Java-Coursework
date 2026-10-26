
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FineCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Fine Calculator");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblBookId = new JLabel("Book ID:");
        JTextField txtBookId = new JTextField();

        JLabel lblTitle = new JLabel("Book Title:");
        JTextField txtTitle = new JTextField();

        JLabel lblDays = new JLabel("Days Overdue:");
        JTextField txtDays = new JTextField();

        JButton btnCalculate = new JButton("Calculate Fine");
        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);

        panel.add(lblBookId);
        panel.add(txtBookId);

        panel.add(lblTitle);
        panel.add(txtTitle);

        panel.add(lblDays);
        panel.add(txtDays);

        panel.add(btnCalculate);
        panel.add(new JLabel(""));

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("Result"));
        resultPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        frame.setLayout(new BorderLayout(10, 10));
        frame.add(panel, BorderLayout.NORTH);
        frame.add(resultPanel, BorderLayout.CENTER);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int bookId = Integer.parseInt(txtBookId.getText());
                    String title = txtTitle.getText();
                    int daysOverdue = Integer.parseInt(txtDays.getText());

                    double fine;

                    if (daysOverdue <= 0) {
                        fine = 0;
                    } else if (daysOverdue <= 5) {
                        fine = daysOverdue * 1;
                    } else if (daysOverdue <= 10) {
                        fine = 5 + (daysOverdue - 5) * 2;
                    } else {
                        fine = 15 + (daysOverdue - 10) * 5;
                    }

                    resultArea.setText(
                        "Book ID: " + bookId + "\n" +
                        "Title: " + title + "\n" +
                        "Days Overdue: " + daysOverdue + "\n" +
                        "Fine: Rs. " + fine
                    );

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                        frame,
                        "Please enter valid numbers!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
