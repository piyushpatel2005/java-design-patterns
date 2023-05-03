package pluralsight.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int id; // datatype different
    // Fields names are different
    private String firstname;
    private String lastname;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");

        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements())
            firstname = tokenizer.nextToken();
        if (tokenizer.hasMoreElements())
            lastname = tokenizer.nextToken();
        if (tokenizer.hasMoreElements())
            emailAddress = tokenizer.nextToken();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "EmployeeCSV{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
