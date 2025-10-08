import java.util.Scanner;

public class FounderDashboard {

    public static void show(Scanner sc, String email) {
        while (true) {
            System.out.println("\n--- Founder Dashboard ---");
            System.out.println("1. View Employees");
            System.out.println("2. View Clients");
            System.out.println("3. View Projects");
            System.out.println("4. View Finance");
            System.out.println("5. View Policies");
            System.out.println("6. Logout");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> viewEmployees();
                case 2 -> viewClients();
                case 3 -> viewProjects();
                case 4 -> viewFinance();
                case 5 -> viewPolicies();
                case 6 -> {
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

    private static void viewClients() {
        System.out.println("\n--- Client List ---");
        for (Client c : DataStore.clients) {
            c.display();
        }
    }

    private static void viewProjects() {
        System.out.println("\n--- Project List ---");
        for (Project p : DataStore.projects) {
            p.display();
        }
    }

    private static void viewFinance() {
        System.out.println("\n--- Finance Records ---");
        for (Finance f : DataStore.finances) {
            f.display();
        }
    }

    private static void viewPolicies() {
        System.out.println("\n--- Company Policies ---");
        for (Policy p : DataStore.policies) {
            p.display();
        }
    }
}
