public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String role;
    private String status;

    public Employee(int id, String name, String department, double salary, String role, String status) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.role = role;
        this.status = status;
    }

    public void display() {
        System.out.println(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Department: " + department +
               ", Salary: ₹" + salary +
               ", Role: " + role +
               ", Status: " + status;
    }
}
