import java.util.Scanner;

public class HRDashboard {

    public static void show(Scanner sc, String email) {
        while (true) {
            System.out.println("\n--- HR Dashboard ---");
            System.out.println("1. View Employees");
            System.out.println("2. Add Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> viewEmployees();
                case 2 -> addEmployee(sc);
                case 3 -> updateEmployee(sc);
                case 4 -> removeEmployee(sc);
                case 5 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void viewEmployees() {
        System.out.println("\n--- Employee List ---");
        for (Employee e : DataStore.employees) {
            e.display();
        }
    }

    private static void addEmployee(Scanner sc) {
        System.out.println("\n--- Add New Employee ---");
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Role: ");
        String role = sc.nextLine();
        System.out.print("Status: ");
        String status = sc.nextLine();

        Employee newEmp = new Employee(id, name, dept, salary, role, status);
        DataStore.employees.add(newEmp);
        System.out.println("Employee added successfully.");
    }

    private static void updateEmployee(Scanner sc) {
        System.out.print("\nEnter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : DataStore.employees) {
            if (e.getId() == id) {
                System.out.print("New Department: ");
                e.setDepartment(sc.nextLine());
                System.out.print("New Salary: ");
                e.setSalary(sc.nextDouble());
                sc.nextLine();
                System.out.print("New Role: ");
                e.setRole(sc.nextLine());
                System.out.print("New Status: ");
                e.setStatus(sc.nextLine());
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void removeEmployee(Scanner sc) {
        System.out.print("\nEnter Employee ID to remove: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean removed = DataStore.employees.removeIf(e -> e.getId() == id);
        if (removed) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
