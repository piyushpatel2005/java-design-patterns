package singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
//        ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
//
//        System.out.println(instance);
//
//        ThreadSafeSingleton anotherInstance = ThreadSafeSingleton.getInstance();
//
//        System.out.println(anotherInstance);


        DbSingleton instance = DbSingleton.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        System.out.println(instance);

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement statement;

        try {
            statement = conn.createStatement();
            int count = statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        // performance benefits
        System.out.println(timeAfter - timeBefore);


        System.out.println(conn);

        try {
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * from Address");

            System.out.println(rs);
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
