package com.github.piyushpatel2005.singleton.database;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        DBConnection instance = DBConnection.getInstance();

        System.out.println(instance);
        Connection conn = instance.getConnection();
        Statement statement;

        try {
            statement = conn.createStatement();
            int count = statement.executeUpdate("CREATE TABLE Person (id INT, firstName VARCHAR(20), lastName VARCHAR(20))");

            System.out.println("Table created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        conn = instance.getConnection();

        System.out.println(conn);

        try {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO Person (id, firstName, lastName) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "John");
            preparedStatement.setString(3, "Doe");
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * from Person");

            while(rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + " First Name: " + rs.getString(2) + " Last Name: " + rs.getString(3));
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
