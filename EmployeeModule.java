import java.util.List;
import java.util.Scanner;

public class EmployeeModule {

    public static void searchById(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : DataStore.employees) {
            if (e.getId() == id) {
                System.out.println("Employee found:");
                e.display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void searchByName(Scanner sc) {
        System.out.print("Enter Employee Name to search: ");
        String name = sc.nextLine().trim().toLowerCase();

        for (Employee e : DataStore.employees) {
            if (e.getName().toLowerCase().contains(name)) {
                System.out.println("Match found:");
                e.display();
            }
        }
    }

    public static void filterByDepartment(Scanner sc) {
        System.out.print("Enter Department to filter: ");
        String dept = sc.nextLine().trim().toLowerCase();

        List<Employee> list = DataStore.employees.stream()
            .filter(e -> e.getDepartment().toLowerCase().equals(dept))
            .toList();

        if (list.isEmpty()) {
            System.out.println("No employees found in department: " + dept);
        } else {
            System.out.println("Employees in " + dept + " department:");
            list.forEach(Employee::display);
        }
    }

    public static void listAll() {
        System.out.println("\n--- All Employees ---");
        for (Employee e : DataStore.employees) {
            e.display();
        }
    }
}
