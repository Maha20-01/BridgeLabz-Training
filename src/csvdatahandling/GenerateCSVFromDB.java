package csvdatahandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;

public class GenerateCSVFromDB {

    public static void main(String[] args) {

        // H2 in-memory database
        String url = "jdbc:h2:mem:testdb";
        String user = "sa";
        String password = "";

        try (
                Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement()
        ) {

            // 1️⃣ Create table
            stmt.execute(
                    "CREATE TABLE employee (" +
                            "emp_id INT, name VARCHAR(50), " +
                            "department VARCHAR(50), salary DOUBLE)"
            );

            // 2️⃣ Insert sample data
            stmt.executeUpdate(
                    "INSERT INTO employee VALUES " +
                            "(101,'Maha','IT',50000)," +
                            "(102,'Ravi','HR',45000)," +
                            "(103,'Anu','Finance',60000)"
            );

            // 3️⃣ Fetch data
            ResultSet rs = stmt.executeQuery(
                    "SELECT emp_id, name, department, salary FROM employee"
            );

            // 4️⃣ Write to CSV
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("employees_report.csv")
            );

            // Header
            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            // Data rows
            while (rs.next()) {
                bw.write(
                        rs.getInt("emp_id") + "," +
                                rs.getString("name") + "," +
                                rs.getString("department") + "," +
                                rs.getDouble("salary")
                );
                bw.newLine();
            }

            bw.close();

            System.out.println("CSV report generated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
