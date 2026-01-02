package com.jdbc54;

import java.sql.*;

public class selectExample {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/s54";
        String username = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);

        String query = "SELECT empid, ename FROM employee";
        PreparedStatement pst = con.prepareStatement(query);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            System.out.println(
                "Empid: " + rs.getInt("empid") +
                " EmpName: " + rs.getString("ename")
            );
        }

        con.close();
    }
}
