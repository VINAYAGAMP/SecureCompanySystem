import java.util.Scanner;

public class PolicyModule {

    // List all policies
    public static void listAll() {
        System.out.println("\n--- All Company Policies ---");
        for (Policy p : DataStore.policies) {
            p.display();
        }
    }

    // Search policies by title
    public static void searchByTitle(Scanner sc) {
        System.out.print("Enter Policy Title to search: ");
        String inputTitle = sc.nextLine().trim().toLowerCase();

        boolean found = false;
        for (Policy p : DataStore.policies) {
            if (p != null && p.getTitle() != null &&
                p.getTitle().toLowerCase().contains(inputTitle)) {
                System.out.println("Match found:");
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching policy found.");
        }
    }

    // Add a new policy
    public static void addPolicy(Scanner sc) {
        System.out.println("\n--- Add New Policy ---");
        System.out.print("Enter Title: ");
        String title = sc.nextLine().trim();
        System.out.print("Enter Description: ");
        String description = sc.nextLine().trim();

        Policy newPolicy = new Policy(title, description);
        DataStore.policies.add(newPolicy);
        System.out.println("Policy added successfully.");
    }
}
