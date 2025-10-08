import java.util.List;
import java.util.Scanner;

public class FinanceModule {

    public static void listAll() {
        System.out.println("\n--- All Finance Records ---");
        for (Finance f : DataStore.finances) {
            f.display();
        }
    }

    public static void filterByType(Scanner sc) {
        System.out.print("Enter Finance Type to filter (e.g., Salary, Project Payment): ");
        String type = sc.nextLine().trim().toLowerCase();

        List<Finance> list = DataStore.finances.stream()
            .filter(f -> f.getType().toLowerCase().equals(type))
            .toList();

        if (list.isEmpty()) {
            System.out.println("No records found for type: " + type);
        } else {
            System.out.println("Finance records of type '" + type + "':");
            list.forEach(Finance::display);
        }
    }

    public static void addFinanceRecord(Scanner sc) {
        System.out.println("\n--- Add Finance Record ---");
        System.out.print("Type: ");
        String type = sc.nextLine();
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Description: ");
        String description = sc.nextLine();
        System.out.print("Date (dd/mm/yyyy): ");
        String date = sc.nextLine();

        Finance record = new Finance(type, amount, description, date);
        DataStore.finances.add(record);
        System.out.println("Finance record added successfully.");
    }
}
