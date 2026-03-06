package handsOn;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.*;
import java.util.*;

public class DatabaseJSONReport {

    public static void main(String[] args) throws Exception {

        Connection con =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test",
                        "root",
                        "Maha@1234"
                );

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM users");

        List<Map<String,Object>> list = new ArrayList<>();

        while(rs.next()) {

            Map<String,Object> map = new HashMap<>();

            map.put("id", rs.getInt("id"));
            map.put("name", rs.getString("name"));
            map.put("age", rs.getInt("age"));

            list.add(map);
        }

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(
                new java.io.File("src/main/resources/handsondb-report.json"),
                list
        );

        System.out.println("JSON report generated");
    }
}