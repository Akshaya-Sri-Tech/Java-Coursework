import java.sql.*;
import java.util.Scanner;

public class EmployeePayRoll {
    static String url = "jdbc:mysql://localhost:3306/employee_db";
    static String user = "root";
    static String password = "1234@abcd";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // 1
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to employee_db successfully!");
            String createTable = "CREATE TABLE IF NOT EXISTS employee (" +
                    "emp_id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "emp_name VARCHAR(50) NOT NULL, " +
                    "designation VARCHAR(50) NOT NULL, " +
                    "salary FLOAT NOT NULL, " +
                    "department VARCHAR(50) NOT NULL)";
            PreparedStatement ps = con.prepareStatement(createTable);
            ps.executeUpdate();
            System.out.println("Employee table ready.");
            int choice;
            do {
                System.out.println("\n===== EMPLOYEE PAYROLL SYSTEM =====");
                System.out.println("1. Insert Employee Records");
                System.out.println("2. Display Employees Earning More Than 50000");
                System.out.println("3. Increase IT Employee Salary by 10%");
                System.out.println("4. Delete Unassigned Employees");
                System.out.println("5. Display All Employees");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        insertEmployees(con);   break;
                    case 2:
                        displayHighSalaryEmployees(con);    break;
                    case 3:
                        increaseITSalary(con);  break;
                    case 4:
                        deleteUnassignedEmployees(con);  break;
                    case 5:
                        displayAllEmployees(con);  break;
                    case 6:
                        System.out.println("Exiting...");  break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 6);

            con.close();
            sc.close();

        } catch (SQLException e) {
            System.out.println("Database error!");
            e.printStackTrace();
        }
    }

    // 2
    static void insertEmployees(Connection con) {
        String sql = "INSERT INTO employee " +
                "(emp_name, designation, salary, department) " +
                "VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "John Doe");
            ps.setString(2, "Manager");
            ps.setFloat(3, 75000);
            ps.setString(4, "HR");
            ps.executeUpdate();

            ps.setString(1, "Priya Sharma");
            ps.setString(2, "Engineer");
            ps.setFloat(3, 55000);
            ps.setString(4, "IT");
            ps.executeUpdate();

            ps.setString(1, "Kumar Reddy");
            ps.setString(2, "Analyst");
            ps.setFloat(3, 50000);
            ps.setString(4, "Finance");
            ps.executeUpdate();

            ps.setString(1, "Anita Singh");
            ps.setString(2, "Technician");
            ps.setFloat(3, 40000);
            ps.setString(4, "Operations");
            ps.executeUpdate();

            ps.setString(1, "Rahul Kumar");
            ps.setString(2, "Developer");
            ps.setFloat(3, 60000);
            ps.setString(4, "IT");
            ps.executeUpdate();

            System.out.println("5 employee records inserted successfully!");
        } catch (SQLException e) {
            System.out.println("Error inserting employees!");
            e.printStackTrace();
        }
    }

    // 3
    static void displayHighSalaryEmployees(Connection con) {
        String sql = "SELECT * FROM employee WHERE salary > ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, 50000);
            ResultSet rs = ps.executeQuery();
            System.out.println("\nEmployees earning more than 50000:");
            System.out.println("---------------------------------------------");
            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("emp_id") +
                        ", Name: " + rs.getString("emp_name") +
                        ", Designation: " + rs.getString("designation") +
                        ", Salary: " + rs.getFloat("salary") +
                        ", Department: " + rs.getString("department")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving employees!");
            e.printStackTrace();
        }
    }

    // 4
    static void increaseITSalary(Connection con) {
        String sql = "UPDATE employee " +
                "SET salary = salary * 1.10 " +
                "WHERE department = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "IT");
            int rows = ps.executeUpdate();
            System.out.println(rows +
                    " IT employee salary/salaries increased by 10%.");
        } catch (SQLException e) {
            System.out.println("Error updating salary!");
            e.printStackTrace();
        }
    }

    // 5
    static void deleteUnassignedEmployees(Connection con) {
        String sql = "DELETE FROM employee WHERE department = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "");
            int rows = ps.executeUpdate();
            System.out.println(rows +" unassigned employee(s) deleted.");
        } catch (SQLException e) {
            System.out.println("Error deleting employees!");
            e.printStackTrace();
        }
    }

    // Display
    static void displayAllEmployees(Connection con) {
        String sql = "SELECT * FROM employee";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            System.out.println("\n========== ALL EMPLOYEES ==========");
            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("emp_id") +
                        ", Name: " + rs.getString("emp_name") +
                        ", Designation: " + rs.getString("designation") +
                        ", Salary: " + rs.getFloat("salary") +
                        ", Department: " + rs.getString("department")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error displaying employees!");
            e.printStackTrace();
        }
    }
}