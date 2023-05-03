package pluralsight.adapter;

// We have two soures of employee objects. DB and LDAP.
// Both have different naming conventions for their fields
public interface Employee {
    public String getId();
    public String getFirstName();
    public String getLastName();
    public String getEmail();
}
