package pluralsight.adapter;

import pluralsight.adapter.csv.EmployeeAdapterCSV;
import pluralsight.adapter.ldap.EmployeeAdapterLdap;
import pluralsight.adapter.model.Employee;
import pluralsight.adapter.model.EmployeeCSV;
import pluralsight.adapter.model.EmployeeDB;
import pluralsight.adapter.model.EmployeeLdap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@example.com");

        employees.add(employeeFromDB);

        // Below code doesn't work because EmployeeLdap doesn't implement Employee interface
//        Employee employeeFromLdap = new EmployeeLdap("blah", "Single", "Human", "single@example.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("blah", "Single", "Human", "single@example.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("123,Alex,Anderson,alex@example.com");

        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;

    }
}
