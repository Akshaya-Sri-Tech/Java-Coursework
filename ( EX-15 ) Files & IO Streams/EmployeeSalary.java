/*Employee Salary Processing
Store employee details in a file: ID, Name, Basic Salary.
Read the file and calculate HRA, DA, and Gross Salary.
Write the processed details into a new file.
Display the employee with the highest gross salary.*/
import java.io.*;

public class EmployeeSalary {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("EmployeeData.txt"));
            FileWriter resultWriter = new FileWriter("salary_report.txt");
            resultWriter.write("ID,Name,Basic,HRA,DA,Gross Salary\n");

            String line;
            String highestEarnerName = "";
            double highestGrossSalary = 0.0;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                String id = tokens[0];
                String name = tokens[1];
                double basicSalary = Double.parseDouble(tokens[2]);

                // Calculate allowances (Assuming HRA = 20% and DA = 50% of Basic)
                double hra = basicSalary * 0.20;
                double da = basicSalary * 0.50;
                double grossSalary = basicSalary + hra + da;

                // Write the full processed data to the new report file
                resultWriter.write(id + "," + name + "," + basicSalary + "," + hra + "," + da + "," + grossSalary + "\n");

                // Check if this employee has the highest gross salary
                if (grossSalary > highestGrossSalary) {
                    highestGrossSalary = grossSalary;
                    highestEarnerName = name;
                }
            }
            
            reader.close();
            resultWriter.close();

            System.out.println("Highest Paid Employee: " + highestEarnerName);
            System.out.println("Gross Salary: " + highestGrossSalary);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }    
}
