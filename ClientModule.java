import java.util.List;
import java.util.Scanner;

public class ClientModule {

    public static void searchByName(Scanner sc) {
        System.out.print("Enter Client Name to search: ");
        String name = sc.nextLine().trim().toLowerCase();

        for (Client c : DataStore.clients) {
            if (c.getName().toLowerCase().contains(name)) {
                System.out.println("Match found:");
                c.display();
            }
        }
    }

    public static void searchByCompany(Scanner sc) {
        System.out.print("Enter Company Name to search: ");
        String company = sc.nextLine().trim().toLowerCase();

        for (Client c : DataStore.clients) {
            if (c.getCompany().toLowerCase().contains(company)) {
                System.out.println("Match found:");
                c.display();
            }
        }
    }

    public static void listAll() {
        System.out.println("\n--- All Clients ---");
        for (Client c : DataStore.clients) {
            c.display();
        }
    }

    public static void addClient(Scanner sc) {
        System.out.println("\n--- Add New Client ---");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Company: ");
        String company = sc.nextLine();
        System.out.print("Contact: ");
        String contact = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Client newClient = new Client(name, company, contact, email);
        DataStore.clients.add(newClient);
        System.out.println("Client added successfully.");
    }
}
