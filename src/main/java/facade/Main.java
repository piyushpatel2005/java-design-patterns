package facade;

import java.util.List;

// This demo looks much simpler compared to JdbcDemo class as a client
public class Main {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        System.out.println("Table created");

        jdbcFacade.insertIntoTable();
        System.out.println("Record inserted");

        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address address: addresses) {
            System.out.println(address);
        }
    }
}
