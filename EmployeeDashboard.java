import java.util.Scanner;

public class EmployeeDashboard {

    public static void show(Scanner sc, String email) {
        while (true) {
            System.out.println("\n--- Employee Dashboard ---");
            System.out.println("1. View My Profile");
            System.out.println("2. View Company Policies");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> viewProfile(email);
                case 2 -> viewPolicies();
                case 3 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void viewProfile(String email) {
        System.out.println("\n--- My Profile ---");
        for (Employee e : DataStore.employees) {
            if (e.getName().equalsIgnoreCase(getNameFromEmail(email))) {
                e.display();
                return;
            }
        }
        System.out.println("Profile not found.");
    }

    private static void viewPolicies() {
        System.out.println("\n--- Company Policies ---");
        for (Policy p : DataStore.policies) {
            p.display();
        }
    }

    private static String getNameFromEmail(String email) {
        return email.split("@")[0].replace('.', ' ').replace('_', ' ');
    }
}
