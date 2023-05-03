package pluralsight.memento;

import java.io.*;

public class MementoSimpleDemo {

    private static Employee deserialize() {
        Employee emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return emp;
    }

    private static void serialize(Employee emp) {

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.setName("Tech Programmer");
        emp.setAddress("111 Node St.");
        emp.setPhone("888-555-4444");

        serialize(emp);

        Employee newEmp = deserialize();

        System.out.println(newEmp.getName());
    }
}
