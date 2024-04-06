package pluralsight.adapter;

import pluralsight.adapter.model.Employee;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);

    }

}
